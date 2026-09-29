public class AlquilerMensual extends ModeloAlquiler {

    public AlquilerMensual() {
        super();
    }

    @Override
    public double calcularCosto(double base) {
        return base * 0.90;
    }
}