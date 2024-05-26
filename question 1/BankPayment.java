class BankPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("Making payment using Bank Transfer");
        // do something specific to bank transfer payment
        return true;
    }
}
