public class Sede {

    private int idSede;
    private int idFranquicia;
    private int capacidadTotalLockers;

    private String nombre;
    private String direccion;
    private String ciudad;
    private String fechaApertura;
    private String administradorSede;

    public Sede() {
    }

    public Sede(int id, int idFra, String nom,
                String dir, String ciu, int cap,
                String fecha, String admin) {

        idSede = id;
        idFranquicia = idFra;
        nombre = nom;
        direccion = dir;
        ciudad = ciu;
        capacidadTotalLockers = cap;
        fechaApertura = fecha;
        administradorSede = admin;
    }

    public int getIdSede() {
        return idSede;
    }

    public String getNombre() {
        return nombre;
    }
}