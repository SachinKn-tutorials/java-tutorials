package javaTypes;

public class InterfaceAndAbstractClassDiff {

    int x = 10;
    String s1 = "Sachin";
    CheckoutPage cp = new NewCheckoutPage();

    public static void main(String[] args) {
        CheckoutPage checkoutPage = new CheckoutPage() {
            @Override
            public void verifyDetails() {

            }
        };

        CheckoutPage checkoutPage1 = new NewCheckoutPage();
    }

}

interface CheckoutPage {
    void verifyDetails();
}

abstract class CheckoutPage_1 {
    abstract void verifyDetails();
    void makePayment() {

    }
}

class NewCheckoutPage implements CheckoutPage {
    @Override
    public void verifyDetails() {

    }
}
