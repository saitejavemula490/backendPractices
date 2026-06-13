package practiceJava;

import java.util.HashMap;

public class minimumwindowsubstringWhichIncludeOtherString {

	public static void main(String[] args) {
		String s="ADOBECODEBANC";
		String t = "ABC";
		System.out.println(minWinSubString(s,t));
	}

	private static String minWinSubString(String s, String t) {
		HashMap<Character,Integer> need =new HashMap<>();
		for(char ch : t.toCharArray()) {
			need.put(ch, need.getOrDefault(need, 0)+1);
		}
		int formed =0;
		int start =0;
		int l=0;
		int r=0;
		int minfreq = Integer.MAX_VALUE;
		HashMap<Character,Integer> req =new HashMap<>();
		//adding to window 
		while(r<s.length()) {
			char ch = s.charAt(r);
			req.put(ch, req.getOrDefault(req, 0)+1);
			if(need.containsKey(ch)&&req.get(ch).intValue() == need.get(ch).intValue()) {
				formed++;
			}
			//shrinking window upto in 
			while(l<r && formed == need.size()) {
				if(r-l+1<minfreq) {
					minfreq =r-l+1;
					start =l;
				}
				char leftch = s.charAt(l);
				req.put(leftch,req.get(ch)-1);
				if(need.containsKey(leftch) && req.get(leftch) < need.get(leftch)) {
					formed--;
				}
				l++;
			}
			r++;
		}
		return minfreq == Integer.MAX_VALUE?"":s.substring(start,start+minfreq);
	}

}
