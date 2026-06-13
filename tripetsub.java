package practiceJava;

public class tripetsub {

	public static void main(String[] args) {
		int[] a = {1,7,3,4,5};
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		for(int i:a) {
			if(i<=first) {
				first = i;
			} else if(i<=second) {
				second=i;
			} else {
				System.out.print(true);
			}
		}
		System.out.print(false);
	}

}
