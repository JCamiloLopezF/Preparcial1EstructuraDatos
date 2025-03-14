package co.edu.uniquindio.poo.Compartidos.Recursividad;

/*
 Escribe una función recursiva que cuente cuántas veces aparece un número en un arreglo.
 MILO
 */

public class ConcurrenciasDeNumero {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 6, 1, 5, 6, 1, 8, 9, 6};
        System.out.println(contarCantidadNumeroEnArreglo(arreglo, 6, 0));
    }

    public static int contarCantidadNumeroEnArreglo(int[] arreglo, int numero, int i){
        if(i == arreglo.length){
            return 0;
        }
        if(arreglo[i]==numero){
            return 1 + contarCantidadNumeroEnArreglo(arreglo, numero, i + 1);
        }
        return contarCantidadNumeroEnArreglo(arreglo, numero, i+1);
    } 
}
