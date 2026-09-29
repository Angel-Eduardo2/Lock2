public class AdministradorLocal extends Administrador {

    public AdministradorLocal() {
        super();
    }

    public AdministradorLocal(int id, int idFra, String nom,
                              String ape, String cor, String pass,
                              String rol, String fecha) {

        super(id, idFra, nom, ape, cor, pass, rol, fecha);
    }

    @Override
    public void accederPanelDeControl() {
        System.out.println(
                "Panel local: usuarios, lockers y configuracion de su sede."
        );
    }
}