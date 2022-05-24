package thymeleaf.exceptions;

public class StudentNotFound extends RuntimeException{

    public StudentNotFound() {
    }

    public StudentNotFound(String message) {
        super(message);
    }
}
