package practiceJava;

public class BuySellStock {

	public static void main(String[] args) {
		int a[] = {10,12,11,2,1,1,4,7,9,3};
		//intialize max profit and best and best sell 
		int maxp=0;
		int bestbuy =-1;
		int bestsell =-1;
		
		for(int i=0; i<a.length-1;i++) {
			for (int j=i+1;j<a.length-1;j++) {
				//calculate profit comparing with i and j 
				int profit = a[j]-a[i];
				if(profit>maxp) {
					maxp = profit;
					bestbuy =i;
					bestsell =j;
				}
			}
		}
		System.out.println("Best Buy on this"+bestbuy);
		System.out.println("Best sell on this"+bestsell);
		System.out.println(maxp);

	}

}
