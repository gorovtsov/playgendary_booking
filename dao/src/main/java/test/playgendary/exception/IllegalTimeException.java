package test.playgendary.exception;

public class IllegalTimeException extends Exception {
    public IllegalTimeException() {
        super();
    }

    public IllegalTimeException(String message) {
        super(message);
    }

    public IllegalTimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalTimeException(Throwable cause) {
        super(cause);
    }
}
