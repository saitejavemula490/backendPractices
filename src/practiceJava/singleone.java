package practiceJava;

import java.util.Arrays;
import java.util.OptionalInt;

public class singleone {

	public static void main(String[] args) {
		int max1 =0;
		int max2 =0;
		int max3 =0;
		
	 int[] a = {1,2,-2147483648};
	 int L = a.length;
	 Arrays.sort(a);//[1, 2, 2, 2, 4]
	 max1 = Arrays.stream(a).max().getAsInt();
	 for(int i=0;i<L;i++) {
		if(a[i]==max1) {
			a[i]=0;
		} 
	 }
	 System.out.println(max1);
	 System.out.println(Arrays.toString(a));
	 max2 = Arrays.stream(a).max().getAsInt();
	 System.out.println(max2);
	 for(int i=0;i<L;i++) {
			if(a[i]==max2) {
				a[i]=0;
			} 
		 }
	 System.out.println(Arrays.toString(a));
	 max3 = Arrays.stream(a).max().getAsInt();
	 
	 System.out.println(max3);
	 }
	
	
	}



