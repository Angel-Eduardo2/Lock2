public class Asistente extends Usuario {

    public Asistente() {
        super();
    }

    public Asistente(int id, int idSed, String nom, String ape,
                     String tip, String correo, String tel,
                     String fecha, String est) {

        super(id, idSed, nom, ape, tip, correo, tel, fecha, est);
    }

    @Override
    public double calcularTarifa(double base) {
        return base * 0.85;
    }
}