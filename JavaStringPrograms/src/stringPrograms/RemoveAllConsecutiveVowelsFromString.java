package stringPrograms;

public class RemoveAllConsecutiveVowelsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello, World!";
		String result = removeConsecutiveVowels(input);
		System.out.println("Original string: " + input);
		System.out.println("String with consecutive vowels removed: " + result);

	}

	private static boolean isVowel(char c) {
		c=Character.toLowerCase(c);
		return c=='a'||c=='e'||c=='i'||c=='o'||c=='i';
	}
	public static String removeConsecutiveVowels(String str) {
		String result = "";
		int length=str.length();
		boolean prevIsVowel=false;
		for(int i=0;i<length;i++) {
			char currentChar=str.charAt(i);
			if(isVowel(currentChar)) {
				if(!prevIsVowel) {
					result=result+currentChar;
					prevIsVowel=true;
				}
			}else {
				result=result+currentChar;
				prevIsVowel=false;
			}
		}
		return result;
	}

}
