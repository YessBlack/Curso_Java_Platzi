package platzi.play;

import platzi.play.contenido.Pelicula;
import platzi.play.plataforma.Usuario;
import util.ScannerUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
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

        System.out.println(pelicula.obtenerFichaTecnica());

        Usuario usuario = new Usuario("jhon@doe.com", "Jhon");

        usuario.ver(pelicula);
    }
}
