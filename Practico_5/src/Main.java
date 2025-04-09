//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Usuario user = new Usuario("Jose Balt", "josejose@gmail.com");
        TicketSoporte ticket = new TicketSoporte("No me funciona el sistema cuando aprieto el botón de registro");
        ticket.mostrarDetalle();
        ticket.asignarTecnico("Pedro Vargas");
        ticket.cerrarTicket();
        ticket.mostrarDetalle();
        TicketSoporte ticket2 = new TicketSoporte("No me carga la URL del sistema a partir de las 18pm");
        ticket2.mostrarDetalle();
        ticket2.cerrarTicket();
        ticket2.mostrarDetalle();
        ticket2.actualizarTicket();
        ticket2.mostrarDetalle();
        TicketSoporte ticket3 = new TicketSoporte("Me figura error (adjunto foto)", user);
        ticket3.mostrarDetalle();
        SistemaSoporte sistema= new SistemaSoporte();
        sistema.agregarTicket(ticket);
        sistema.agregarTicket(ticket2);
        sistema.agregarTicket(ticket3);
        System.out.println("---------------------------------------");
        sistema.listarTickets();
        System.out.println("---------------------------------------");
        sistema.listarTicketsPorEstado("Cerrado");
        System.out.println("---------------------------------------");
        sistema.listarTicketsPorEstado("Abierto");
    }
}