package practiceJava;

import java.util.Arrays;

public class findFirstLastPositionsOFGivenNum {

	public static void main(String[] args) {
		int[] nums = {5,7,7,8,8,10};
        int[] res = searchRange(nums, 8);
        System.out.println(Arrays.toString(res));

	}

	private static int[] searchRange(int[] nums, int i) {
		int first = -1;
		//int f1=0;
		int last =-1;
		for (int j = 0; j < nums.length; j++) {
			if(nums[j]==i) {
				if(first==-1)first=j;
				last = j;
		}
		
		
	}
		return new int[] {first,last};
	}

}
