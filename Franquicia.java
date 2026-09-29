public abstract class Franquicia {

    protected int idFranquicia;
    protected String nombre;
    protected String tipo;
    protected String direccion;
    protected String telefono;
    protected String correoContacto;
    protected String modoOperacion;
    protected String fechaAlta;
    protected String estado;
    protected double cuotaMensual;

    public Franquicia() {
    }

    public Franquicia(int id, String nom, String tip,
                      String dir, String tel, String cor,
                      String modo, String fecha, String est,
                      double cuota) {

        idFranquicia = id;
        nombre = nom;
        tipo = tip;
        direccion = dir;
        telefono = tel;
        correoContacto = cor;
        modoOperacion = modo;
        fechaAlta = fecha;
        estado = est;
        cuotaMensual = cuota;
    }

    public abstract double calcularCuotaMensual();

    public String getNombre() {
        return nombre;
    }
}