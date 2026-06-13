package practiceJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Optional;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class practiceJava {

	public static void main(String[] args) {
		//int[] arr1 = {1,3,5,6,7,1,1,0,128,7,8};
		
		//List<Integer> list = Arrays.stream(arr1).distinct().boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		String s="Java is good java is";
		
		String str = "saiteja";
		
		String rep = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				           .entrySet()
				           .stream()
				           .filter(e->e.getValue()>1)
				           .map(e->e.getKey())
				           .findFirst()
				           .orElse(null);
		
		
		String rev = Arrays.stream(s.split(" ")).reduce((a,b)->b+" "+a).orElse("");
		StringBuilder rev1 = new StringBuilder(rev).reverse();
		String r = Arrays.stream(s.split(" ")).distinct().collect(Collectors.joining(" "));
		//Integer third = list.stream().skip(2).findFirst().orElse(-1);
//		Map<Integer,Integer> result = new HashMap<>();
//		for(int i:arr1) {
//			result.put(i, result.getOrDefault(i,0)+1);
//		}
//		String 
//		
//		
	System.out.println(rep);
	System.out.println(rev1);
	System.out.println(r);
		//int[] arr2 = {2,6,8};
	
	
	
		
		//int[] merged = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().filter(i->i!=0).toArray();
	
	
	
//		int[] merged = new int[arr1.length+arr2.length];
//			System.out.println(Arrays.toString(merged));
		//arr1 = Arrays.stream(arr1).filter(e->e!=0).toArray();
		//int[] combined = new int[arr1.length + arr2.length];
		//System.out.println(Arrays.toString(arr1));
//		 for (int i = 0; i < arr1.length; i++) {
//	            combined[i] = arr1[i];
//	        }
//		 // Step 3: Copy elements from array2
//        for (int i = 0; i < arr2.length; i++) {
//            combined[arr1.length + i] = arr2[i];
//        }
//        
//        combined = Arrays.stream(combined).filter(e->e!=0).toArray();
//        Arrays.sort(combined);
//		System.out.println(Arrays.toString(combined));
	}

	

}
