package practiceJava;

public class ismorphicStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String S = "egg";
       String T = "add";
       System.out.println(isIsomprphic(S,T));
	}

	private static boolean isIsomprphic(String S, String T) {
		if(S.length()!=T.length())return false;
		// TODO Auto-generated method stub
		int[] mapS = new int[256];
		int[] mapT = new int[256];
		for(int i=0;i<S.length();i++) {
			char charS = S.charAt(i);
	        char charT = T.charAt(i);
			if(mapS[charS]!=mapT[charT])return false;
			 mapS[charS] = i + 1;
		        mapT[charT] = i + 1;
		}
		return true;
		
	}

}
