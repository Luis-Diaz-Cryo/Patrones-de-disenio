package SistemaDeGestiónDeTareas;

public class Main {
    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();


        Command createTask = new CreateTask();
        taskManager.executeCommand(createTask);

        Command editTask = new EditTask();
        taskManager.executeCommand(editTask);

        Command completeTask = new CompleteTask();
        taskManager.executeCommand(completeTask);

        Command deleteTask = new CompleteTask();
        taskManager.executeCommand(deleteTask);

        taskManager.undoLastCommand();


    }
}
