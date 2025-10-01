package practiceJava;

import java.util.HashSet;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class setsExamples {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(10);
		hs.add(25);
		hs.add(1);
		hs.add(4);
		System.out.println(hs);
		System.out.println("it prints values in randomly order by randomly accesing");
		
		LinkedHashSet<Integer> lh = new LinkedHashSet<>();
		lh.add(10);
		lh.add(25);
		lh.add(1);
		lh.add(4);
		System.out.println(lh);
		System.out.println("it prints values in by order of execution only");
		
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(10);
		ts.add(25);
		ts.add(1);
		ts.add(4);
		System.out.println(ts);
		System.out.println("it prints values in by order execution and also sorted order");

	}

}
