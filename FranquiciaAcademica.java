public class FranquiciaAcademica extends Franquicia {

    public FranquiciaAcademica() {
        super();
    }

    public FranquiciaAcademica(int id, String nom, String tip,
                               String dir, String tel, String cor,
                               String modo, String fecha,
                               String est, double cuota) {

        super(id, nom, tip, dir, tel, cor, modo, fecha, est, cuota);
    }

    @Override
    public double calcularCuotaMensual() {
        return cuotaMensual * 0.90;
    }
}