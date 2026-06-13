package practiceJava;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class evenoddsort {

	public static void main(String[] args) {
		int[] a= {2,1,13,8,4,1};
		int k=2;
		rotate(a,k);
		System.out.println(Arrays.toString(a));

	}	 
		
	public static void rotate(int[] a,int k) {
	 int n=a.length;
	 reverse(a,0,n-1);
	 reverse(a,0,k-1);
	 reverse(a,k,n-1);
	 
     }
	 private static void reverse(int[] a,int start,int end) {
		 while(start<end) {
		 int temp=a[start];
		 a[end]=a[start];
		 a[end]=temp;
		 start++;
		 end--;
		 }
	 }
		

	}
	
	
	


