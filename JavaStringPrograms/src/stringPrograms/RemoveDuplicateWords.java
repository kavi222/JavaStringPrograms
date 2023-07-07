package stringPrograms;
import java.util.*;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is a test string string with duplicate words test.";
		str=str.toLowerCase();
		String[] ch=str.split(" ");
		LinkedHashSet<String> uniqueWords = new LinkedHashSet<>();
		for(String word : ch) {
			uniqueWords.add(word);
		}
		String[] uniqueArray=uniqueWords.toArray(new String[uniqueWords.size()]);
		String result =String.join(" ", uniqueArray);
        System.out.println(result);
	}

}
