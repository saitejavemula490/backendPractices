package practiceJava;

public class kadanesalgo {

	public static void main(String[] args) {
		int[] a= {4,-6,3,2};
		int currsum = a[0];
		int maxsum = a[0];
		for(int i =1;i<a.length;i++) {
			currsum = Math.max(a[i], currsum+a[i]);
			maxsum = Math.max(maxsum, currsum);
		}
        System.out.println(maxsum);
	}

}
