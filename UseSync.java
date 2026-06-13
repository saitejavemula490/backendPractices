package practiceJava;
class Bankaccount{
	private static int  balanceamount =180;
	public synchronized void withdraw(int givenamount,String name) {
		if(balanceamount>=givenamount) {
			
			balanceamount-=givenamount;
			System.out.println(name+" your amount deducted::"+givenamount+" reaming balance is::== "+balanceamount);
		}else {
			System.out.println("Insuffucent funds");
		}
	}
	
}
class withdrawtask implements Runnable{

	private Bankaccount account;
	private int amount;
	private String name;

	

	public withdrawtask(Bankaccount account, int i, String name) {
		this.account = account;
		this.amount = i;
		this.name = name;
	}

	@Override
	public void run() {
		account.withdraw(amount,name);
		
	}
	
}
public class UseSync {

	public static void main(String[] args) {

     Bankaccount account = new Bankaccount();
     
     
     
     Thread t1 = new Thread(new withdrawtask(account,80,"sai"));
     Thread t2 = new Thread(new withdrawtask(account,60,"teja"));

     t1.start();
     t2.start();
     

	}

}
