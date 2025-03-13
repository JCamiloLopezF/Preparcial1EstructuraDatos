package co.edu.uniquindio.poo.Preparcial1.Quiz;

import java.time.LocalDateTime;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Iterator;

public class SistemaReservas {
    public static void main(String[] args) {
    
    TreeMap<LocalDateTime, Sala> salas = new TreeMap<LocalDateTime, Sala>();
    Sala sala1 = new Sala("1", LocalDateTime.of(2025, 3, 6, 10, 30));
    Sala sala2 = new Sala("2", LocalDateTime.of(2025, 3, 3, 11, 30));
    Sala sala3 = new Sala("3", LocalDateTime.of(2025, 3, 25, 12, 30));
    Sala sala4 = new Sala("4", LocalDateTime.of(2025, 3, 30, 13, 30));

    salas.put(sala1.getFecha(), sala1);
    salas.put(sala4.getFecha(), sala4);
    salas.put(sala2.getFecha(), sala2);
    salas.put(sala3.getFecha(), sala3);

    SortedMap<LocalDateTime, Sala> salasFecha = salas.subMap(LocalDateTime.now(), LocalDateTime.of(2025, 3, 26, 13, 30));

    System.out.println("Lista de salas por fecha: ");
    for (Sala sala : salasFecha.values()) {
        System.out.println("Id de la sala: " + sala.getId() + " Fecha de la sala" + sala.getFecha());
    }
    System.out.println("Lista de salas completa:");
    for (Sala  sala : salas.values()) {
        System.out.println("Sala: " + sala.getId() + ", Fecha: " + sala.getFecha());
    }


    cancelarReserva(salas, LocalDateTime.of(2025, 3, 30, 13, 30));

    System.out.println(salas.size());

    }

    public static void cancelarReserva(TreeMap<LocalDateTime, Sala> salas, LocalDateTime fecha) {
        Iterator<Sala> iterador = salas.values().iterator();
        while(iterador.hasNext()){
            Sala sala = iterador.next();
            if(sala.getFecha().equals(fecha)){
                iterador.remove();
        }  
        }
    }
}
