package practiceJava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class mapsExamples {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(10,"asd");
		hm.put(25,"hj");
		hm.put(1,"sjhdkj");
		hm.put(4,"jsdh");
		System.out.println(hm);
		System.out.println("it prints values in randomly order by randomly accesing");
		
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
		lhm.put(10,"asd");
		lhm.put(25,"hj");
		lhm.put(1,"sjhdkj");
		lhm.put(4,"jsdh");
		System.out.println(lhm);
		System.out.println("it prints values in by order of execution only");
		
		TreeMap<Integer,String> tm = new TreeMap<>();
		tm.put(10,"asd");
		tm.put(25,"hj");
	    tm.put(1,"sjhdkj");
		tm.put(4,"jsdh");
		System.out.println(tm);
		System.out.println("it prints values in by order execution and also sorted order");
	}

}
