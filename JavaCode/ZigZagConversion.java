package main;

public class ZigZagConversion {
	public String convert(String s, int numRows) {
		String result="";
		if(numRows==1){
	      return s;
	    }
		int lag=numRows*2-2;
		for(int j=0;j<numRows;j++) {
	        for(int i=j;i<s.length();i=i+lag){
	        		result+=s.charAt(i);
	    			if(j!=0 &&j!=numRows-1) {
	    				int t = i+lag-2*j;
	    				if(t<s.length()) {
	    	        			result+=s.charAt(t);
	    				}
	    			}
	        }
		}
        return result;
    }
	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		ZigZagConversion zzc = new ZigZagConversion();
		System.out.println(zzc.convert(s,3));
	}
}
