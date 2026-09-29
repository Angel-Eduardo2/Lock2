public class AlquilerPorUso extends ModeloAlquiler {

    public AlquilerPorUso() {
        super();
    }

    @Override
    public double calcularCosto(double base) {
        return base * 1.05;
    }
}