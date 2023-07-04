package stringPrograms;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Remove whitespace and convert both strings to lowercase
		String str1 = "Listen";
		String str2 = "Silent";
		if (areAnagrams(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are anagrams.");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams.");
		}
	}

	public static boolean areAnagrams(String str1, String str2) {
		str1 = str1.toLowerCase().replaceAll("\\s+", "");
		str2 = str2.toLowerCase().replaceAll("\\s+", "");
		if (str1.length() != str2.length()) {
			// System.out.println("If the lengths are different, they cannot be anagrams");
			return false;
		}

		char[] ca1 = str1.toCharArray();
		char[] ca2 = str2.toCharArray();
		Arrays.sort(ca1);
		Arrays.sort(ca2);
		return Arrays.equals(ca1, ca2);
	}

}
