public class VoitureException extends Exception {
    public VoitureException(){
        super("VitesseLimiteDepasseeException.");
    }
    
    public VoitureException(String message){
        super(message);
    }
}
