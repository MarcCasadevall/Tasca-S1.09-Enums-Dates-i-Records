package ex4;

public class Main {
    public static PaymentMethod parsePayment(String text) {
        try {
            return PaymentMethod.valueOf(text.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid payment method: " + text);
            return null;
        }
    }

    public static void main(String[] args) {
        PaymentMethod p1 = parsePayment("CaSh");
        PaymentMethod p2 = parsePayment("caRd");
        PaymentMethod p3 = parsePayment("biTCoiN");

        if (p1 != null){
            System.out.println(p1.getMessage());
        }
        if (p2 != null){
            System.out.println(p2.getMessage());
        }
        if (p3 != null){
            System.out.println(p3.getMessage());
        }
    }
}
