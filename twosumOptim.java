package practiceJava;

import java.util.Arrays;
import java.util.HashMap;

public class twosumOptim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] a= {1,4,5,7,8};
       int target = 12;
       int[] result = function(a, target);

       if (result != null) {
           System.out.println("Indices: " + Arrays.toString(result));
           System.out.println("Values: " + a[result[0]] + " + " + a[result[1]] + " = " + target);
       } else {
           System.out.println("No pair found!");
       }
	}

	private static int[] function(int[] a, int target) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for (int i = 0; i < a.length; i++) {
			int com = target-a[i];
			if(map.containsKey(com)) {
				return new int[] {map.get(com),i};
			}
			map.put(a[i], i);
		}
		return null;
	}

}
