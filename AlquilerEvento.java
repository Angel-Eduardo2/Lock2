public class AlquilerEvento extends ModeloAlquiler {

    public AlquilerEvento() {
        super();
    }

    @Override
    public double calcularCosto(double base) {
        return base * 1.20;
    }
}