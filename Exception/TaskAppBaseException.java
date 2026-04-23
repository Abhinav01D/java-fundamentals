package Exception;

public class TaskAppBaseException extends RuntimeException {
    public TaskAppBaseException(String s) {
        super(s);
    }

    // You were missing THIS constructor, which allows wrapping exceptions
    public TaskAppBaseException(String s, Throwable cause) {
        super(s, cause);
    }
}