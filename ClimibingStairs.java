package practiceJava;

import java.util.Scanner;

public class ClimibingStairs {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
        System.out.print("Enter number of stairs: ");
        int k = sc.nextInt(); 
		System.out.println("climbed stairs on this k is====> "+climbstr(k));
		sc.close();

	}

	private static int climbstr(int i) {
		// TODO Auto-generated method stub
		if(i<=2)return i;
		int a=1;
		int b =2;
		for (int j = 3; j <= i; j++) {
			int c=a+b;
			a=b;
			b=c;
		}
		return b;
	}

}
