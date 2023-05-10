package semantic.exception;

public class AlreadyDefinedException extends RuntimeException {

    public AlreadyDefinedException(String error) { super(error); }
}
