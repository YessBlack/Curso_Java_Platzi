package platzi.play.contenido;

import java.time.LocalDate;

public class Pelicula {
    private String titulo;
    private String descripcion;
    private int duracion;
    private String genero;
    private LocalDate fechaEstreno;
    private double calificacion;
    private boolean estaDisponible;

    public Pelicula (String titulo, int duracion, String genero, double calificacion) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.fechaEstreno = LocalDate.now();

        setCalificacion(calificacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setFechaEstreno(LocalDate fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public void setCalificacion(double calificacion) {
        if (calificacion >= 0 && calificacion <=5) {
            this.calificacion = calificacion;
        }
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }

    public boolean esPopular () {
        return calificacion >=4;
    }

    public void reproducir () {
        System.out.println("Reproduciendo " + titulo);
    }

    public String obtenerFichaTecnica() {
        return String.format("%s ( %d ) \n Genero: %s", titulo, fechaEstreno.getYear(), genero);
    }
}
