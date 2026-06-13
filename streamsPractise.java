package practiceJava;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class streamsPractise {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="apple lemons apple apple lemoms fruits";
		//String[] words= s.split(" ");
//		Map<String,Integer> map = new HashMap<>();
		//int n=16;
		//System.out.println(isPowerOf2(n));
//		
//		for(String i :s.split(" ")) {
//			//map.put(i, map.getOrDefault(i, 0)+1);
//			map.merge(i,1,Integer::sum);
//		}
//		System.out.println(map);
				//		Map<String, Integer> scores = new HashMap<>();
//		scores.put("Mahesh ", 45);
//		scores.put("NTR", 30);
//		scores.put("Chiru", 75);
//		scores.put("Balu", 60);
//		scores.put("Munna", 10);
//
//		List<Map.Entry<String,Integer>> ss = scores.entrySet().stream().filter(x->x.getKey().toLowerCase().startsWith("m"))
//				.filter(x->x.getKey()!="Munna")
//				.collect(Collectors.toList());
//		System.out.println(ss);
		
//		List<Map.Entry<String,Integer>> sorted = scores.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
//		System.out.println(sorted);
		//int[] e= {1,3,2,21,1,12,4,8};
//		int[] f= {1,3,4,2,4,5,4};
//		
//		//int sum = Arrays.stream(e).reduce((a,b)->a*b).getAsInt();
//		int max = Arrays.stream(e).min().getAsInt();
//		System.out.println(max);
		
//		HashMap<Integer,Integer> map = new HashMap<>();
//		
//		for(int num : a) {
//			map.put(num, map.getOrDefault(num, 0)+1);
//		}
		
//        List<Integer> union = IntStream.concat(Arrays.stream(a),Arrays.stream(b))
//		                                 .distinct().boxed().sorted().collect(Collectors.toList());
//        int[] c =IntStream.concat(Arrays.stream(a),Arrays.stream(b)).distinct().boxed().sorted().mapToInt(x->x).toArray();
        
//		int d=12345;
//		
//		Integer sum = Arrays.stream(String.valueOf(d).split("")).collect(Collectors.summingInt(Integer::parseInt));
//		System.out.println(map);
        //System.out.println(Arrays.toString(c));
		
		//double  sum = Arrays.stream(e).average().getAsDouble();
		
//		List<Integer> rep = map.entrySet().stream().filter(x->x.getValue()==1)
//				.map(Map.Entry::getKey)
//				.collect(Collectors.toList());
//		Integer max = Arrays.stream(a).boxed()
//				                      .collect(Collectors.groupingBy(x->x,Collectors.counting()))
//				                      .entrySet()
//				                      .stream()
//				                      .max(Map.Entry.comparingByValue())
//				                      .map(Map.Entry::getKey)
//				                      .orElseThrow();
		
		
//		String s="saiteja";
//		
//		String f = Arrays.stream(s.split("")).collect(Collectors.groupingBy(x->x,Collectors.counting()))
//				                             .entrySet()
//				                             .stream()
//				                             .filter(x->x.getValue()==1)
//				                             .map(Map.Entry::getKey)
//				                             .findFirst()
//				                             .orElse(null);
//		
//		System.out.println(f);
	//	=======================================================================================
//		Map<Boolean, List<Integer>> partitioned = Arrays.stream(e).boxed().distinct().sorted()
//			    .collect(Collectors.partitioningBy(x -> x % 2 == 0));
//		
//		System.out.println(partitioned.get(true));
//		System.out.println(partitioned.get(false));
		//============================================================================================
//		String[] arr = {"cat", "elephant", "dog", "giraffe", "zebra"};
//		int Len = Arrays.stream(arr).mapToInt(String::length).max().orElse(0);
//		System.out.println(Len);
//		String longest = Arrays.stream(arr).max(Comparator.comparingInt(String::length)).orElse("");
//		System.out.println(longest);
		//================================================================================
//		int i =12345;
//		int sum = Arrays.stream(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
//		System.out.println(sum);
		//==============================================================================================
//		String str = "Java java Concept Of The Day";
//		
//
//		String result = Arrays.stream(str.split(" "))
//		    .map(String::toLowerCase)                 // case-insensitive duplicates
//		    .distinct()                               // duplicates remove
//		    .map(x -> new StringBuilder(x).reverse().toString()) // ప్రతి word reverse
//		    .collect(Collectors.joining(" ")); 
//		System.out.println(result);
//		String r = new StringBuilder(str).reverse().toString();
//		System.out.println(r);
//	     List<String> word =  Arrays.asList(str.split(" "));
//	     Collections.reverse(word);
//	     String op = word.stream().collect(Collectors.joining(" "));
//	     System.out.println(op);
//	     
//	     String opt = IntStream.range(1,str.split(" ").length)
//	    		              .mapToObj(i->str.split(" ")[str.split(" ").length-i])
//	    		              .collect(Collectors.joining(" "));
//	     System.out.println(opt);
//		String res = Arrays.stream(str.split(" ")).map(x->x.substring(0,1).toUpperCase()+x.substring(1)).collect(Collectors.joining(" "));
//		System.out.println(res);
		//=================================================================================
		String[] strs= {"flower", "flow", "flight"};
		String res = Arrays.stream(strs).reduce((a,b)->{
			int i=0;
			while(i<a.length()&& i<b.length()&&a.charAt(i)==b.charAt(i)) {
				i++;
			}
			return a.substring(0,i);
		}).orElse(" ");
		System.out.println(res);
//		=====================================================================================
//		String[] str = {"Telugu", "Tamil","Malayalam"};
//		List<String> s = Arrays.stream(str).filter(a->{
//			return a.toLowerCase().contentEquals(new StringBuilder(a.toLowerCase()).reverse());
//		}).toList();
//		System.out.println(s);
		//============================================================================
		
//		String[] arr = {"apple", "banana", "orange",
//				"pineapple", "blueberry"};
//		int maxlength = Arrays.stream(arr).max((a,b)->a.length()-b.length()).get().length();
//		
//		List<String> list = Arrays.stream(arr).filter(i->i.length()==maxlength).toList();
//		System.out.println(list);
		
		
		
//		int[] arr= {11, 11, 1, 3, 5, 6, 5}	;	
//		
//		List<Integer> l = Arrays.stream(arr).boxed().sorted(Comparator.naturalOrder()).toList();
//		
	//====================================================
//		int[] arr= {7, 2, 10, 4};
//		
//		int max = Arrays.stream(arr).reduce(0, (a,b)->a>b?a:b); //10
//		==============================================================
		
//			String input = "aabbcdeffg";
//      
//	
//	List<String> li = Arrays.stream(input.split("")).collect( Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).
//			                 entrySet()
//			                 .stream()
//			                 .filter(x->x.getValue()>1)
//			                 .map(Map.Entry::getKey)
//			                 .toList();
//		System.out.println(li);
		//	========================================================================
		
//		List<Integer> list = Arrays.asList(4,8,15,16,23,42);
//		int k =3;
		
//		   List<Double> sw   = IntStream.range(0, list.size()-2)
//		    		     .mapToObj(i->(list.get(i)+list.get(i+1)+list.get(i+2))/3.0).toList();//one way sliding window max value [9.0, 13.0, 18.0, 27.0]
		 
//		List<List<Integer>> sw = IntStream.range(0, (list.size()-(k-1))).mapToObj(w->list.subList(w, w+k)).toList();
//		
//		op : [[4, 8, 15], [8, 15, 16], [15, 16, 23], [16, 23, 42]]
		
//		List<Double> sw= IntStream.range(0, (list.size()-(k-1))).mapToObj(w->list.subList(w, w+k))
//				           .map(i->i.stream().mapToInt(Integer::intValue).average().orElse(0))
//				           .toList();
		//op:[9.0, 13.0, 18.0, 27.0]
		
		//System.out.println(sw);
		//===============================================================================
//		String sr = "The Quick, brown fox jumped over the lazy day!";
//		String sw = Arrays.stream(sr.toLowerCase().replaceAll("[^a-z\\s]", "").split(" ")).max(Comparator.comparingInt(String::length)).orElse("");
//		System.out.println(sw);
		//===========================================================
//		String s="java is great and java is fun. java is poweful!";
//		
//		List<String> sw = Arrays.stream(s.toLowerCase().replaceAll("[^a-z\\s]", "").split(" ")).toList();
//		
//		List<String> se = IntStream.range(0, sw.size()-1).mapToObj(i->sw.get(i)+" "+sw.get(i+1)).toList();
//		
//		op: [java is, is great, great and, and java, java is, is fun, fun java, java is, is poweful]
//===================================================================================================================================
		//System.out.println(se);
		
//		
//		String s1 ="abcd";
//		String s2 = "cdab";
//		String s3 = s1+s1;
//		System.out.println(s3.contains(s2));
		
//		int[] arr= {1,3,2,1,9,5,9};
//		
//		double avg = Arrays.stream(arr).average().getAsDouble();
//		
//		System.out.println(avg);
//		
//		int sum = Arrays.stream(arr).sum();
//		int su = Arrays.stream(arr).reduce(0,(a,b)->a+b);
//		int max = Arrays.stream(arr).max().getAsInt();
//		System.out.println(max);
		//====================================================
//		int[] arr= {11,1, 3, 6, 5};
//		int thirdHig = Arrays.stream(arr).boxed().sorted((a,b)->b-a).skip(2).findFirst().get();
//		System.out.println(thirdHig);
		/*
		 * String input = "Saiteja Banking Application"; String in =
		 * input.toLowerCase().replaceAll("[^a-z]", " "); Map<String,Long> map =
		 * in.chars().mapToObj(c->(char) c)
		 * .collect(Collectors.groupingBy(ch->"aeiou".indexOf(ch)!=-1?"vowels":
		 * "consonents",Collectors.counting())); System.out.println(map);
		 */
		
}
//
//	private static boolean  isPowerOf2(int n) {
//		// TODO Auto-generated method stub
//		return IntStream.iterate(1, x->x*2).anyMatch(x->x==n);
//	}
	
}
