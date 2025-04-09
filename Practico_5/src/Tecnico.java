public class Tecnico {
    private static int contadorTec = 0;
    private int idTec;
    private String nombre;
    private String especialidad;

    public Tecnico(String nombre, String especialidad) {
        this.idTec = contadorTec++;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "idTec=" + idTec +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
