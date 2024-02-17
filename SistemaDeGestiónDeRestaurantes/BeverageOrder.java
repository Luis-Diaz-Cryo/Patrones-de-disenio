package SistemaDeGestiónDeRestaurantes;

public class BeverageOrder extends Orden {

    @Override
    public void tomarOrden() {
        System.out.println("Tomando pedido de bebidas");
    }

    @Override
    public void verificarDispo() {
        System.out.println("Verificando disponibilidad de ingredientes");
    }

    @Override
    public void prepararOrden() {
        System.out.println("Iniciando preparación de bebidas de la orden");
    }

    @Override
    public void calcularPrecio() {
        System.out.println("Calculando el precio de las bebidas de la orden");
    }
}
