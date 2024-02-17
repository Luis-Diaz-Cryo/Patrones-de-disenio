package DecoraciónDeHabitacionesEnUnHotel;

public abstract class Decorator implements RoomDecoration {


    @Override
    public String decorateRoom() {
        return "room decorated";
    }

}
