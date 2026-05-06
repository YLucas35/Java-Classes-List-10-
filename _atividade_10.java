package Java_Lista_10_Array_2;

import java.util.Scanner;

public class _atividade_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] V = new int[10];
        int[] S = new int[10];
        int sumTemp = 0;

        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+"º numero: ");
            V[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            sumTemp += V[i];
            S[i] = sumTemp;
        }

        System.out.print("Vetor S: ");
        for (int num : S) {
            System.out.print(num);
        }

        sc.close();
    }
}
