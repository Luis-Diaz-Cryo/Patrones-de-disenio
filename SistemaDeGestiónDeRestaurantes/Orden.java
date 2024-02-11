package SistemaDeGestiónDeRestaurantes;

public abstract class Orden {

    public void tomarOrden() {
    }

    public void verificarDispo(){

    }
    public void prepararOrden(){
    }
    public void calcularPrecio(){
    }

    public final void procesarOrden(){
        tomarOrden();
        verificarDispo();
        prepararOrden();
        calcularPrecio();

    }


}
