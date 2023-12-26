package p3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pentru cate numere vreti sa afisati fibonnaci:");
        int n = input.nextInt();

        long termen1 = 0, termen2 = 1;

        System.out.println(termen1 );
        System.out.println(termen2);
        for (int i = 2; i <= n; i++) {
            long  termne3 = termen1 + termen2;
            if (termne3 < n) {
                System.out.println(termne3);
            }
            termen1 = termen2;
            termen2 = termne3;
        }
    }
}
