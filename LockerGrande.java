public class LockerGrande extends Locker {

    public LockerGrande() {
        super();
    }

    public LockerGrande(String cod, int id, String est,
                        String fecha, int usos) {

        super(cod, id, est, fecha, usos);
    }

    @Override
    public void verificarMantenimiento() {

        if (estado.equalsIgnoreCase("averiado")) {
            System.out.println(
                    "Locker grande: revisar estructura."
            );
        } else {
            System.out.println(
                    "Locker grande: condiciones normales."
            );
        }
    }
}