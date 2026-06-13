package practiceJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NotRepeatingnum {

	public static void main(String[] args) {
		int[] arr = {1,2,2,3,4,4,6,415,5,3,3,2,1,10,18,12,13,1,415,1};
		List<Integer> listrepeat = new ArrayList<>();
		List<Integer> listNotrepeat = new ArrayList<>();
//		for(int i=0;i<arr.length;i++) {
//            for(int j=i+1;j<arr.length;j++) {
//                if(arr[i]==arr[j]) {
//                    if(!listrepeat.contains(arr[i])) { // avoid duplicates
//                        listrepeat.add(arr[i]);
//                    }
//                }
//            }
//        }
		listrepeat = Arrays.stream(arr)
				           .boxed()
				           .collect(Collectors.groupingBy(d->d,Collectors.counting()))
				           .entrySet().stream()
				           .filter(e->e.getValue()>1)
				           .map(Map.Entry::getKey)
				           .collect(Collectors.toList());
		for(int i=0;i<arr.length;i++) {
			if(!listrepeat.contains(arr[i])) {
				listNotrepeat.add(arr[i]);
			}
		}
         //time complexity o(n3) worst and space complexity o(n) all worst because used the more nested loops inside the function so it was worst 
		System.out.println(listrepeat.toString());
		System.out.println(listNotrepeat.toString()); 
	}

}
