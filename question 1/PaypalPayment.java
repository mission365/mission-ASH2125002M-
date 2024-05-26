class PayPalPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("Making payment using PayPal");
        // do something specific to PayPal payment
        return true;
    }
}
