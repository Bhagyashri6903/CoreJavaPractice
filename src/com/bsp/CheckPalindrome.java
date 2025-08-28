package com.bsp;

public class CheckPalindrome {
	
	public static void main(String[] args) {
		
		String st = "madam";
		System.out.println(st + " " + (isPalindrome(st) ? " : is Palindrome String" : ": is not Palindrome"));
		
	}
	public static boolean isPalindrome(String st) {
		int left = 0;
		int right = st.length()-1;
		while(left < right) {
			if(st.charAt(left) != st.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
