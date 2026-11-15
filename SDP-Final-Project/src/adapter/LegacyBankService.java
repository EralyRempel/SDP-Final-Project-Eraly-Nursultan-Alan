package adapter;

public class LegacyBankService {
    public int makeTransaction(String accountCode, int amountInCents, String currency) {
        System.out.printf("[LegacyBankAPI] Processing %d %s for account %s...%n",
                amountInCents, currency, accountCode);
        // Returns 200 status code on success
        return 200;
    }
}