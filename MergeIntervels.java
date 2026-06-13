package practiceJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervels {

	public static void main(String[] args) {
		int[][] a= {{1,5},{2,4},{4,6},{7,8}};
		int[][] res = merge(a);
		for(int[] inter:res) {
			System.out.print(Arrays.toString(inter));
		}
		//System.out.print(Arrays.deepToString(res));

	}

	private static int[][] merge(int[][] a) {
		Arrays.sort(a,(b,c)->b[0]-c[0]);
		List<int[]> merged = new ArrayList<>();
		int s = a[0][0];
		int e = a[0][1];
		for(int i=0;i<a.length;i++) {
			if(e>a[i][0]) {
				e= Math.max(e, a[i][1]);
			} else {
				merged.add(new int[] {s,e});
				s= a[i][0];
				e= a[i][1];
			}
		}
		merged.add(new int[] {s,e});
		return merged.toArray(new int[merged.size()][]);
	}

	
	

}
