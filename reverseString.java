package practiceJava;

import java.util.Arrays;
import java.util.stream.Collectors;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "SAITEJA";
		
		
		String rev = str.chars().mapToObj(w->String.valueOf((char) w)).reduce("", (a,b)->b+a);
		
		
		
		String r = str.chars()
				       .mapToObj(w->String.valueOf((char) w)) 
				       .distinct()
				       .collect(Collectors.joining());
		
//		StringBuilder sb = new StringBuilder(Str);
//		Str = sb.reverse().toString();
//		System.out.println(Str); //Gives AJETIAS
		//=====================================
//		String res = "";
//		for(int i=str.length()-1;i>=0;i--) {
//			res+=str.charAt(i);
//		}
//		
//		System.out.println(res.toString());
		//======================================
		
//		char[] arr = str.toCharArray();
//		for(int i=0,j=arr.length-1;i<j;i++,j--) {
//			char temp= arr[i];
//			arr[i]=arr[j];
//			arr[j]=temp;
//		}
////			Str1[i]=
////		}
		System.out.println(rev);
		System.out.println(r);
	}

}
