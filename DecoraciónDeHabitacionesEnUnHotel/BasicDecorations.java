package DecoraciónDeHabitacionesEnUnHotel;

public class BasicDecorations implements RoomDecoration {
    @Override
    public String decorateRoom() {
        return "basic room decoration has been applied to the room";
    }
}
