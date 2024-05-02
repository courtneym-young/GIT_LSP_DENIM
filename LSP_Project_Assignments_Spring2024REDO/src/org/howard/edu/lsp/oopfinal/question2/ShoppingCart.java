package org.howard.edu.lsp.oopfinal.question2;

class ShoppingCart {

	private PaymentStrategy ps;
	
	public void setPaymentStrategy(PaymentStrategy ps) {
		this.ps = ps;
	}
	
	public void checkout(double pay) {
		ps.pay(pay);
	}

}
