public class Visitante extends Usuario {

    public Visitante() {
        super();
    }

    public Visitante(int id, int idSed, String nom, String ape,
                     String tip, String correo, String tel,
                     String fecha, String est) {

        super(id, idSed, nom, ape, tip, correo, tel, fecha, est);
    }

    @Override
    public double calcularTarifa(double base) {
        return base;
    }
}