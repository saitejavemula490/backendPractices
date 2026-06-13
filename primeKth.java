package practiceJava;

public class primeKth {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=10;
		System.out.println(kthprime(k));
	}
	
	private static boolean isPrime(int k) {
		// TODO Auto-generated method stub
		if(k<=1) return false;
		if(k==2) return true;
		if(k%2==0) return false;
		for(int i=3;i<=Math.sqrt(i);i+=2) {
			if(k%i==0)return false;
		}
		return true;	
	
      }
	 public static int kthprime(int k) {
		 int count=0;
			int num=1;
		 while(count<k) {
			 num++;
			 if(isPrime(num)) {
				 count++;
			 }
		 }
		return num;
		 
	 }

}
