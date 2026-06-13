package practiceJava;

import java.util.HashMap;

public class LongestSubSTringWithKMostReplacemnts {

	public static void main(String[] args) {
	
	  String s = "ABAABBB";
	  int k =1;
	  System.out.println(maxKrepalcements(s,k));	
	  }

	private static int maxKrepalcements(String s, int k) {
		  HashMap<Character,Integer> map = new HashMap<>();
	
//		int l=0;
//		int maxLen =0;
//		int maxfreq =0;
//		for (int r = 0; r < s.length(); r++) {
//		char ch = s.charAt(r);
//		map.put(ch,map.getOrDefault(ch,0)+1);
//		maxfreq =Math.max(maxfreq, map.get(ch));
//		while((r-l+1)-maxfreq>k) {
//		char leftchar =s.charAt(l);
//		map.put(leftchar, map.get(leftchar)-1);
//		l++;
//		}
//		maxLen = Math.max(maxLen, r-l+1);
		  int l=0;
		    int maxfrq=0;
		    int maxlen =0;
		    for (int r = 0; r < s.length(); r++) {
				char ch = s.charAt(r);
				map.put(ch, map.getOrDefault(ch, 0)+1);
				maxfrq = Math.max(maxfrq,map.get(ch));
				while((r-l+1)-maxfrq>k) {
					char Lchar = s.charAt(l);
					map.put(ch, map.get(ch)-1);
					l++;
				}
				maxlen = Math.max( maxlen,r-l+1);
			}
		    
			
		return maxlen;
	}

}
