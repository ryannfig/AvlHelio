package notasaluno;
import javax.swing.JOptionPane;
public class NotasAluno {

    public static void main(String[] args) {
        int numDisciplinas = 5;
        int numNotasPorDisciplina = 4;

        // Matriz para armazenar as notas do aluno (5 disciplinas x 4 notas)
        double[][] notasAluno = new double[numDisciplinas][numNotasPorDisciplina];

        // Preencher a matriz com as notas do aluno
        preencherNotas(notasAluno);

        // Encontrar a nota mais alta e a respectiva disciplina
        int disciplinaMaisAlta = -1;
        int notaMaisAlta = -1;

        for (int i = 0; i < numDisciplinas; i++) {
            for (int j = 0; j < numNotasPorDisciplina; j++) {
                if (notasAluno[i][j] > notaMaisAlta) {
                    notaMaisAlta = (int) notasAluno[i][j];
                    disciplinaMaisAlta = i + 1; // Disciplina é indexada a partir de 1
                }
            }
        }

        // Exibir resultado usando JOptionPane
        JOptionPane.showMessageDialog(
                null,
                "A nota mais alta foi " + notaMaisAlta + " na disciplina " + disciplinaMaisAlta,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    // Função para preencher a matriz de notas
    private static void preencherNotas(double[][] notas) {
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                String notaString = JOptionPane.showInputDialog("Digite a nota " + (j + 1) + " para a disciplina " + (i + 1) + ":");
                notas[i][j] = Double.parseDouble(notaString);
            }
        }
    }
}

    
