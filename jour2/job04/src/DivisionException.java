public class DivisionException extends Exception {

    public DivisionException(){
        super("DivisionParZeroException.");
    }

    public DivisionException(String message) {
        super(message);
    }
}
