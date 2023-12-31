package cl.awakelab.grupal3.Model;

import java.util.Date;
import java.time.LocalDate;
import java.time.LocalTime;

public class Capacitacion {
    private int id;
    private String nombre;
    private String detalle;
    private LocalDate fecha;
    private LocalTime hora;
    private String lugar;
    private String duracion;
    private int cantidad;

    public Capacitacion() {
    }

    public Capacitacion(int id, String nombre, String detalle, LocalDate fecha, LocalTime hora, String lugar, String duracion, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.detalle = detalle;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", detalle='" + detalle + '\'' +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", lugar='" + lugar + '\'' +
                ", duracion='" + duracion + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
