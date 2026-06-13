package practiceJava;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.Scanner;
public class missingdigits {

	public static void main(String[] args) {
		//int[] a = {4,2,1,6,8,18};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your size of an array::::---");
		int size = sc.nextInt();
		int[] a = new int[size];
		 System.out.println("Enter " + size + " integer elements::::---");
	        for (int i = 0; i < size; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            a[i] = sc.nextInt();
	        }
		
        //Arrays.sort(a);
//        int start =a[0];
//        int end = a[a.length-1];
        
        /*for(int i=start;i<=end;i++) {
        	boolean found = false;
        	//for(int num:a) 
        	for(int j=0;j<a.length;j++){
        		int num = a[j];
        	    if(num==i) {
	        		found = true;
	        		break;
        	    } 
        	}
        	if(!found) {
        		System.out.print(i+" ");
        	}
        	
        }*/
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<a.length;i++) {
        	set.add(a[i]);
        }
        System.out.println(set);
        int n= a[a.length-1];
        for (int i = 1; i <=n; i++) {
            if (!set.contains(i)) {
                System.out.print(i + " ");
            }
        }
       
		
	}

}
