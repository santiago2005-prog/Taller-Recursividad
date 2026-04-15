package Recursividad;

public class Ejercicio14 {

    public static int ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        }

        if (m > 0 && n == 0) {
            return ackermann(m - 1, 1);
        }

        return ackermann(m - 1, ackermann(m, n - 1));
    }

    public static void main(String[] args) {

        // Valores definidos directamente
        int m = 2;
        int n = 2;

        int resultado = ackermann(m, n);

        System.out.println("Resultado: " + resultado);
    }
}