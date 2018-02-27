package main;

/*
 * 求一个字符串里的最大回文子字符串
 * 因为时间上有要求，无法使用递归判断回文字符串，改用了循环方法
 * 具体算法思想为从头循环一遍字符串，找出以第i个字符开头的最大回文字符串与之前的最大字符串对比，不断更新最大回文字符串，最后返回结果
 * 为节省算法时间，设定为从后查找，找到后立即退出当前循环（此时必定为以该字符开头的最大回文字符串）
 */
public class LongestPalindromicSubstring {
	public String longestPalindrome(String s) {
		int num = s.length();
		int max = 0;
		int i=0;
		int j=num;
		String result = s.substring(0, 1);

		for (i = 0; i < num; i++) {
			for (j = num - 1; j > i; j--) {
				if (s.charAt(j) == s.charAt(i)) {
					if (isPalindromic(s.substring(i, j + 1))) {
						if (j + 1 - i > max) {
							result = s.substring(i, j + 1);
							max = j + 1 - i;
							if (max == num) {
								return result;
							}
							break;
						}
					}
				} else {
					continue;
				}
			}
		}

		return result;

	}

	public boolean isPalindromic(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (s.charAt(i) == s.charAt(j) && i <= j) {
			i++;
			j--;
		}
		if (j <= i) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		String s = "ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff";
		LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
		System.out.println(lps.longestPalindrome(s));
	}
}
