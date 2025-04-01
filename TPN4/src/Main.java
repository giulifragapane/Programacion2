import java.util.EmptyStackException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado(1, "Pedro Carmona", "Médico", 600000.0);
        Empleado e2 = new Empleado("Giuliana Fragapane", "Ingeniera");
        Empleado e3 = new Empleado("Mariana Speneste", "Profesora");
        e1.actualizarSalario(600000);
        e2.actualizarSalario(10.0);
        e3.actualizarSalario(60000);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}