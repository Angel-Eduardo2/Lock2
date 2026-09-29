public class SuperAdministrador extends Administrador {

    public SuperAdministrador() {
        super();
    }

    public SuperAdministrador(int id, int idFra, String nom,
                              String ape, String cor, String pass,
                              String rol, String fecha) {

        super(id, idFra, nom, ape, cor, pass, rol, fecha);
    }

    @Override
    public void accederPanelDeControl() {
        System.out.println(
                "Panel global: franquicias, administradores y facturacion."
        );
    }
}