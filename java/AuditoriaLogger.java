import java.util.ArrayList;
import java.util.List;

public class AuditoriaLogger {

    private List<String> registros;
    private static AuditoriaLogger instance;

    private AuditoriaLogger() {
        this.registros = new ArrayList<>();
    }

    public static AuditoriaLogger getInstance() {
        if(instance == null) {
            return new AuditoriaLogger();
        }
        return instance;
    }

    public void registrar(String evento, String usuario){
        registros.add(evento + " - " + usuario);
    }

    public List<String> getHistorial() {
        return registros;
    }


}
