package platzi.play.plataforma;
import platzi.play.contenido.Pelicula;
import java.time.LocalDateTime;

public class Usuario {
    private String nombre;
    private String apellido;
    private String email;
    private LocalDateTime fechaRegistro;

    public Usuario(String email, String nombre) {
        this.email = email;
        this.nombre = nombre;
        this.fechaRegistro = LocalDateTime.now();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void ver(Pelicula pelicula) {
        System.out.println(nombre + " esta viendo " + pelicula.getTitulo());
    }
}
