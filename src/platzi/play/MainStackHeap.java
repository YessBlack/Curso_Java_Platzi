package platzi.play;

import platzi.play.contenido.Pelicula;

public class MainStackHeap {
    public static void main(String[] args) {
        Pelicula reyLeon = new Pelicula("Rey Leon", 200, "animada", 9.7);
        Pelicula harryPotter = new Pelicula("Harry Potter y las Reliquias de la Muerte Parte 2", 200, "fantasia", 9.9);

        // reyLeon apunte a harryPotter en el heap
        // Cualquier cambio que haga en esas dos queda en ambos
        reyLeon = harryPotter;

        reyLeon.setTitulo("El Hobbit");

        System.out.println(reyLeon.getTitulo());
        System.out.println(harryPotter.getTitulo());
    }
}
