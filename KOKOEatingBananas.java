package practiceJava;

public class KOKOEatingBananas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] piles = {3,6,7,11};
      int h=8;
      System.out.println(mineatinghours(piles,h));
	}

	private static int mineatinghours(int[] piles, int h) {
		int l=1;
		int r =0;
		
		for(int pile:piles) {
			r = Math.max(pile, r);
		}
		while(l<r) {
			int hours =0;
			int mid = (l+r)/2;
			for(int pile:piles) {
				hours+= (pile+mid-1)/mid;
			}
			if(hours<=h) {
				r= mid;//fast lookup
			}else {
				l= mid+1;//slower look up 
			}
		}
		return l;
		
	}

}
