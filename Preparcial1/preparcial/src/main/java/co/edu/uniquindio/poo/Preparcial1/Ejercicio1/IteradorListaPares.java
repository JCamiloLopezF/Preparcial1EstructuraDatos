package co.edu.uniquindio.poo.Preparcial1.Ejercicio1;

import java.util.Iterator;

public class IteradorListaPares implements Iterator<String>{
    private int posicion;
    private MiLista lista;

    public IteradorListaPares(MiLista lista) {
        this.posicion = 0;
        this.lista = lista;
    }

    @Override
    public boolean hasNext() {
        while(posicion < lista.getTamaño()){
            if(posicion % 2 == 0){
                return true;
            }
        }
                return false;
    }

    @Override
    public String next() {
        String elemento = lista.getLista()[posicion];
        posicion += 2;
        return elemento;
    }

}
