import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        this.empleados.add(e);
    }

    public void mostrarSalarios() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado.nombreCompleto() + ": $" + empleado.getSalario());
        }
    }

    public Empleado empleadoConMasClientes() {
        int max = -1;
        Empleado elMayor = null;
        for (Empleado e : empleados) {
            if (e instanceof EmpleadoAComision) {
                EmpleadoAComision eac = (EmpleadoAComision) e;
                int cant = eac.getCantClientesCaptados();
                if (cant > max) {
                    max = cant;
                    elMayor = eac;
                }
            }
        }
        return elMayor;
    }
}
