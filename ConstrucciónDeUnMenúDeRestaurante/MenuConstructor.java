package ConstrucciónDeUnMenúDeRestaurante;

public class MenuConstructor implements MenuInterface{

    private Entrada entrada;
    private PlatoFuerte platoFuerte;
    private Postre postre;
    private Bebida bebida;

    @Override
    public void setEntrada(Entrada entrada){
        this.entrada = entrada;
    }

    @Override
    public void setPlatoFuerte(PlatoFuerte platoFuerte) {
        this.platoFuerte = platoFuerte;
    }

    @Override
    public void setPostre(Postre postre) {
        this.postre = postre;
    }

    @Override
    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public Menu getResultado(){
        return new Menu(entrada, platoFuerte, postre, bebida);
    }
}
