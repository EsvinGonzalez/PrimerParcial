import java.util.Arrays;

public class Binaria {

    public static int busquedaBinaria(int[] arreglo, int objetivo) {
        int comienzo = 0;
        int finalizacion = arreglo.length - 1;

        while (comienzo <= finalizacion) {
            int medio = comienzo + (finalizacion - comienzo) / 2;

            if (arreglo[medio] == objetivo) {
                return medio;
            }

            if (arreglo[medio] < objetivo) {
                comienzo = medio + 1;
            } else {
                finalizacion = medio - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arreglo = {3, 7, 11, 15, 19, 25, 30, 41, 55, 66};
        int objetivo = 25;

        int indice = busquedaBinaria(arreglo, objetivo);

        if (indice != -1) {
            System.out.println("El número " + objetivo + " se encuentra en el índice " + indice);
        } else {
            System.out.println("El número " + objetivo + " no se encuentra en el arreglo");
        }
    }
}