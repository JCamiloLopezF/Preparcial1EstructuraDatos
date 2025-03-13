package co.edu.uniquindio.poo.Preparcial2.Ejercicio4;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(1);
        listaEnteros.add(2);
        listaEnteros.add(3);
        listaEnteros.add(4);
        listaEnteros.add(5);
        ArrayList<Double> listaDoubles = new ArrayList<>();
        listaDoubles.add(1.0);
        listaDoubles.add(2.0);
        listaDoubles.add(3.0);
        listaDoubles.add(4.0);
        listaDoubles.add(5.0);

        Iterator iteradorListaEnteros = listaEnteros.iterator();
        Iterator iteradorListaDoubles = listaDoubles.iterator();
    }
}
