package practiceJava;

public class JumpGameI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[]  a= {2, 3, 1, 1, 4};
     int maxReach = 0;
     for (int i = 0; i < a.length; i++) {
		 maxReach =Math.max(maxReach, i+a[i]);
		 if(i<=maxReach) {
			 System.out.print(true);
		 }
	}
     System.out.print(false);
     
	}

}
