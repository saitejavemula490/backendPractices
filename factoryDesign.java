package practiceJava;
//Example of factory design payment interface
public class factoryDesign {

	public static void main(String[] args) throws Exception {
		payment payment = PaymentFactory.getPaymentMethod("CC");
		payment.pay(1800);
	}

	
}
//create inteface
interface payment {
	void pay(double amount);
}
//create diff pyment methods
class CC implements payment {

	@Override
	public void pay(double amount) {
		System.out.println("payment done through CC: "+amount);
	}
	
}
class upi implements payment {

	@Override
	public void pay(double amount) {
		System.out.println("payment done through UPI: "+amount);
		
	}
	
}
//create class payemnt factory to intialize getpayment method from main function
class PaymentFactory{
	public static payment getPaymentMethod(String type) throws Exception {
		if("UPI".equalsIgnoreCase(type)) {
			return new upi();
		} else if ("CC".equalsIgnoreCase(type)) {
			return new CC();
		}
		throw new Exception("Unkown payment"); 
		
	}
}




