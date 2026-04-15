package Recursividad;

import java.util.Scanner;

public class Ejercicio5 {

    public static int suma(int numero) {
        if (numero == 1) {
            return 1;
        }
        return numero + suma(numero - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        int resultado = suma(numero);

        System.out.println("Sumatoria: " + resultado);

    }
}