public class Usuario {
    private static int cont = 0;
    private int idUsuario;
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.idUsuario = cont++;
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

}
