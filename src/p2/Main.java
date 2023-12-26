package p2;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void printPrimeNumbers(int[] array) {
        System.out.println("numerele prime  sunt:");
        for (int num : array) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("cate elemente adaugati: ");
        int lungime = scanner.nextInt();

        int[] numere = new int[lungime];


        for (int i = 0; i < lungime; i++) {
            System.out.print("elementul " + (i + 1) + ": ");
            numere[i] = scanner.nextInt();
        }
        printPrimeNumbers(numere);

        scanner.close();
    }
}



