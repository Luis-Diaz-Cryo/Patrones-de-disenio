package SistemaDeGestiónDeRestaurantes;

public abstract class Orden {

    public abstract void tomarOrden();

    public abstract void verificarDispo();

    public abstract void prepararOrden();

    public abstract void calcularPrecio();

    public final void procesarOrden() {
        tomarOrden();
        verificarDispo();
        prepararOrden();
        calcularPrecio();

    }


}
