package pl.migibud.day2.ex24.exceptions;

public class BasketFullException extends RuntimeException{
    public BasketFullException(String message) {
        super(message);
    }
}
