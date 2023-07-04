package stringPrograms;

public class CountOccurencesOfSpecificWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Java is a programming language, and Java is fun to learn.";
		String wordToFind="Java";
		int count =0;
		String[] words=str.split("\\s+");
		for(String word:words) {
			if(word.equals(wordToFind)) {
				count++;
			}
		}
		System.out.println("Occurrences of the word '" + wordToFind +"': "+ count);

	}

}
