package Java_Lista_10_Array_2;

import java.util.Scanner;

public class _atividade_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vectorA = new int[10];
        int[] vectorB = new int[10];
        int x;

        System.out.println("Digite os 10 números do vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Posição ["+i+"]: ");
            vectorA[i] = sc.nextInt();
        }

        System.out.print("Digite o valor de X (multiplicador): ");
        x = sc.nextInt();

        System.out.println("Resultado do Vetor B (A * X):");
        for (int i = 0; i < 10; i++) {
            vectorB[i] = vectorA[i] * x;
            System.out.println("B["+i+"] = "+ vectorB[i]);
        }

        sc.close();
    }
}
