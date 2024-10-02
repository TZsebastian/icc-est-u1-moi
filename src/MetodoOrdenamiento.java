import java.util.Arrays;

public class MetodoOrdenamiento {
    

    public int[] sortByInsertion(int[] arreglo,boolean logs) {
        int tamanio = arreglo.length;
        for (int i = 1; i < tamanio; i++) {
            int key = arreglo[i];
            int j = i - 1;

            if (logs) {
            
                System.out.println("Pasada número " + i);
                System.out.println("\ti=" + i + ", j=" + j + ", [i]=" + arreglo[i]);
            }

            while (j >= 0 && arreglo[j] > key) {
                if (logs) {
                    System.out.println("\t\tComparamos " + key + " con " + arreglo[j]);
                }
                arreglo[j + 1] = arreglo[j];
                j--;

                if (logs) {
                    System.out.println("\t\t------- " + Arrays.toString(arreglo));
                }
            }
            arreglo[j + 1] = key;

            if (logs) {
                System.out.println("\t-------- " + Arrays.toString(arreglo));
            }
        }
        return arreglo;
    }
    public void printArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
