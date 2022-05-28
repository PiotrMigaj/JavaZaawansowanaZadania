package pl.migibud.day2.ex24.exceptions;

public class BasketEmptyException extends RuntimeException{
    public BasketEmptyException(String message) {
        super(message);
    }
}
