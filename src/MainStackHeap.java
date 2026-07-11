import platzi.play.contenido.Pelicula;

public class MainStackHeap {
    public static void main(String[] args) {
        Pelicula reyLeon = new Pelicula("El Rey Leon", 135, "animada", 4.5);
        Pelicula harryPotter = new Pelicula("Harry Potter", 200, "fantasia", 4.8);

        System.out.println("Pelicula Rey Leon " + reyLeon.getTitulo());
        System.out.println("Pelicula Harry Potter " + harryPotter.getTitulo());

        reyLeon = harryPotter;
        reyLeon.setTitulo("El Hobbit");

        System.out.println("Cambios");
        System.out.println("Pelicula Rey Leon: " + reyLeon.getTitulo());
        System.out.println("Pelicula Harry Potter: " + harryPotter.getTitulo());
    }
}
