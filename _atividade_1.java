package Java_Lista_10_Array_2;

import java.util.Scanner;

public class _atividade_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vect = new int[10];
        int sum = 0;

        System.out.println("Digite 10 números:");

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Número "+(i + 1)+": ");
            vect[i] = sc.nextInt();
            sum += vect[i];
        }

        double media = (double) sum / vect.length;

        System.out.println("Soma total: " + sum);
        System.out.println("Média aritmética: " + media);

        sc.close();
    }
}
