package Recursividad;

import java.util.Scanner;

public class Ejercicio10 {

    public static int multiplicar(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a + multiplicar(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();

        int resultado = multiplicar(a, b);

        System.out.println("Resultado: " + resultado);
    }
}