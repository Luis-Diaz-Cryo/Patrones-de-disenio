package ConstrucciónDeUnMenúDeRestaurante;

public class Menu {

    private final Entrada entrada;
    private final PlatoFuerte platoFuerte;
    private final Postre postre;
    private final Bebida bebida;

    public Menu(Entrada entrada, PlatoFuerte platoFuerte, Postre postre, Bebida bebida, Entrada entrada1, PlatoFuerte platoFuerte1, Postre postre1, Bebida bebida1){


        this.entrada = entrada1;
        this.platoFuerte = platoFuerte1;
        this.postre = postre1;
        this.bebida = bebida1;
    }

    public Entrada getEntrada(){
        return entrada;
    }

    public PlatoFuerte getPlatoFuerte(){
        return platoFuerte;
    }

    public Postre getPostre(){
        return postre;
    }

    public Bebida getBebida(){
        return bebida;
    }
}