package practiceJava;

import java.util.Arrays;

public class exceptSelfProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr = {1,0,3,0};
     int[] op = exceptSelfproduct(arr);	
     System.out.println(Arrays.toString(op));
     }

	private static int[] exceptSelfproduct(int[] arr) {
		
		int zerosCount = 0;
		int product = 1;
		int n = arr.length;
		for(int num: arr) {
			if(num==0) {
				zerosCount++;
			} else {
				product*=num;
			}
		}
		int[] res = new int[n];
		if(zerosCount>1) {
			
		return res;
		} else if(zerosCount==1) {
			for(int i=0;i<n;i++) {
				if(arr[i]==0) {
					res[i]=product;
				}else {
					res[i]=0;
				}
			}
		} else {
			for(int i=0;i<n;i++) {
				res[i]= product/arr[i];
			}
		}
		return res;
	}

}
