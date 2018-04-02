package test.playgendary.exception;

public class RoomIsNotFreeException extends Exception{
    public RoomIsNotFreeException() {
        super();
    }

    public RoomIsNotFreeException(String message) {
        super(message);
    }

    public RoomIsNotFreeException(String message, Throwable cause) {
        super(message, cause);
    }

    public RoomIsNotFreeException(Throwable cause) {
        super(cause);
    }
}
