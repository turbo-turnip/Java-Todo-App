import java.time.LocalTime;

public class Todo {
    String todo;
    boolean isComplete = false;

    public Todo(String todo) {
        this.todo = todo;
    }

    public void showTodo() {
        LocalTime time = LocalTime.now();
        System.out.println(todo + " — " + time);
    }   

}