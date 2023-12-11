package questaodoisgit;
import javax.swing.JOptionPane;
public class QuestaoDoisGit {

    public static void main(String[] args) {
          int diasNoMes = 30; // Assumindo 30 dias em setembro
        int[] registrosDiarios = new int[diasNoMes];

        // Leitura dos registros diários
        for (int i = 0; i < diasNoMes; i++) {
            String input = JOptionPane.showInputDialog("Informe o número de carros para o dia " + (i + 1) + ":");
            registrosDiarios[i] = Integer.parseInt(input);
        }

        // Encontrar o dia com o maior volume
        int maiorVolume = registrosDiarios[0];
        int diaMaiorVolume = 1;

        // Encontrar o dia com o menor volume
        int menorVolume = registrosDiarios[0];
        int diaMenorVolume = 1;

        for (int i = 1; i < diasNoMes; i++) {
            // Verificar maior volume
            if (registrosDiarios[i] > maiorVolume) {
                maiorVolume = registrosDiarios[i];
                diaMaiorVolume = i + 1;
            }

            // Verificar menor volume
            if (registrosDiarios[i] < menorVolume) {
                menorVolume = registrosDiarios[i];
                diaMenorVolume = i + 1;
            }
        }

        // Exibir resultados
        JOptionPane.showMessageDialog(null,  "O maior volume de carros foi no dia " + diaMaiorVolume + 
                                      " com um total de " + maiorVolume + " carros.\n");
               
                      
        JOptionPane.showMessageDialog(null, "O menor volume de carros foi no dia " + diaMenorVolume +
                                      " com um total de " + menorVolume + " carros.");
                
    }
    
}
