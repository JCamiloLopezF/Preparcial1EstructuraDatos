package co.edu.uniquindio.poo.Compartidos.EjerciciosEstructuras;
/*Una tienda en línea necesita un sistema para gestionar los pedidos de sus clientes. Cada cliente puede realizar múltiples pedidos y cada pedido contiene una lista de productos.

Requerimientos
Gestión de Clientes:

Cada cliente tiene un ID único, un nombre y una dirección.
Se debe poder agregar nuevos clientes y consultar su información.
Gestión de Productos:

Cada producto tiene un código único, un nombre, una categoría y un precio.
Se debe poder listar los productos disponibles y filtrar por categoría.
Gestión de Pedidos:

Cada pedido tiene un ID único, una fecha, una lista de productos y un estado (PENDIENTE, ENVIADO, ENTREGADO).
Un cliente puede hacer varios pedidos, pero cada pedido pertenece a un solo cliente.
Se debe permitir actualizar el estado de un pedido y consultar los pedidos por cliente.
Se debe calcular el total del pedido sumando los precios de los productos. */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Pedidos {

    public static class Cliente {
        private int id;
        private String nombre;
        private String direccion;

        public Cliente(int id, String nombre, String direccion) {
            this.id = id;
            this.nombre = nombre;
            this.direccion = direccion;
        }

        public int getId() {
            return id;
        }
        public String getNombre() {
            return nombre;
        }
        public String getDireccion() {
            return direccion;
        }
    }

    public static class Producto {
        private int codigo;
        private String nombre;
        private String categoria;
        private int precio;

        public Producto(int codigo, String nombre, String categoria, int precio) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.categoria = categoria;
            this.precio = precio;
        }

        public int getCodigo() {
            return codigo;
        }
        public String getNombre() {
            return nombre;
        }
        public String getCategoria() {
            return categoria;
        }
        public int getPrecio(){
            return precio;
        }
    }

    public static class Pedido{
        private Cliente cliente;
        private int id;
        private String fecha;
        private Producto productos;
        private String estado;

        public Pedido(Cliente cliente, int id, String fecha, Producto productos, String estado) {
            this.cliente = cliente;
            this.id = id;
            this.fecha = fecha;
            this.productos = productos;
            this.estado = estado;
        }

        public int getId() {
            return id;
        }
        public String getFecha() {
            return fecha;
        }
        public Producto getProductos() {
            return productos;
        }
        public String getEstado() {
            return estado;
        }
        public Cliente getCliente() {
            return cliente;
        }
    }

    public static void main(String[] args) {
        HashMap<Pedido, Cliente> pedidos = new HashMap<>();
        Cliente cliente1 = new Cliente(1, "Juan", "Calle 1");
        Cliente cliente2 = new Cliente(2, "Pedro", "Calle 2");
        Producto producto1 = new Producto(1, "Producto1", "Categoria1", 100);
        Producto producto2 = new Producto(2, "Producto2", "Categoria2", 200);
        Pedido pedido1 = new Pedido(cliente1, 1, "01/01/2021", producto1, "PENDIENTE");
        Pedido pedido2 = new Pedido(cliente2, 2, "02/01/2021", producto2, "PENDIENTE");

        pedidos.put(pedido1, cliente1);
        pedidos.put(pedido2, cliente2);

        actualizarEstadoPedido(pedidos, pedido1, "ENVIADO");

        Iterator<Pedido> iterador = pedidos.keySet().iterator();
        while(iterador.hasNext()){
            Pedido p = iterador.next();
            System.out.println(p.getEstado());
        }

        ArrayList<Pedido> listaPedidosCliente = consultarPedidosPorCliente(pedidos, cliente1);

        for(Pedido p : listaPedidosCliente){
            System.out.println(p.getId());
            System.out.println(p.getCliente().getNombre());
        }
    }

    public static void actualizarEstadoPedido(HashMap<Pedido, Cliente> pedidos, Pedido pedido, String estado){
        Iterator<Pedido> iterador = pedidos.keySet().iterator();
        while(iterador.hasNext()){
            Pedido p = iterador.next();
            if(p.equals(pedido)){
                p.estado = estado;
            }
        }
    }

    public static ArrayList<Pedido> consultarPedidosPorCliente(HashMap<Pedido, Cliente> pedidos, Cliente cliente){
        ArrayList<Pedido> pedidosCliente = new ArrayList<>();
        Iterator<Pedido> iterador = pedidos.keySet().iterator();
        while(iterador.hasNext()){
            Pedido p = iterador.next();
            if(p.getCliente().equals(cliente)){
                pedidosCliente.add(p);
            }
        }
        return pedidosCliente;
    }
}
//Willy 