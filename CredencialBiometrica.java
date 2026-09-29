public class CredencialBiometrica {

    private int idCredencial;
    private int idUsuario;

    private String pinUnicoApp;
    private String fechaRegistro;
    private String estado;

    public CredencialBiometrica() {
    }

    public CredencialBiometrica(int id, int idUsu,
                                String pin, String fecha,
                                String est) {

        idCredencial = id;
        idUsuario = idUsu;
        pinUnicoApp = pin;
        fechaRegistro = fecha;
        estado = est;
    }

    public boolean esValida() {
        return estado.equalsIgnoreCase("activo");
    }

    public String getPinUnicoApp() {
        return pinUnicoApp;
    }
}