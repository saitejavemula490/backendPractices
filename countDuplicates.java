package practiceJava;

import java.util.HashMap;
import java.util.Map;

public class countDuplicates {

	public static void main(String[] args) {
		int[] a = {1,2,4,5,1,2,3,3,3,3,3,3,4,6,4,4};
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int num : a) {
			map.put(num, map.getOrDefault(num,0)+1);
		}
		System.out.println(map);
		
//		int count =1;
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]==a[j]) {
//					count++;
//				}
//			}
//			if(count>1) {
//			System.out.println(a[i]+"="+count);
//			count =1;
//			}
//		}

	}

}
