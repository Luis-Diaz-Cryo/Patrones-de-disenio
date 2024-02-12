package SistemaDeGestiónDeTareas;

public class CompleteTask implements Command{
    @Override
    public void execute() {
        System.out.println("task has been completed");
    }

    @Override
    public void undo() {
        System.out.println("task completion has been undone");

    }
}
