public class InstituteException extends RuntimeException{

    InstituteException(String errorMessage) {
        super(errorMessage);
    }

    InstituteException(String errorMessage, Throwable error) {
        super(errorMessage, error);
    }
}
