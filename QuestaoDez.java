package quinzeprodutos;
import javax.swing.JOptionPane;
public class QuinzeProdutos {

   
    public static void main(String[] args) {

        // Solicitar ao usuário o número de cheques usados no mês
        int numCheques = obterNumeroCheques();

        // Verificar se o número de cheques é válido
        if (numCheques <= 0 || numCheques > 100) {
            JOptionPane.showMessageDialog(
                    null,
                    "Número de cheques inválido. Informe um número entre 1 e 100.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        // Ler os valores gastos em cheques
        double[] valoresCheques = lerValoresCheques(numCheques);

        // Exibir a lista de valores, o maior valor e o menor valor
        exibirResultados(valoresCheques);
    }

    // Função para obter o número de cheques do usuário
    private static int obterNumeroCheques() {
        String numChequesStr = JOptionPane.showInputDialog("Informe o número de cheques usados no mês:");
        return Integer.parseInt(numChequesStr);
    }

    // Função para ler os valores gastos em cheques
    private static double[] lerValoresCheques(int numCheques) {
        double[] valores = new double[numCheques];

        for (int i = 0; i < numCheques; i++) {
            String valorStr = JOptionPane.showInputDialog("Digite o valor do cheque " + (i + 1) + ":");
            valores[i] = Double.parseDouble(valorStr);
        }

        return valores;
    }

    // Função para exibir a lista de valores, o maior valor e o menor valor
    private static void exibirResultados(double[] valores) {
        StringBuilder listaValores = new StringBuilder();
        double maiorValor = valores[0];
        double menorValor = valores[0];

        for (double valor : valores) {
            listaValores.append(valor).append("\n");

            if (valor > maiorValor) {
                maiorValor = valor;
            }

            if (valor < menorValor) {
                menorValor = valor;
            }
        }

        JOptionPane.showMessageDialog(
                null,
                "Lista de valores:\n" + listaValores.toString() +
                        "\nMaior valor: " + maiorValor +
                        "\nMenor valor: " + menorValor,
                "Resultados",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
