public class ArregloSalida {
    public static void main(String[] args) {
        int[][] arregloEntrada = {
                {1},
                {6, 3, 1},
                {1, 2, 3, 4},
                {0, 5, 3, 0},
                {2, 5, 9},
                {2, 4, 8, 9, 10}
        };

        // nuevo arreglo para guardar resultados
        int[][] arregloSalida = new int[arregloEntrada.length][];

        for (int i = 0; i < arregloEntrada.length; i++) {
            int[] fila = arregloEntrada[i];
            int n = fila.length;
            int[] nuevaFila = new int[n + 1]; // espacio extra

            // copiamos los elementos originales
            for (int j = 0; j < n; j++) {
                nuevaFila[j] = fila[j];
            }

            // par, suma primero + ultimo; impar, agrega 0
            if (n % 2 == 0) {
                nuevaFila[n] = fila[0] + fila[n - 1];
            } else {
                nuevaFila[n] = 0;
            }

            // guardamos nueva fila en arreglo salida
            arregloSalida[i] = nuevaFila;
        }

        // resultado
        for (int i = 0; i < arregloSalida.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < arregloSalida[i].length; j++) {
                System.out.print(arregloSalida[i][j]);
                if (j < arregloSalida[i].length - 1) System.out.print(", ");
            }
            System.out.println(" }");
        }
    }
}