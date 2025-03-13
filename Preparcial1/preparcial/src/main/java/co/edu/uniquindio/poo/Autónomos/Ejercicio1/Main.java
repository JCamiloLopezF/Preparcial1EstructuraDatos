package co.edu.uniquindio.poo.Autónomos.Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banano");
        frutas.add("Cereza");
        frutas.add("Durazno");

        Iterator iteradorFrutas = frutas.iterator();

        while(iteradorFrutas.hasNext()){
            System.out.println(iteradorFrutas.next());
        }
    }
}
