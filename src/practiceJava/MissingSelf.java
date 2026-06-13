package practiceJava;

import java.util.Scanner;
import java.util.TreeSet;

public class MissingSelf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you size of an array =");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.print("Enter your"+" "+(i+1)+" "+"element - ");
			arr[i]=sc.nextInt();
		}
		TreeSet<Integer> set = new TreeSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		int n=arr[arr.length-1];
		System.out.println(set);	
		for(int i=1;i<n;i++) {
			 if (!set.contains(i)) {
	                System.out.print(i + " ");
	            }
		}
		
	}

}
