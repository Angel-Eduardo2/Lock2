public class LockerEstandar extends Locker {

    public LockerEstandar() {
        super();
    }

    public LockerEstandar(String cod, int id, String est,
                          String fecha, int usos) {

        super(cod, id, est, fecha, usos);
    }

    @Override
    public void verificarMantenimiento() {

        if (estado.equalsIgnoreCase("averiado")) {
            System.out.println("Locker estandar: necesita reparacion.");
        } else {
            System.out.println("Locker estandar: condiciones normales.");
        }
    }
}