package main;
/*
 *  求给定规则的两个字符串是否匹配
 *  没做出来，抄的solution里大神思路，使用递归做法
 */
public class RegularExpressionMatching {
    public boolean isMatch(String text, String pattern) {
        if (pattern.isEmpty()) {
        		return text.isEmpty();
        }
        boolean first_match = (!text.isEmpty() && (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));
        
        if (pattern.length() >= 2 && pattern.charAt(1) == '*'){
            return (isMatch(text, pattern.substring(2)) || (first_match && isMatch(text.substring(1), pattern)));
        } else {
            return first_match && isMatch(text.substring(1), pattern.substring(1));
        }
    }
    public static void main(String[] args) {
    		RegularExpressionMatching rem = new RegularExpressionMatching();
    		System.out.println(rem.isMatch("aaa", "ab*a*c*a"));;
    }
}
