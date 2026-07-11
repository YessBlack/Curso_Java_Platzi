package platzi.play.contenido;

import java.time.LocalDate;

public class Pelicula {
    public String titulo;
    public String descripcion;
    public int duracion;
    public String genero;
    public LocalDate fechaEstreno;
    public double calificacion;
    public boolean estaDisponible;

    public Pelicula (String titulo, int duracion, String genero, double calificacion) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.fechaEstreno = LocalDate.now();

        calificar(calificacion);
    }

    public void reproducir () {
        System.out.println("Reproduciendo " + titulo);
    }

    public String obtenerFichaTecnica() {
        return String.format("%s ( %d ) \n Genero: %s", titulo, fechaEstreno.getYear(), genero);
    }

    public void calificar(double calificacion) {
        if (calificacion >= 0 && calificacion <=5) {
            this.calificacion = calificacion;
        }
    }

    public boolean esPopular () {
        return calificacion >=4;
    }

}
