package ConstrucciónDeUnMenúDeRestaurante;

public class Menu {

    private final Entrada entrada;
    private final PlatoFuerte platoFuerte;
    private final Postre postre;
    private final Bebida bebida;

    public Menu(Entrada entrada, PlatoFuerte platoFuerte, Postre postre, Bebida bebida) {

        this.entrada = entrada;
        this.platoFuerte = platoFuerte;
        this.postre = postre;
        this.bebida = bebida;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public PlatoFuerte getPlatoFuerte() {
        return platoFuerte;
    }

    public Postre getPostre() {
        return postre;
    }

    public Bebida getBebida() {
        return bebida;
    }
}