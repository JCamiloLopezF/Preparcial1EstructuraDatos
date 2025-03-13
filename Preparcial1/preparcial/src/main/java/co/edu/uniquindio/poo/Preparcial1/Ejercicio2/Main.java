package co.edu.uniquindio.poo.Preparcial1.Ejercicio2;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> lista1 = new LinkedList<Integer>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);
        lista1.add(5);
        LinkedList<Integer> lista2 = new LinkedList<Integer>();
        lista2.add(6);
        lista2.add(7);
        lista2.add(8);
        lista2.add(9);
        lista2.add(10);
        LinkedList<Integer> listaTransformada = transformarLista(lista1, lista2);
        for (Integer elemento : listaTransformada) {
            System.out.println(elemento);
        }

}
    public static <T> LinkedList<T> transformarLista(List<T> lista1, List<T> lista2){
        LinkedList<T> listaTransformada = new LinkedList<T>();
        listaTransformada.addAll(lista1);
        listaTransformada.addAll(lista2);
        return listaTransformada;
    }

}
