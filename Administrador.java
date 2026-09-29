public abstract class Administrador {

    protected int idAdmin;
    protected int idFranquicia;
    protected String nombre;
    protected String apellido;
    protected String correo;
    protected String contrasena;
    protected String rol;
    protected String fechaUltimoAcceso;

    public Administrador() {
    }

    public Administrador(int id, int idFra, String nom, String ape,
                         String cor, String pass, String rol,
                         String fecha) {

        idAdmin = id;
        idFranquicia = idFra;
        nombre = nom;
        apellido = ape;
        correo = cor;
        contrasena = pass;
        this.rol = rol;
        fechaUltimoAcceso = fecha;
    }

    public abstract void accederPanelDeControl();

    public String getRol() {
        return rol;
    }
}