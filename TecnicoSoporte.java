public class TecnicoSoporte extends Administrador {

    public TecnicoSoporte() {
        super();
    }

    public TecnicoSoporte(int id, int idFra, String nom,
                          String ape, String cor, String pass,
                          String rol, String fecha) {

        super(id, idFra, nom, ape, cor, pass, rol, fecha);
    }

    @Override
    public void accederPanelDeControl() {
        System.out.println(
                "Panel de soporte: lockers averiados y mantenimiento."
        );
    }
}