package co.edu.uniquindio.poo.Preparcial1.Ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 5. (1.0)Implementar un método genérico que reciba una List de cualquier tipo y devuelva una lista
invertida sin modificar la original, sin usar ciclos o recursividad.
 */

public class Main {
    public static <T extends List> T invertirLista(T lista){
        List<T> listaInvertida = new ArrayList<>(lista);
        Collections.reverse(listaInvertida);
        return (T) listaInvertida;
    }

    public static void main(String[] args) {
        List<Integer> listaEnteros = List.of(1, 2, 3, 4, 5);
        List<Double> listaDoubles = List.of(1.0, 2.0, 3.0, 4.0, 5.0);

        List<Integer> listaEnterosInvertida = invertirLista(listaEnteros);
        List<Double> listaDoublesInvertida = invertirLista(listaDoubles);

        System.out.println(listaEnteros);
        System.out.println(listaEnterosInvertida);
        System.out.println(listaDoubles);
        System.out.println(listaDoublesInvertida);
    }

}
