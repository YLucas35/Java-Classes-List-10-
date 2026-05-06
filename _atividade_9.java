package Java_Lista_10_Array_2;

import java.util.Scanner;

public class _atividade_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letters = new char[15];
        int Vowels = 0;

        System.out.println("Digite 15 letras:");

        for (int i = 0; i < 15; i++) {
            System.out.print("Posição ["+i+"]: ");
            letters[i] = sc.next().toLowerCase().charAt(0);
        }

        for (int i = 0; i < 15; i++) {
            char c = letters[i];
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                Vowels++;
            }
        }

        System.out.println("Total de vogais digitadas: "+Vowels);

        sc.close();
    }
}
