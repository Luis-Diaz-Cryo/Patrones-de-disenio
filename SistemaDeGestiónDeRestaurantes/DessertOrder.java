package SistemaDeGestiónDeRestaurantes;

public class DessertOrder extends Orden {

    @Override
    public void tomarOrden(){
        System.out.println("Tomando pedido de postres de la orden");
    }

    @Override
    public void verificarDispo() {
        System.out.println("Verificando disponibilidad de ingredientes");
    }

    @Override
    public void prepararOrden() {
        System.out.println("Preparando postres postres del pedido");
    }

    @Override
    public void calcularPrecio() {
        System.out.println("Calculando el precio de los postres del pedido");
    }

}
