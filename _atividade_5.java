package Java_Lista_10_Array_2;

import java.util.Scanner;

public class _atividade_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vect = new int[10];
        int target;
        int location = -1;
        boolean found = false;
        
        System.out.println("Digite 10 números para preencher o vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Posição [" + i + "]: ");
            vect[i] = sc.nextInt();
        }
        
        System.out.print("Digite o número que deseja encontrar: ");
        target = sc.nextInt();
        
        for (int i = 0; i < 10; i++) {
            if (vect[i] == target) {
                found = true;
                location = i;
                break;
            }
        }
        
        if (found) {
            System.out.println("O número "+target+" foi encontrado no índice: "+location);
        } else {
            System.out.println("O número "+target+" não foi encontrado no vetor.");
        }
        
        sc.close();
    }
}
