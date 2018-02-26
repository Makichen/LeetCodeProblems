package main;

/*
 *  设i,j,求得[i,j]的长度
 */
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
	public static void main(String[] args) {
		String s = "dvdf";
		LongestSubstringNum(s);
	}
	public static int LongestSubstringNum(String s) {
		Set<Character> set =new HashSet<>();
		int max = 0;
        int i = 0;
        int j = 0;
        int n = s.length();
		
        while(i<n && j<n) {
        		if(!set.contains(s.charAt(j))) {
        			set.add(s.charAt(j));
                    j++;
                    max = Math.max(max, j-i);
        		}
        		else {
                    set.remove(s.charAt(i));
                    i++;
        		}
        }
        
        return max;
    }
}
