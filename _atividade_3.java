package Java_Lista_10_Array_2;

import java.util.Random;

public class _atividade_3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vect1 = new int[20];
        int[] vect2 = new int[20];
        int contPares = 0;

        for (int i = 0; i < vect1.length; i++) {
            vect1[i] = random.nextInt(101);
            System.out.print(vect1[i] + " ");
        }

        for (int i = 0; i < vect1.length; i++) {
            if (vect1[i] % 2 == 0) {
                vect2[contPares] = vect1[i];
                contPares++;
            }
        }

        if (contPares == 0) {
            System.out.println("Nenhum número par foi gerado.");
        } else {
            for (int i = 0; i < contPares; i++) {
                System.out.print(vect2[i] + " ");
            }
        }
        System.out.println();
    }
}
