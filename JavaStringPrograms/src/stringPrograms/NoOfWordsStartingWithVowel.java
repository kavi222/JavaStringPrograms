package stringPrograms;

public class NoOfWordsStartingWithVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "An apple a day keeps the doctor away";
		String[] words = input.split("\\s+");
		int count = 0;
		for (String word : words) {
			String lowerCaseWord = word.toLowerCase();
			if (lowerCaseWord.matches("^[aeiou].*")) {
				count++;
			}
		}
		System.out.print(count);
	}

}
