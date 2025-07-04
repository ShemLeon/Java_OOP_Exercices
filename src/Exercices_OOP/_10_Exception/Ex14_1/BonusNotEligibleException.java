package Exercices_OOP._10_Exception.Ex14_1;

public class BonusNotEligibleException extends RuntimeException {
    public BonusNotEligibleException(String message) {
        super(message);
    }
}
