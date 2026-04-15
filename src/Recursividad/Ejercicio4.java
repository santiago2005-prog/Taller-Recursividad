package Recursividad;

import java.util.Scanner;

public class Ejercicio4 {

    public static int sumarDigitos(int numero) {
        if (numero == 0) {
            return 0;
        }
        return (numero % 10) + sumarDigitos(numero / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        int resultado = sumarDigitos(numero);

        System.out.println("Suma de los dígitos: " + resultado);

    }
}