package SistemaDeGestiónDeTareas;

public class Main {
    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();


        Command CreateTask = new CreateTask();
        taskManager.executeCommand(CreateTask);

        Command EditTask =new EditTask();
        taskManager.executeCommand(EditTask);

        Command CompleTask = new CompleteTask();
        taskManager.executeCommand(CompleTask);

        Command DeleteTask = new CompleteTask();
        taskManager.executeCommand(DeleteTask);

        taskManager.undoLastCommand();



    }
}
