public class AmountException extends Exception {
    private final Double remainingAmount;

    public AmountException(String message, Double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public Double getRemainingAmount() {
        return remainingAmount;
    }
}
