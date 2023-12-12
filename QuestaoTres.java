package questaotres;
import javax.swing.JOptionPane;
public class QuestaoTres {

    public static void main(String[] args) {
          // Definindo o tamanho do vetor
        int tamanhoVetor = 20;

        // Criando o vetor para armazenar os saldos
        double[] saldos = new double[tamanhoVetor];

        // Lendo os saldos das 20 salas de clientes
        for (int i = 0; i < tamanhoVetor; i++) {
            String input = JOptionPane.showInputDialog("Informe o saldo da sala " + (i + 1));
            
            // Convertendo o valor para double e armazenando no vetor
            saldos[i] = Double.parseDouble(input);
        }

        // Imprimindo os saldos com centavos
        StringBuilder output = new StringBuilder("Saldos com centavos:\n");
        for (int i = 0; i < tamanhoVetor; i++) {
            // Formatando o saldo para incluir centavos
            String saldoFormatado = String.format("%.2f", saldos[i]);
            output.append("Sala ").append(i + 1).append(": R$ ").append(saldoFormatado).append("\n");
        }

        // Exibindo os saldos utilizando JOptionPane
        JOptionPane.showMessageDialog(null, output.toString());

    }
    
}
