package co.edu.uniquindio.poo.Preparcial1.Ejercicio9;

/*
 9. (1.0) Utilizando divide y vencerás realizar la multiplicación de un array de numeros (array[10])
Probar con este ejemplo: arreglo = {1,2,3,4,5,6,7,8,9,10}, realizar la ejecución de la pila
 */

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(multiplicarArray(array, 0, array.length - 1));
    }
    
    public static int multiplicarArray(int[] array, int inicio, int fin){
        if(inicio == fin){
            return array[inicio];
        }
        int mitad = (inicio + fin) / 2;
        return multiplicarArray(array, inicio, mitad) * multiplicarArray(array, mitad + 1, fin);
    }
}
