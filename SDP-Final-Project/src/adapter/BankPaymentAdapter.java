package adapter;

import java.util.Objects;

public class BankPaymentAdapter implements PaymentProcessor {
    private final LegacyBankService legacyBankService;
    private final String defaultCurrency;

    public BankPaymentAdapter(LegacyBankService legacyBankService, String defaultCurrency) {
        this.legacyBankService = Objects.requireNonNull(legacyBankService, "LegacyBankService cannot be null");
        this.defaultCurrency = Objects.requireNonNull(defaultCurrency, "Currency cannot be null");
    }

    @Override
    public boolean processPayment(String studentId, double amountInDollars) {
        if (studentId == null || studentId.isBlank() || amountInDollars <= 0) {
            throw new IllegalArgumentException("Invalid student ID or payment amount");
        }

        String accountCode = "SCH-" + studentId;
        int amountInCents = (int) Math.round(amountInDollars * 100);

        int statusCode = legacyBankService.makeTransaction(accountCode, amountInCents, defaultCurrency);
        return statusCode == 200;
    }
}