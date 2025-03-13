package co.edu.uniquindio.poo.Autónomos.Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main (String[]args){
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);

        Iterator<Integer> iterador = lista.iterator();

        while(iterador.hasNext()){
            if(iterador.next()%2==0){
                iterador.remove();
            }
        }
        System.out.println(lista);
    }
}
