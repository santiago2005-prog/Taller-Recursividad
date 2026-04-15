package Recursividad;

import java.util.Scanner;

public class Ejercicio7 {

    public static int mcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        return mcd(n, m % n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int m = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int n = sc.nextInt();

        int resultado = mcd(m, n);

        System.out.println("MCD: " + resultado);

    }
} 