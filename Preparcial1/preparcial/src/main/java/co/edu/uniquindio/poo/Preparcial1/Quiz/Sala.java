package co.edu.uniquindio.poo.Preparcial1.Quiz;

import java.time.LocalDateTime;

public class Sala {

    private String id;
    private LocalDateTime fecha;
    
    public Sala(String id, LocalDateTime fecha) {
        this.id = id;
        this.fecha = fecha;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}