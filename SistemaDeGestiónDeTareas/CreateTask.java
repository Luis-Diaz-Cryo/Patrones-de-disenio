package SistemaDeGestiónDeTareas;


public class CreateTask implements Command {


    @Override
    public void execute() {
        System.out.println("task has been created");

    }

    @Override
    public void undo() {
        System.out.println("undone");

    }




}
