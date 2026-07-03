import java.util.Scanner;

public class UserInterface {
    private TodoList ToDoList;
    private Scanner scanner;

    public UserInterface(TodoList tasks, Scanner scanner){
        this.scanner = scanner;
        this.ToDoList = tasks;
    }

    public void start(){
    
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equals("add")) {
            System.out.println("Task: ");

            String toAdd = scanner.nextLine();
            ToDoList.add(toAdd);

        }else if (command.equals("stop")) {
            break;
        } else if (command.equals("list")) {
            ToDoList.print();
        } else if (command.equals("completed")) {
            System.out.println("which task was completed? ");
            int completedTask = scanner.nextInt();
            scanner.nextLine();
            ToDoList.remove(completedTask);
        } else if (command.equals("remove")) {
            System.out.println("wich one is removed: ");
            int task = Integer.valueOf(scanner.nextLine());

            ToDoList.remove(task);
        } 

        
        }
    }
}
