package co.edu.uniquindio.poo.Preparcial1.Quiz;

import java.util.Comparator;

public class ComparatorTiempoPedido implements Comparator<Pedido> {

    @Override
    public int compare(Pedido o1, Pedido o2) {
        return Integer.compare(o1.getTiempoEstimado(), o2.getTiempoEstimado());
    }
    
}
