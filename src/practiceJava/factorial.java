package practiceJava;
import java.util.Scanner;


public class factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*try  { using with loops 
			System.out.print("Enter Your Number -");
			int n = sc.nextInt();
			long fact =1;
			
			for(int i=1;i<=n;i++) {
				
				fact = fact*i;
			}
			System.out.println(fact);
		} catch (Exception  e) {
			System.out.print("somethimg got error"+" "+e);
		} finally {
			sc.close();
		}*/
		//=====================================================
		//using with recursion
		//======================================================
		try {
			System.out.print("Enter Your Number -");
		int n = sc.nextInt();
		    
		
			System.out.println(fact(n));
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			sc.close();
		}
			
	}
		static long fact(int n) {
			if(n==0)return 1;
			
			return n * fact(n - 1);
		}
	

	

}
