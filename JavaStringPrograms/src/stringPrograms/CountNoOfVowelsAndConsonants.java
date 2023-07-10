package stringPrograms;

public class CountNoOfVowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello, World!";
		System.out.println(str.length());
		str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		int length = str.length();
		int vowelCount = 0;
		int consonants = 0;
		for (int i = 0; i < length; i++) {
			char c = str.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowelCount++;
			} else {
				consonants++;
			}
		}
		System.out.println(vowelCount);
		System.out.println(consonants);
	}

}
