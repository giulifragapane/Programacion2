public class EmpleadoAComision extends Empleado {
    private double salarioMinimo;
    private int cantClientesCaptados;
    private double montoPorCliente;

    public EmpleadoAComision(String dni, String nombre, String apellido, int anioIngreso, double salarioMinimo, int cantClientesCaptados, double montoPorCliente) {
        super(dni, nombre, apellido, anioIngreso);
        this.salarioMinimo = salarioMinimo;
        this.cantClientesCaptados = cantClientesCaptados;
        this.montoPorCliente = montoPorCliente;
    }
    public int getCantClientesCaptados() {
        return cantClientesCaptados;
    }

    @Override
    public double getSalario() {
        double salario = montoPorCliente * cantClientesCaptados;
        if (salario < salarioMinimo) {
            salario = salarioMinimo;
        }
        return salario;
    }

    @Override
    public String toString() {
        return "EmpleadoAComision{" +
                "salarioMinimo=" + salarioMinimo +
                ", cantClientesCaptados=" + cantClientesCaptados +
                ", montoPorCliente=" + montoPorCliente +
                '}';
    }
}
