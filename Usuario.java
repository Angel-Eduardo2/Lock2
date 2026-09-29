public abstract class Usuario {

    protected int idUsuario;
    protected int idSede;
    protected String nombre;
    protected String apellido;
    protected String tipo;
    protected String correoElectronico;
    protected String telefono;
    protected String fechaRegistro;
    protected String estado;

    public Usuario() {
    }

    public Usuario(int id, int idSed, String nom, String ape, String tip,
                   String correo, String tel, String fecha, String est) {

        idUsuario = id;
        idSede = idSed;
        nombre = nom;
        apellido = ape;
        tipo = tip;
        correoElectronico = correo;
        telefono = tel;
        fechaRegistro = fecha;
        estado = est;
    }

    public abstract double calcularTarifa(double base);

    public boolean estaActivo() {
        return estado.equalsIgnoreCase("activo");
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }
}