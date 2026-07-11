package platzi.play.plataforma;
import platzi.play.contenido.Pelicula;
import java.time.LocalDateTime;

public class Usuario {
    public String nombre;
    public String apellido;
    public String email;
    public LocalDateTime fechaRegistro;

    public Usuario(String email, String nombre) {
        this.email = email;
        this.nombre = nombre;
        this.fechaRegistro = LocalDateTime.now();
    }

    public void ver(Pelicula pelicula) {
        System.out.println(nombre + " esta viendo " + pelicula.titulo);
    }
}
