package practiceJava;

import java.util.Scanner;

public class fibba {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("enter cheyu ra puka N ni ::");
			int n = sc.nextInt();
//			System.out.print("enter n::"+""+n);
//			int a=0;
//			int b=1;
//			int c=0;
//			int d =0;
//			System.out.print(a +","+b);
//			for(int i=0;i<n;i++) {
//				c=a+b;
//				System.out.print(","+c);
//				a=b;
//				b=c;
//				d = a+b+c;
//				
//			}
//			System.out.println("Sum of all ra series-"+d);
			for(int i=0;i<n;i++) {//using recusion 
				System.out.print(fib(i)+" ");
			}
		}

		}
		static int fib(int n) {// using recursion 
			if(n==0) return 0;
			if (n==1) return 1;
			else return fib(n-1)+fib(n-2);
        }

}
