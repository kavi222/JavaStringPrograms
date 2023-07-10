package stringPrograms;
import java.util.*;

public class FirstNonRepeatedWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence="  This is a test sentence to find the first non-repeated word in the sentence ";
		String firstNonRepeatedWord=findFirstNonRepeatedWord(sentence);
		System.out.println("First non-repeated word: " + firstNonRepeatedWord);

	}
	
	public static String findFirstNonRepeatedWord(String sentence) {
		if(sentence==null || sentence.isEmpty()) {
			return null;
		}
		//remove the leading and trailing spaces from the sentence and convert it to lowercase
		sentence=sentence.trim().toLowerCase();
		//split the sentence into words
		String[] words=sentence.split("\\s+");
		
		//create a map to store the word frequency and linkedHashMap to get it in the given sequence
		Map<String,Integer> wordFrequency = new LinkedHashMap<>();
		
		//count the frequency of each word
		for(String word:words) {
			wordFrequency.put(word, wordFrequency.getOrDefault(word, 0)+1);
		}
		
		//find first non repeated word
		for(String word:words) {
			if(wordFrequency.get(word)==1){
				return word;
			}
		}
		
		return null;
	}

}
