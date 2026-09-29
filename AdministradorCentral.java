public class AdministradorCentral extends Administrador {

    public AdministradorCentral() {
        super();
    }

    public AdministradorCentral(int id, int idFra, String nom,
                                String ape, String cor, String pass,
                                String rol, String fecha) {

        super(id, idFra, nom, ape, cor, pass, rol, fecha);
    }

    @Override
    public void accederPanelDeControl() {
        System.out.println(
                "Panel central: varias sedes e incidencias."
        );
    }
}