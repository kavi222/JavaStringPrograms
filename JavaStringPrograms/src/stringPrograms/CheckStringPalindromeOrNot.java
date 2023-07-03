package stringPrograms;

public class CheckStringPalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "KaviArasu";
		str=str.toLowerCase().trim();
		String reverseString="";
		for(int i=str.length()-1;i>=0;i--) {
			reverseString = reverseString+str.charAt(i);
		}
		if(reverseString.equals(str)) {
			System.out.println("Given string is palindrome");
		}else {
			System.out.println("Not a palindrome");
		}

	}

}
