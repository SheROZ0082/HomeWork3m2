public class Account {
    private Double amount = 0.0;

    public Double getAmount() {
        return amount;
    }

    public void deposit(Double som) {
        amount += som;
        System.out.println("Вы пополнили счет на: " + som);
    }

    public void withDraw(Double som) {
        try {
            if (som > getAmount()) {
                throw new AmountException("Операция недоступна, недостаточно средств на счету: ", getAmount());
            } else {
                amount -= som;
                System.out.println("Вы сняли: " + som + " " + "Остаток на счету: " + getAmount());
            }
        } catch (AmountException amountException) {
            System.out.println(amountException.getMessage() + amountException.getRemainingAmount());
            withDraw(2000.0);
        }
    }
}