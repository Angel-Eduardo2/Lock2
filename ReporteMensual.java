public class ReporteMensual {

    private int idReporte;
    private int idSede;
    private int mes;
    private int anio;

    private int totalUsuarios;
    private int totalUsuariosActivos;
    private int totalSesiones;

    private double promedioDuracion;

    private int totalIncidencias;

    private boolean seGeneroFactura;

    public ReporteMensual() {
    }

    public ReporteMensual(int id, int idSed,
                          int mes, int anio,
                          int totUsu, int totAct,
                          int totSes, double prom,
                          int totInc, boolean fac) {

        idReporte = id;
        idSede = idSed;
        this.mes = mes;
        this.anio = anio;

        totalUsuarios = totUsu;
        totalUsuariosActivos = totAct;
        totalSesiones = totSes;
        promedioDuracion = prom;
        totalIncidencias = totInc;
        seGeneroFactura = fac;
    }

    public void mostrar() {

        System.out.println("Reporte " + mes + "/" + anio);
        System.out.println("Usuarios: " + totalUsuarios);
        System.out.println("Sesiones: " + totalSesiones);
        System.out.println("Incidencias: " + totalIncidencias);
    }
}