package africa.semicolon.Exception;

public class InvalidPhoneNumberException extends RuntimeException{
    public InvalidPhoneNumberException(String message){
        super(message);
    }
}
