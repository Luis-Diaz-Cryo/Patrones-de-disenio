package SistemaDeGestiónDeTareas;

public class DeleteTask implements Command {

    @Override
    public void execute() {
        System.out.println("class has been deleted");
    }

    @Override
    public void undo() {
        System.out.println("deletion has been undone");
    }




}
