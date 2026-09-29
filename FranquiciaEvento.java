public class FranquiciaEvento extends Franquicia {

    public FranquiciaEvento() {
        super();
    }

    public FranquiciaEvento(int id, String nom, String tip,
                            String dir, String tel, String cor,
                            String modo, String fecha,
                            String est, double cuota) {

        super(id, nom, tip, dir, tel, cor, modo, fecha, est, cuota);
    }

    @Override
    public double calcularCuotaMensual() {
        return cuotaMensual * 1.10;
    }
}