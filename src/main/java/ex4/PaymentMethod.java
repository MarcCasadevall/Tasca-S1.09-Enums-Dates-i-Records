package ex4;

public enum PaymentMethod {
    CASH,
    CARD,
    PAYPAL;

    public String getMessage(){
        return "Payment accepted with " + this;
    }
}
