import java.util.List;

public class Administrador implements Usuario{
    @Override
    public String getNombre() {
        return "Nombre del administrador";
    }

    @Override
    public String getRol() {
        return "Administrador";
    }

    @Override
    public List<String> getPermisos() {
        return List.of("Modo Dios");
    }
}
