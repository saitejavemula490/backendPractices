package practiceJava;

import java.util.Stack;

public class StringDecode {

	public static void main(String[] args) {
		String s = "13[a]";
		
		System.out.println(isDecoded(s));

	}

	private static String isDecoded(String s) {
		Stack DigitStack = new Stack<>();
		Stack StringStack = new Stack<>();
		int k=0;
		String curr ="";
		for(char ch: s.toCharArray()) {
			if(Character.isDigit(ch)) {
				k=k*10+(ch-'0');
			}
			else if(ch=='[') {
				DigitStack.push(k);
				StringStack.push(curr);
				k=0;
				curr ="";
			}else if(ch==']') {
				int count = (int) DigitStack.pop();
				String prev = (String) StringStack.pop();
				curr = prev+curr.repeat(count);
			}else {
				curr+=ch;
			}
		}
		return curr;
	}

}
