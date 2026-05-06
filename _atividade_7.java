package Java_Lista_10_Array_2;

import java.util.Scanner;

public class _atividade_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] gabarito = {'A', 'B', 'C', 'D', 'E', 'A', 'B', 'C', 'D', 'E'};
        char[] respostasAluno = new char[10];
        int acertos = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Resposta da questão " + (i + 1) + ": ");
            respostasAluno[i] = sc.next().toUpperCase().charAt(0);
        }
        
        for (int i = 0; i < 10; i++) {
            if (respostasAluno[i] == gabarito[i]) {
                acertos++;
            }
        }
        
        System.out.println("O aluno acertou "+acertos+" de 10 questões.");

        double nota = acertos * 1.0;
        System.out.println("Nota: " + nota);

        sc.close();
    }
}
