package ConstrucciónDeUnMenúDeRestaurante;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        MenuConstructor constructor = new MenuConstructor();
        Director.construirMenu(constructor);

        Menu menu = constructor.getResultado();
        System.out.println("El menu es: " + menu.getPlatoFuerte());

    }

}
