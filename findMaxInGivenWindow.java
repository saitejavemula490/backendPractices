package practiceJava;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class findMaxInGivenWindow {

	public static void main(String[] args) {
		int[] a={1,3,-1,-3,5,3,6,7};
		int k=3;
		System.out.println(Arrays.toString(findmaxinWindow(a,k)));

	}

	
	private static int[] findmaxinWindow(int[] a, int k) {
		
		int n = a.length;
		//Using dq
//		int[] res = new int[a.length-k+1];
//		Deque<Integer> dq= new LinkedList<>();
//		for(int i=0;i<a.length;i++) {
//			if(!dq.isEmpty()&& dq.peekFirst() <= i-k) {
//				dq.pollFirst();
//			}
//			while(!dq.isEmpty() && a[dq.peekLast()]<a[i]) {
//				dq.pollLast();
//			}
//			dq.offerLast(i);
//			if(i>=k-1) {
//				res[i-k+1]=a[ dq.peekFirst()];
//			}
//		}
//		return Arrays.toString(res);
		//==============================================
		//Using streams
		//==============================================
		return IntStream.range(0,n-k+1).map(i->IntStream.range(i,i+k).map(j->a[j]).max().getAsInt()).toArray();
	}

}
