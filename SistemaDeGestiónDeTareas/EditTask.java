package SistemaDeGestiónDeTareas;

public class EditTask implements Command{

    @Override
    public void execute() {
        System.out.println("you have finished editing the task");
    }

    @Override
    public void undo() {
        System.out.println("edits have been undone");

    }


}
