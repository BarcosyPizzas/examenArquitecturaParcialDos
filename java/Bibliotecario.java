import java.util.List;

public class Bibliotecario  implements Usuario{
    @Override
    public String getNombre() {
        return "Nombre del bibliotecario";
    }

    @Override
    public String getRol() {
        return "Bibliotecario";
    }

    @Override
    public List<String> getPermisos() {
        return List.of("Gestion de libros", "Gestion de usuarios");
    }
}
