package Plataforma;

import platzi.play.contenido.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class Plataforma {
    private String nombre;
    private List<Pelicula> contenido;

    public Plataforma(String nombre) {
        this.nombre = nombre;
        this.contenido = new ArrayList<>();
    }

    public void agregar(Pelicula elemento) {
        this.contenido.add(elemento);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Pelicula> getContenido() {
        return contenido;
    }

    public void mostrarTitulos() {
        for (int i = 0; i < contenido.size(); i++) {
            System.out.println(this.contenido.get(i).getTitulo());
        }
    }
}
