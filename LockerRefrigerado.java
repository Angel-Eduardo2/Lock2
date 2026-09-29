public class LockerRefrigerado extends Locker {

    public LockerRefrigerado() {
        super();
    }

    public LockerRefrigerado(String cod, int id, String est,
                             String fecha, int usos) {

        super(cod, id, est, fecha, usos);
    }

    @Override
    public void verificarMantenimiento() {

        if (estado.equalsIgnoreCase("averiado")) {
            System.out.println(
                    "Locker refrigerado: revisar refrigeracion."
            );
        } else {
            System.out.println(
                    "Locker refrigerado: refrigeracion normal."
            );
        }
    }
}