package Recursividad;

public class Ejercicio12 {

    public static int sumaMatriz(int[][] matriz, int i, int j, int filas, int columnas) {
        if (i == filas) {
            return 0;
        }

        if (j == columnas) {
            return sumaMatriz(matriz, i + 1, 0, filas, columnas);
        }

        return matriz[i][j] + sumaMatriz(matriz, i, j + 1, filas, columnas);
    }

    public static void main(String[] args) {

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int filas = matriz.length;
        int columnas = matriz[0].length;

        int resultado = sumaMatriz(matriz, 0, 0, filas, columnas);

        System.out.println("Suma total: " + resultado);
    }
}