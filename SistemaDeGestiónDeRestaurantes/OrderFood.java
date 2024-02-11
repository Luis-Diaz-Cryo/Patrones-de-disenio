package SistemaDeGestiónDeRestaurantes;

    public class OrderFood extends Orden {

        @Override
        public void tomarOrden(){
            System.out.println("Tomando pedido de comida");
        }

        @Override
        public void prepararOrden() {
            System.out.println("Preparando la orden de comida");
        }

        @Override
        public void calcularPrecio() {
            System.out.println("Calculando el precio de la comida");
        }
    }
