package practiceJava;

public class patterns {

	public static void main(String[] args) {
		for(int i= 1; i<=5;i++) {
			for(int j= 1; j<=i;j++) {
				
				System.out.print("*");
			
			}
			System.out.println(" ");
			
		}
		
		for(int i= 5; i>=1;i--) {
			for(int j= 1; j<=i;j++) {
				
				System.out.print("*");
			
			}
			System.out.println(" ");
			
		}
		
		int rows = 5;
		
		for(int i= 1; i<=rows;i++) {
			
			for(int j= i; j<=rows;j++) {
				System.out.print(" ");
			}
			for(int k= 1; k<=(2*i-1);k++) {
				
				System.out.print("*");
			
			} 
			
			System.out.println();
		}
		
	}

}
