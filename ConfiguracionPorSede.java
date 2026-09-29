public class ConfiguracionPorSede {

    private int idConfiguracion;
    private int idSede;

    private String clave;
    private String valor;
    private String descripcion;

    public ConfiguracionPorSede() {
    }

    public ConfiguracionPorSede(int id, int idSed,
                                String cla, String val,
                                String desc) {

        idConfiguracion = id;
        idSede = idSed;
        clave = cla;
        valor = val;
        descripcion = desc;
    }

    public String getClave() {
        return clave;
    }

    public String getValor() {
        return valor;
    }
}