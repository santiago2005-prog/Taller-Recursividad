package Recursividad;

import java.util.Scanner;

public class Ejercicio1 {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int n = sc.nextInt();

        System.out.println("El factorial de " + n + " es: " + factorial(n));

    }
}