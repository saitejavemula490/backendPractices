package practiceJava;

import java.util.Arrays;

public class happyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n =10;
     System.out.println(IsHappyNum(n));
	}

	private static boolean IsHappyNum(int n) {
		// TODO Auto-generated method stub
		int slow = n;
		int fast = getNext(n);
		while(fast!=1&&slow!=fast) {
			slow = getNext(slow);
			fast= getNext(getNext(fast));
		}
		return fast==1;
	}

	private static int getNext(int n) {
		
		return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).map(d->d*d).sum();
	}

}
