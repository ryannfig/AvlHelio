# AvlHelio
Questões do livro Vilarim
import javax.swing.JOptionPane;

public class RegistrosVelocidadeSetembro {
    public static void main(String[] args) {
        int totalDias = 30; // Setembro tem 30 dias
        int[] registros = new int[totalDias];

        // Preencher o vetor com os registros de velocidade para cada dia
        for (int dia = 0; dia < totalDias; dia++) {
            String input = JOptionPane.showInputDialog("Informe a quantidade de carros no dia " + (dia + 1) + ":");
            try {
                registros[dia] = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, digite um número válido.");
                // Decrementar dia para repetir a leitura do mesmo dia
                dia--;
            }
        }

        // Encontrar o dia com mais carros
        int diaMaxCarros = 1; // Inicializa com o primeiro dia
        int maxCarros = registros[0];

        for (int dia = 1; dia < totalDias; dia++) {
            if (registros[dia] > maxCarros) {
                maxCarros = registros[dia];
                diaMaxCarros = dia + 1; // Adiciona 1 porque os dias começam em 1, não em 0
            }
        }

        // Exibir o resultado
        JOptionPane.showMessageDialog(null, "No dia " + diaMaxCarros + " do mês de setembro, passaram mais carros, totalizando " + maxCarros + " carros.");
    }
}

