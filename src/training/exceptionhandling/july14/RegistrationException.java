package training.exceptionhandling.july14;

public class RegistrationException extends Exception{

    private int errorCode;

    private String errorMessage;

    public RegistrationException(int errorCode, String errorMessage){
        super(errorMessage); //this = currentclass, super = parent
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public String toString() {
        return "RegistrationException{" +
                "errorCode=" + errorCode +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
