package Exception;

public class TaskNotFoundException extends TaskAppBaseException {
    public TaskNotFoundException(String message, Throwable cause) {
        super(message, cause); // Now the parent has this constructor!
    }
}