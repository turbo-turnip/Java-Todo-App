import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("TodoApp!");
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();

        while (scanner.hasNext()) {
            String cmd = (String) scanner.nextLine(); 
            todoList.checkCommand(cmd);
        }   
        scanner.close();
    }   

}