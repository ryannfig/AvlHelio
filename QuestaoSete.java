package quinzeprodutos;
import javax.swing.JOptionPane;
public class QuinzeProdutos {

   
    public static void main(String[] args) {
        int quantidadeProdutos = 15;
        double[] precosInicioSemana = lerPrecos("preço inicial", quantidadeProdutos);
        double[] precosFimSemana = lerPrecos("preço final", quantidadeProdutos);

        double[] precosMedios = calcularPrecosMedios(precosInicioSemana, precosFimSemana);

        exibirPrecosMedios(precosMedios);
    }

    // Função para ler os preços de uma semana
    private static double[] lerPrecos(String momento, int quantidadeProdutos) {
        double[] precos = new double[quantidadeProdutos];

        for (int i = 0; i < quantidadeProdutos; i++) {
            String valorString = JOptionPane.showInputDialog("Digite o " + momento + " do produto " + (i + 1) + ":");
            precos[i] = Double.parseDouble(valorString);
        }

        return precos;
    }

    // Função para calcular os preços médios
    private static double[] calcularPrecosMedios(double[] precosInicioSemana, double[] precosFimSemana) {
        int quantidadeProdutos = precosInicioSemana.length;
        double[] precosMedios = new double[quantidadeProdutos];

        for (int i = 0; i < quantidadeProdutos; i++) {
            precosMedios[i] = (precosInicioSemana[i] + precosFimSemana[i]) / 2.0;
        }

        return precosMedios;
    }

    // Função para exibir os preços médios
    private static void exibirPrecosMedios(double[] precosMedios) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < precosMedios.length; i++) {
            resultado.append("Produto ").append(i + 1).append(": R$ ").append(precosMedios[i]).append("\n");
        }

        JOptionPane.showMessageDialog(
                null,
                "Preços Médios:\n" + resultado.toString(),
                "Listagem de Preços Médios",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}

   
