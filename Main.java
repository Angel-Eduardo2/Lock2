import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        // USUARIOS


        ArrayList<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new Estudiante(
                1, 1, "Ana", "Lopez",
                "estudiante", "ana@mail.com",
                "3000000000", "2026-09-27", "activo"
        ));

        usuarios.add(new Empleado(
                2, 1, "Juan", "Perez",
                "empleado", "juan@mail.com",
                "3000000001", "2026-09-27", "activo"
        ));

        usuarios.add(new Visitante(
                3, 1, "Luis", "Gomez",
                "visitante", "luis@mail.com",
                "3000000002", "2026-09-27", "activo"
        ));

        System.out.println("TARIFAS");

        for (Usuario u : usuarios) {
            System.out.println(
                    u.getTipo() + ": " +
                            u.calcularTarifa(10000)
            );
        }



        // ADMINISTRADORES


        ArrayList<Administrador> admins = new ArrayList<>();

        admins.add(new AdministradorLocal(
                1, 1, "Carlos", "Diaz",
                "carlos@mail.com", "1234",
                "admin_local", "2026-09-27"
        ));

        admins.add(new AdministradorCentral(
                2, 1, "Maria", "Rojas",
                "maria@mail.com", "1234",
                "admin_central", "2026-09-27"
        ));

        System.out.println("\nPANELES");

        for (Administrador a : admins) {
            a.accederPanelDeControl();
        }


        // LOCKERS


        ArrayList<Locker> lockers = new ArrayList<>();

        lockers.add(new LockerEstandar(
                "L001", 1,
                "disponible",
                "2026-09-01", 5
        ));

        lockers.add(new LockerRefrigerado(
                "L002", 1,
                "averiado",
                "2026-09-05", 10
        ));

        lockers.add(new LockerGrande(
                "L003", 1,
                "disponible",
                "2026-09-10", 2
        ));

        System.out.println("\nMANTENIMIENTO");

        for (Locker l : lockers) {
            l.verificarMantenimiento();
        }


        // =========================
        // MODELOS DE ALQUILER
        // =========================

        ArrayList<ModeloAlquiler> modelos =
                new ArrayList<>();

        modelos.add(new AlquilerPorTiempo());
        modelos.add(new AlquilerPorUso());
        modelos.add(new AlquilerMensual());
        modelos.add(new AlquilerEvento());

        System.out.println("\nCOSTOS");

        for (ModeloAlquiler m : modelos) {
            System.out.println(
                    m.calcularCosto(10000)
            );
        }


        // SESION DE USO


        Usuario usu = new Estudiante(
                4, 1, "Pedro", "Torres",
                "estudiante", "pedro@mail.com",
                "3000000003", "2026-09-27",
                "activo"
        );

        Locker loc = new LockerEstandar(
                "L004", 1,
                "disponible",
                "2026-09-01", 0
        );

        SesionDeUso ses = new SesionDeUso();

        ses.iniciar(usu, loc);

        ses.terminar(loc, false);



        // FRANQUICIA


        Franquicia fra =
                new FranquiciaAcademica(
                        1,
                        "Universidad Libre",
                        "universidad",
                        "Bogota",
                        "3000000000",
                        "contacto@mail.com",
                        "autogestionado",
                        "2026-09-01",
                        "activo",
                        1000000
                );

        System.out.println("\nFRANQUICIA");

        System.out.println(
                "Cuota: " +
                        fra.calcularCuotaMensual()
        );


        System.out.println(
                "\nLOCKSECURE funcionando."
        );
    }
}