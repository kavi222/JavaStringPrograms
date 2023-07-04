package stringPrograms;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello every one , how are you !";
		// split the given string into words so we are splitting it by space
		String[] words = str.split("\\s+");
		// for storing the reversed string we taking the variable and set it as null
		String reverseString = "";
		// looping the splited word and store it in word variable and set variable
				// reverseWord which should be null initially
		for (int i = 0; i <= words.length - 1; i++) {
			String word = words[i];
			String reverseWord = "";
			// looping each character and storing it reverseWord
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			// System.out.print(reverseWord);
			reverseString = reverseString + reverseWord + " ";

		}
		System.out.print(reverseString);

	}

}
