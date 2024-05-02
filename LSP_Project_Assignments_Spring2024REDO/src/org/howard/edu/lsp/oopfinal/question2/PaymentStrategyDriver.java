package org.howard.edu.lsp.oopfinal.question2;

public class PaymentStrategyDriver {

	public static void main(String[] args) {
		PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
		PaymentStrategy payPalPayment = new PayPalPayment("user@example.com");
		PaymentStrategy bitcoinPayment = new BitcoinPayment("1AaBbCcDdEeFfGgHh");
		
		ShoppingCart myCart = new ShoppingCart();
		
		myCart.setPaymentStrategy(creditCardPayment);
		myCart.checkout(100.0);
		
		myCart.setPaymentStrategy(payPalPayment);
		myCart.checkout(50.0);
		
		myCart.setPaymentStrategy(bitcoinPayment);
		myCart.checkout(75.0);

	}

}
