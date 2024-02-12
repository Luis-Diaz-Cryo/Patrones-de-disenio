package SistemaDeGestiónDeRestaurantes;

public class Main {

    public static void main(String[] args) {
        //Crear una orden de comida



        Orden ordenComida = new OrderFood();
        System.out.println("Orden de comida procesando");
        ordenComida.procesarOrden();
        System.out.println();

        Orden ordenBebida = new beverageOrder();
        System.out.println("Las bebidas se están procesando");
        ordenBebida.procesarOrden();
        System.out.println();

        Orden ordenPostre = new dessertOrder();
        System.out.println("Procesando postres de la orden");
        ordenPostre.procesarOrden();
        System.out.println();




    }

}
