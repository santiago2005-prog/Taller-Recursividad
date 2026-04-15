package Recursividad;

import java.util.Scanner;

public class Ejercicio13 {

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el límite: ");
        int limite = sc.nextInt();

        System.out.println("Serie de Fibonacci:");

        int i = 0;
        while (true) {
            int valor = fibonacci(i);
            if (valor > limite) {
                break;
            }
            System.out.print(valor + " ");
            i++;
        }

    }
}