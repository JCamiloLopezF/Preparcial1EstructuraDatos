package co.edu.uniquindio.poo.Preparcial1.Ejercicio1;

import java.util.Iterator;

public class MiLista implements Iterable<String>{
    private String[] lista;
    private int tamaño;


    public MiLista(String[] lista, int tamaño) {
        this.lista = lista;
        this.tamaño = tamaño;
    }

    @Override
    public Iterator iterator() {
        return new IteradorListaPares(this);
    }


    public String[] getLista() {
        return lista;
    }


    public void setLista(String[] lista) {
        this.lista = lista;
    }


    public int getTamaño() {
        return tamaño;
    }


    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
}
