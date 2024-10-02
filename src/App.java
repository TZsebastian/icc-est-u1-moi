public class App {
    public static void main(String[] args) throws Exception {
        MetodoOrdenamiento ordenar = new MetodoOrdenamiento();
        boolean logs;
        int[] arreglo = {-3,5,7,2,90,6};
        System.out.println("Arreglo ordenado");
        ordenar.printArreglo(arreglo);
        System.out.println();
        System.out.println("Arreglo ordenado con pasos o sin pasos");
        ordenar.sortByInsertion(arreglo,true );
        ordenar.printArreglo(arreglo);
    }
}
