import javax.swing.JOptionPane;

public class CompararMatrizes {
    public static void main(String[] args) {
        // Leitura das matrizes A e B
        double[][] matrizA = lerMatriz("Matriz A");
        double[][] matrizB = lerMatriz("Matriz B");

        // Criação e preenchimento da matriz C
        int linhas = matrizA.length;
        int colunas = matrizA[0].length;
        int[][] matrizC = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (existeNaMatriz(matrizA[i][j], matrizB)) {
                    matrizC[i][j] = 1;
                } else {
                    matrizC[i][j] = 0;
                }
            }
        }

        // Exibição da matriz C
        exibirMatriz("Matriz C", matrizC);
    }

    // Função para ler uma matriz real
    private static double[][] lerMatriz(String nomeMatriz) {
        double[][] matriz = new double[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                String valorString = JOptionPane.showInputDialog("Digite o valor para " + nomeMatriz + "[" + (i + 1) + "][" + (j + 1) + "]:");
                matriz[i][j] = Double.parseDouble(valorString);
            }
        }

        return matriz;
    }

    // Função para verificar se um valor existe em uma matriz
    private static boolean existeNaMatriz(double valor, double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == valor) {
                    return true;
                }
            }
        }
        return false;
    }

    // Função para exibir uma matriz de inteiros
    private static void exibirMatriz(String nomeMatriz, int[][] matriz) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                resultado.append(matriz[i][j]).append("\t");
            }
            resultado.append("\n");
        }

        JOptionPane.showMessageDialog(
                null,
                nomeMatriz + ":\n" + resultado.toString(),
                "Matriz Resultante",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
