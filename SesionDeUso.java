public class SesionDeUso {

    private int idSesion;
    private int idUsuario;
    private int duracionMinutos;

    private String codigoIdentificador;
    private String fechaInicio;
    private String fechaFin;
    private String metodoApertura;

    private boolean huboIncidencias;

    public SesionDeUso() {
    }

    public SesionDeUso(int id, int idUsu, String cod,
                       String inicio, String fin,
                       int dur, String metodo,
                       boolean inc) {

        idSesion = id;
        idUsuario = idUsu;
        codigoIdentificador = cod;
        fechaInicio = inicio;
        fechaFin = fin;
        duracionMinutos = dur;
        metodoApertura = metodo;
        huboIncidencias = inc;
    }

    public void iniciar(Usuario usu, Locker locker) {

        if (!usu.estaActivo()) {
            System.out.println("El usuario no esta activo.");
            return;
        }

        if (!locker.estaDisponible()) {
            System.out.println("El locker no esta disponible.");
            return;
        }

        locker.ocupar();
        locker.sumarUso();

        System.out.println("Sesion iniciada.");
    }

    public void terminar(Locker locker, boolean inc) {

        huboIncidencias = inc;

        if (!inc) {
            locker.liberar();
        }

        System.out.println("Sesion terminada.");
    }
}