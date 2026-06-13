package practiceJava;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		int[] a= {1,0,3,0,1,2};
		
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
		}
		System.out.print(Arrays.toString(a));
		//stream way 
		int[] res = IntStream.concat(Arrays.stream(a).filter(x->x!=0), Arrays.stream(a).filter(x->x==0)).toArray();
		System.out.print(Arrays.toString(res));

	}

}
