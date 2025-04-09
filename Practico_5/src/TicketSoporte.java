import java.time.LocalDate;

public class TicketSoporte {
    private static int contador = 0;
    private int id;
    private String descripcion;
    private String estado;
    private LocalDate fechaCreacion;
    private Usuario usuario;
    private String tecnicoAsignado;

    public TicketSoporte(String descripcion) {
        this.id = contador++;
        this.descripcion = descripcion;
        this.estado = "Abierto";
        this.fechaCreacion = LocalDate.now();
    }

    public TicketSoporte(String descripcion, Usuario usuario) {
        this.id = contador++;
        this.descripcion = descripcion;
        this.usuario = usuario;
        this.fechaCreacion = LocalDate.now();
        this.estado = "Abierto";
    }

    public int getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    public void cerrarTicket(){
        this.estado= "Cerrado";
    }

    public void actualizarTicket(){
        this.estado= "En Proceso";
    }

    public void asignarTecnico(String tecnico){
        this.tecnicoAsignado = tecnico;
    }

    public void mostrarDetalle(){
        System.out.println("-------SOP-"+id+"-------\n" +
                "Descripción: " + descripcion);
        System.out.println("Estado: " + estado +"\n" +
                "Fecha de Inicio: " + fechaCreacion + "\n" +
                "Técnico asignado: " + (tecnicoAsignado != null ? tecnicoAsignado:"Sin asignar") + "\n" +
                "Usuario: " + (usuario != null ? usuario.getNombre():"Anonimo"));
    }


}
