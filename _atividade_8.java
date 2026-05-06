package Java_Lista_10_Array_2;

import java.util.Scanner;

public class _atividade_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[12];
        int aux;

        System.out.println("Digite 12 números inteiros:");
        for (int i = 0; i < 12; i++) {
            System.out.print("Posição ["+i+"]: ");
            vector[i] = sc.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            aux = vector[i];
            vector[i] = vector[i + 6];
            vector[i + 6] = aux;
        }

        System.out.println("Vetor após a troca das metades:");
        for (int i = 0; i < 12; i++) {
            System.out.print(i);
        }

        sc.close();
    }
}
