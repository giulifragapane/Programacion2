import java.util.ArrayList;

public class SistemaSoporte {
    private ArrayList<TicketSoporte> tickets = new ArrayList<>();

    public SistemaSoporte() {
    }

    public void agregarTicket(TicketSoporte ticket){
        this.tickets.add(ticket);
    }

    public void agregarTecnico(int idTicket, String tecnico){
        for (TicketSoporte ticket : tickets) {
            if (ticket.getId() == idTicket) {
                ticket.asignarTecnico(tecnico);
                break;
            }
        }
    }
    public void listarTickets() {
        for (TicketSoporte ticket : tickets) {
            ticket.mostrarDetalle();
            System.out.println();
        }
    }
    public void listarTicketsPorEstado(String estado) {
        for (TicketSoporte ticket : tickets) {
            if (ticket.getEstado().equalsIgnoreCase(estado)) {
                ticket.mostrarDetalle();
                System.out.println();
            }
        }
    }
}
