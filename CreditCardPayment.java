class CreditCardPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("Making payment using Credit Card");
        // do something specific to credit card payment
        return true;
    }
}
