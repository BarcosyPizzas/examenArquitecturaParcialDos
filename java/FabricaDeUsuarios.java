public class FabricaDeUsuarios {
    public Usuario crearUsuario(String tipo) {
        if(tipo.equals("admin")) {
            return new Administrador();
        }
        if(tipo.equals("bibliotecario")) {
            return new Bibliotecario();
        }
        if(tipo.equals("estudiante")) {
            return new Estudiante();
        }
//        Si se agrega posgrado aqui iria la validacion tambien
//        if(tipo.equals("posgrado")) {
//            return new Posgrado();
//        }
        return null;
    }
}
