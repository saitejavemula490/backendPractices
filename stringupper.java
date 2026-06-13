package practiceJava;

import java.util.Arrays;
import java.util.stream.Collectors;

public class stringupper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "hello java world";
		
		System.out.println(fucn(s));

	}

	private static String fucn(String s) {
		// TODO Auto-generated method stub
		return "#"+Arrays.stream(s.split(" ")).map(word->word.toUpperCase().substring(0,1)+word.substring(1)).collect(Collectors.joining(""));
	}

}
