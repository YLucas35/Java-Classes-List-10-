package Java_Lista_10_Array_2;

import java.util.Scanner;

public class _atividade_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] names = new String[10];

        System.out.println("Digite 10 nomes diferentes:");
        
        for (int i = 0; i < names.length; i++) {
            System.out.print((i + 1)+"° Nome: ");
            names[i] = sc.nextLine();
        }
        
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        sc.close();
    }
}
