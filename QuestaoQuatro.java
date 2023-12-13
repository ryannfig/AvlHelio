package questaoquatro;
import javax.swing.JOptionPane;
public class QuestaoQuatro {

  
    public static void main(String[] args) {
        // Tamanho da matriz A: 3x2
        int linhasA = 3;
        int colunasA = 2;

        // Tamanho da matriz B: 2x3
        int linhasB = 2;
        int colunasB = 3;

        // Matriz A
        int[][] matrizA = new int[linhasA][colunasA];
        JOptionPane.showMessageDialog(null, "Digite os elementos da matriz A:");

        preencherMatriz(matrizA);

        // Matriz B
        int[][] matrizB = new int[linhasB][colunasB];
        JOptionPane.showMessageDialog(null, "Digite os elementos da matriz B:");

        preencherMatriz(matrizB);

        // Verifica se é possível multiplicar as matrizes
        if (colunasA != linhasB) {
            JOptionPane.showMessageDialog(null, "Não é possível multiplicar as matrizes devido às dimensões incompatíveis.");
        } else {
            // Realiza a multiplicação das matrizes
            int[][] resultado = multiplicarMatrizes(matrizA, matrizB);

            // Imprime a matriz resultante
            JOptionPane.showMessageDialog(null, "Matriz Resultante:\n" + imprimirMatriz(resultado));
        }
    }

    // Método para preencher os elementos de uma matriz
    private static void preencherMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                String input = JOptionPane.showInputDialog("Elemento [" + (i + 1) + "][" + (j + 1) + "]:");
                matriz[i][j] = Integer.parseInt(input);
            }
        }
    }

    //  multiplicando duas matrizes
    private static int[][] multiplicarMatrizes(int[][] matrizA, int[][] matrizB) {
        int linhasA = matrizA.length;
        int colunasA = matrizA[0].length;
        int colunasB = matrizB[0].length;

        int[][] resultado = new int[linhasA][colunasB];

        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                for (int k = 0; k < colunasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return resultado;
    }

    // formatar a matriz como uma string
    private static String imprimirMatriz(int[][] matriz) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                result.append(matriz[i][j]).append("\t");
            }
            result.append("\n");
        }

        return result.toString();
    }
}

    
    

