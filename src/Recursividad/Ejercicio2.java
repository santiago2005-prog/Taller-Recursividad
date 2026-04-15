package Recursividad;

import java.util.Scanner;

public class Ejercicio2 {

    public static int invertir(int numero, int resultado) {
        if (numero == 0) {
            return resultado;
        }
        return invertir(numero / 10, resultado * 10 + (numero % 10));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        int resultado = invertir(numero, 0);

        System.out.println("Número invertido: " + resultado);

    }
}