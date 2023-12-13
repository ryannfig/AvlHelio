package questaocinco;
import javax.swing.JOptionPane;
public class QuestaoCinco {

    public static void main(String[] args) {
  
        // Criação da matriz
        int linhas = 5;
        int colunas = 6;
        int[][] matriz = criarMatriz(linhas, colunas);

        // Impressão da matriz
        imprimirMatriz(matriz);
    }

    // Método para criar a matriz conforme a descrição fornecida
    private static int[][] criarMatriz(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = Math.min(Math.min(i, j), Math.min(linhas - i - 1, colunas - j - 1)) + 1;
            }
        }

        return matriz;
    }

    // Método para imprimir a matriz
    private static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

    
