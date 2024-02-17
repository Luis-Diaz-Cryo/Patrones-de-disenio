package ConstrucciónDeUnMenúDeRestaurante;

public class Director {

    public static void construirMenu(MenuInterface menuInterface) {
        menuInterface.setEntrada(Entrada.individual);
        menuInterface.setPlatoFuerte(PlatoFuerte.italiano);
        menuInterface.setPostre(Postre.brownie);
        menuInterface.setBebida(Bebida.batido);
    }

    public void construirMenu2(MenuInterface menuInterface) {
        menuInterface.setEntrada(Entrada.compartida);
        menuInterface.setPlatoFuerte(PlatoFuerte.colombiano);
        menuInterface.setPostre(Postre.pie);
        menuInterface.setBebida(Bebida.cerveza);
    }

}
