package practiceJava;

public class peakelement {

	public static void main(String[] args) {
		int[] a= {1,2,3,1};
		
		System.out.println(peak(a));
		
		}

	private static int peak(int[] a) {
		int l=0;
		int r = a.length;
		while(l<r) {
			int mid = (l+r)/2;
			if(a[mid]>a[mid+1]) {
				r=mid;
				
			}else {
				l = mid+1;
			}
			}
		
	return l;
	}
	

}
