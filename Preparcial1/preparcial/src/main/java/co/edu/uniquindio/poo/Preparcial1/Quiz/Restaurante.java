package co.edu.uniquindio.poo.Preparcial1.Quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Restaurante {

    public static void main(String[] args) {
        
    ArrayList<Pedido> pedidos = new ArrayList<>();

    Pedido pedido1 = new Pedido(1, "Spaguetis", 10);
    Pedido pedido2 = new Pedido(2, "Carne", 5);
    Pedido pedido3 = new Pedido(3, "Carne con papas", 8);
    Pedido pedido4 = new Pedido(4, "Chuleta", 7);
    Pedido pedido5 = new Pedido(5, "Arroz chino", 4);
    Pedido pedido6 = new Pedido(6, "Ensalada", 4);

    registrarPedido(pedidos, pedido1);
    registrarPedido(pedidos, pedido2);
    registrarPedido(pedidos, pedido3);
    registrarPedido(pedidos, pedido4);
    registrarPedido(pedidos, pedido5);
    registrarPedido(pedidos, pedido6);

    ArrayList<Pedido> pedidosTiempo = new ArrayList<>(pedidos);
    Collections.sort(pedidosTiempo, new ComparatorTiempoPedido());

    for (Pedido pedido : pedidosTiempo) {
        System.out.println("Atentiendo el pedido: "+ pedido.getPlatillos() + " con el tiempo: " + pedido.getTiempoEstimado());
    }

    eliminarPedido(pedidosTiempo, pedido6);
    
    }

    public static void registrarPedido(ArrayList<Pedido> pedidos, Pedido pedido){
        pedidos.add(pedido);
    }

    public static void eliminarPedido(ArrayList<Pedido> pedidos, Pedido pedido){
        Iterator <Pedido> iterador = pedidos.iterator();
        while (iterador.hasNext()) {
            Pedido pedidoLocal = iterador.next();
            if(pedido.getNumeroPedido() == pedidoLocal.getNumeroPedido()){
                iterador.remove();
                System.out.println("Se eliminó el pedido con numero de pedido: " + pedido.getNumeroPedido());
            }
        }
    }
}
