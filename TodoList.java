import java.util.ArrayList;

public class TodoList {
    int numComplete;
    ArrayList<Todo> todos = new ArrayList<>();
    ArrayList<Todo> completedTodos = new ArrayList<>();

    public TodoList() {

    }

    public void checkCommand(String command) {
        if (command.contains("add ")) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nTodoApp!\nPriorities:");
            String theTodo = command.substring(command.lastIndexOf("add ") + 4);
            todos.add(new Todo(theTodo));

            for (int i = 0; i < todos.size(); ++i) {
                todos.get(i).showTodo();
            }
            System.out.println("\nCompleted:");
            for (int i = 0; i < completedTodos.size(); ++i) {
                completedTodos.get(i).showTodo();
            }
        } else if (command.contains("complete ")) {
            String completeTodo = command.substring(command.lastIndexOf("complete ") + 9);
            int completeTodoIndex = Integer.parseInt(completeTodo);
            completedTodos.add(todos.get(completeTodoIndex-1));
            todos.remove(completeTodoIndex-1);

            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nTodoApp!\nPriorities:");
            for (int i = 0; i < todos.size(); ++i) {
                todos.get(i).showTodo();
            }
            System.out.println("\nCompleted:");
            for (int i = 0; i < completedTodos.size(); ++i) {
                completedTodos.get(i).showTodo();
            }
        } else if (command.contains("remove ")) {
            String removeTodo = command.substring(command.lastIndexOf("remove ") + 7);
            int removeTodoIndex = Integer.parseInt(removeTodo);
            todos.remove(removeTodoIndex-1);

            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nTodoApp!\nPriorities:");
            for (int i = 0; i < todos.size(); ++i) {
                todos.get(i).showTodo();
            }
            System.out.println("\nCompleted:");
            for (int i = 0; i < completedTodos.size(); ++i) {
                completedTodos.get(i).showTodo();
            }
        }           
    }   
}