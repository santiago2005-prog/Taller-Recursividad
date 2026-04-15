package Recursividad;

import java.util.Scanner;

public class Ejercicio8 {

    public static String copiar(String texto) {
        if (texto.equals("")) {
            return "";
        }
        return texto.charAt(0) + copiar(texto.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String texto = sc.nextLine();

        String copia = copiar(texto);

        System.out.println("Cadena copiada: " + copia);
    }
}