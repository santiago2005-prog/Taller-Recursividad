package Recursividad;

import java.util.Scanner;

public class Ejercicio11 {

    public static int sumaVector(int[] vector, int n) {
        if (n == 0) {
            return 0;
        }
        return vector[n - 1] + sumaVector(vector, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int n = sc.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }

        int resultado = sumaVector(vector, n);

        System.out.println("Suma total: " + resultado);

    }
}