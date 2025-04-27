public class EmpleadoSalarioFijo extends Empleado {
    private static final double PORC1 = 0.05;
    private static final double PORC2 = 0.1;
    private static final int ANIO1 = 2;
    private static final int ANIO2 = 5;
    private double sueldoBasico;

    public EmpleadoSalarioFijo(String dni, String nombre, String apellido, int anioIngreso, double sueldoBasico) {
        super(dni, nombre, apellido, anioIngreso);
        this.sueldoBasico = sueldoBasico;
    }
    private double porcAdicional() {
        int aniosTrabajados = antiguedadEnAnios();
        double porc = 0;
        if (aniosTrabajados > ANIO2) {
            porc = PORC2;
        } else if (aniosTrabajados >= ANIO1) {
            porc = PORC1;
        }
        return porc;
    }
    @Override
    public double getSalario() {
        return sueldoBasico + (sueldoBasico * porcAdicional());
    }
}

