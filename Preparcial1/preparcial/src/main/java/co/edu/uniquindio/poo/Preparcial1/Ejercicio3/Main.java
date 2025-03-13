package co.edu.uniquindio.poo.Preparcial1.Ejercicio3;

import java.util.List;

/*
 (1.0) Implementar un método genérico que reciba una lista de elementos comparables y
devuelva el máximo elemento en dicha lista. Usa la interfaz Comparable<T> para asegurar que
los elementos puedan ser comparados(no usar ciclos ni recursividad)
 */

public class Main {
    
    public static <T extends Comparable<T>> T maxElement(List<T> lista){
        return lista.stream().max(T::compareTo).orElse(null);
    }

    public static void main(String[] args) {
        List<Integer> listaEnteros = List.of(1, 2, 3, 4, 5);
        List<Double> listaDoubles = List.of(1.0, 2.0, 3.0, 4.0, 5.0);

        Integer maxEntero = maxElement(listaEnteros);
        Double maxDouble = maxElement(listaDoubles);
        System.out.println(maxEntero);
        System.out.println(maxDouble);
    }
}
