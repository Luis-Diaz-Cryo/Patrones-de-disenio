package DecoraciónDeHabitacionesEnUnHotel;

public class Main {
    public static void main(String[] args) {

        RoomDecoration basicRoom = new BasicDecorations();

        RoomDecoration decoratedRoom1 = new FreshFlowers();
        RoomDecoration decoratedRoom2 = new GourmetChocolate();
        RoomDecoration decoratedRoom3 = new HighQualityWine();

        System.out.println(basicRoom.decorateRoom());

        System.out.println(decoratedRoom1.decorateRoom());
        System.out.println(decoratedRoom2.decorateRoom());
        System.out.println(decoratedRoom3.decorateRoom());

    }
}

//a