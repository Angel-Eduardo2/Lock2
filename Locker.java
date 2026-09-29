public abstract class Locker {

    protected String codigoIdentificador;
    protected int idSede;
    protected String estado;
    protected String fechaUltimoMantenimiento;
    protected int cantidadVecesUsado;

    public Locker() {
    }

    public Locker(String cod, int id, String est,
                  String fecha, int usos) {

        codigoIdentificador = cod;
        idSede = id;
        estado = est;
        fechaUltimoMantenimiento = fecha;
        cantidadVecesUsado = usos;
    }

    public abstract void verificarMantenimiento();

    public boolean estaDisponible() {
        return estado.equalsIgnoreCase("disponible");
    }

    public void ocupar() {
        estado = "ocupado";
    }

    public void liberar() {
        estado = "disponible";
    }

    public void sumarUso() {
        cantidadVecesUsado++;
    }

    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public String getEstado() {
        return estado;
    }
}