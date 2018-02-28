//package main;
//
///*
// * 求一个数字是否是回文数字
// */
//public class PalindromeNumber {
//	public boolean isPalindrome(int x) {
//		if(x<0||(x%10==0 && x!=0)) {
//			return false;
//		}
//		int converseNumber=0;
//		int oriNumber = x;
//		while(0<x) {
//			converseNumber = converseNumber*10+x%10;
//			x=x/10;
//		}
//		if(oriNumber==converseNumber) {
//			return true;
//		}
//		return false;        
//    }
//	public static void main(String[] args) {
//		PalindromeNumber pn = new PalindromeNumber();
//		System.out.println(pn.isPalindrome(10002));
//		
//	}
//}
