package practiceJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstandSecondLargest {

	public static void main(String[] args) {
		int[] arr= {14,14,5,11,7,10,45,45,2,3};
		
		int l = Integer.MIN_VALUE;
	int sl =Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]>l) {
			sl = l;
			l=arr[i];
		}else if(arr[i]>sl && arr[i]!=l) {
			sl=arr[i];
		}
		}
		System.out.println(l);
		System.out.println(sl);
		
		// another streams way 
		
		int l2 = Arrays.stream(arr).boxed().distinct().max(Comparator.naturalOrder()).get();
		int sl2 = Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
		System.out.println(l2);
		System.out.println(sl2);
	}

}
