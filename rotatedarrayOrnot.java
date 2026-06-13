package practiceJava;

import java.util.Arrays;
import java.util.Comparator;

public class rotatedarrayOrnot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] nums = {4,5,6,7,1,2,3};
	        System.out.println(search(nums, 0));

	}

	private static int search(int[] nums, int i) {
		int max = Arrays.stream(nums).max().getAsInt();
		//int min= Arrays.stream(nums).min().getAsInt();
		System.out.println(max);
		//System.out.println(min);
		
		//if(min==0) {
			int min = Arrays.stream(nums).sorted().skip(1).findFirst().getAsInt();
			//System.out.println(min);
		//}
		for (int j = 1; j < nums.length; j++) {
			if(nums[j-1]==max && nums[j+1]==min) {
				return j;
			}
		}
		return -1;
	}

}
