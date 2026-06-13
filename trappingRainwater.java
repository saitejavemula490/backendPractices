package practiceJava;

public class trappingRainwater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {2,1,5,3,1,0,4};
        
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int res =0;
        left[0] = arr[0];
        for(int i=1;i<n;i++) {
        	left[i]= Math.max(left[i-1], arr[i]);
        } //2,2,5,5,5,5,5
        
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--) {
        	right[i]= Math.max(right[i+1], arr[i]);
        }
        //5,5,5,4,4,4,4
        
        for(int i=1;i<n;i++) {
        	int minof2 = Math.min(left[i], right[i]);
        	res += minof2-arr[i];
        }
        System.out.println(res); //O(n)O(1)
	}

}
