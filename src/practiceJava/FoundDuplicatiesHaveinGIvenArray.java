package practiceJava;

import java.util.HashSet;

public class FoundDuplicatiesHaveinGIvenArray {

	public static boolean main(String[] args) {
		int a[]= {1,2,3,1};
		int k=2;
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			if(set.contains(a[i])) {
				return true;
			}
			set.add(a[i]);
		 if (set.size() > k) {
                set.remove(a[i - k]);
            }
		}
		return false;
		

	}

}
