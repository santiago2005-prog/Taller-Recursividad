package Recursividad;

import java.util.Scanner;

public class Ejercicio9 {

    public static int division(int dividendo, int divisor) {
        if (dividendo < divisor) {
            return 0;
        }
        return 1 + division(dividendo - divisor, divisor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        int dividendo = sc.nextInt();

        System.out.print("Ingrese el divisor: ");
        int divisor = sc.nextInt();

        int resultado = division(dividendo, divisor);

        System.out.println("Cociente: " + resultado);

    }
}