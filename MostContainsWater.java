
package practiceJava;

public class MostContainsWater {

	public static void main(String[] args) {
		int[] a= {2,1,4,3,4,5};
		
		int l=0;
		int r = a.length-1;
		int res =0;
		while(l<r) {
		int water = Math.min(a[l],a[r])*(r-l);
		 res = Math.max(res, water);
		 
			 if(a[l]<a[r]){
				 l+=1;
			 } else {
				 r-=1;
			 }
			 }
		System.out.println(res);
		 }
	
}
