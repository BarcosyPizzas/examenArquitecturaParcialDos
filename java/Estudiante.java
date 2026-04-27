import java.util.List;

public class Estudiante implements Usuario {
    @Override
    public String getNombre() {
        return "Nombre del estudiante";
    }

    @Override
    public String getRol() {
        return "Estudiante";
    }

    @Override
    public List<String> getPermisos() {
        return List.of("Prestamo de libros");
    }
}
