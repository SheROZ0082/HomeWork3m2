public class User {
    private static final Account account = new Account();

    public static void makeDepositAndWithdrawMoney() {
        account.deposit(20000.0);
        while (account.getAmount() > 0) {
            account.withDraw(6000.0);
        }
    }
}
