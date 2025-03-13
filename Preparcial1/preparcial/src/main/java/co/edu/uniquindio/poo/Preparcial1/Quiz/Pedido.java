package co.edu.uniquindio.poo.Preparcial1.Quiz;

public class Pedido {
    
    private int numeroPedido;
    private String platillos;
    private int tiempoEstimado; 

    public Pedido(int numeroPedido, String platillos, int tiempoEstimado) {
        this.numeroPedido = numeroPedido;
        this.platillos = platillos;
        this.tiempoEstimado = tiempoEstimado;
    }
    
    public int getNumeroPedido() {
        return numeroPedido;
    }
    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
    public String getPlatillos() {
        return platillos;
    }
    public void setPlatillos(String platillos) {
        this.platillos = platillos;
    }
    public int getTiempoEstimado() {
        return tiempoEstimado;
    }
    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

}
