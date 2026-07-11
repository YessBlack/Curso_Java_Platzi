package platzi.play;

import Plataforma.Plataforma;
import platzi.play.contenido.Pelicula;
import platzi.play.plataforma.Usuario;
import util.ScannerUtils;

public class Main {
    public static final String NOMBRE_PLATAFORMA = "PLATZI - PLAY";
    public static void main(String[] args) {
        System.out.println("Platzi Play 🍿");

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Cual es tu nombre: ");
//        String nombre = scanner.nextLine();
//
//        System.out.println("Hola " + nombre + " estas en Platzi Play");
//        System.out.println("");
//
//        System.out.print("Cual es tu edad: ");
//        int edad = scanner.nextInt();
//
//        System.out.println(nombre + " Puedes ver contenido " + edad);

        String titulo = ScannerUtils.capturarText("Nombre del contenido");
        String genero = ScannerUtils.capturarText("Nombre del genero");
        int duracion = ScannerUtils.capturarNumero("Duración");
        double calificacion = ScannerUtils.capturarDecimal("Calificación");

        Pelicula pelicula = new Pelicula(titulo, duracion, genero, calificacion);
        Usuario usuario = new Usuario("jhon@doe.com", "Jhon");
        Pelicula pelicula1 = new Pelicula("El Hobbit", 200, "Fantasia", 4.8);

        System.out.println(pelicula.obtenerFichaTecnica());

        usuario.ver(pelicula);

        Plataforma plataforma = new Plataforma(NOMBRE_PLATAFORMA);
        plataforma.agregar(pelicula);
        plataforma.agregar(pelicula1);
        plataforma.mostrarTitulos();
        System.out.println("Numero de Elementos de la plataforma " + plataforma.getContenido().size());
    }
}
