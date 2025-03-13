package co.edu.uniquindio.poo.Preparcial2.Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{

    public static<T extends List> T lista(T lista){
        ArrayList<T> listaAInvertir = new ArrayList<T>(lista);
        Collections.reverse(listaAInvertir);
        return (T) listaAInvertir;
    }

    public static void main(String[] args) {
        List<Integer> listaEnteros = List.of(1, 2, 3, 4, 5);
        List<Double> listaDoubles = List.of(1.0, 2.0, 3.0, 4.0, 5.0);

        List<Integer> listaEnterosInvertida = lista(listaEnteros);
        List<Double> listaDoublesInvertida = lista(listaDoubles);

        System.out.println(listaEnteros);
        System.out.println(listaEnterosInvertida);
        System.out.println(listaDoubles);
        System.out.println(listaDoublesInvertida);
    }

}
