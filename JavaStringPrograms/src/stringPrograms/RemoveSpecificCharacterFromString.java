package stringPrograms;

public class RemoveSpecificCharacterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence="This is a test sentence to find the first non-repeated word in the sentence";
		sentence=sentence.trim().replaceAll("\\s+", "").toLowerCase();
		String replaceChar="t";
		sentence=sentence.replaceAll(replaceChar, "");
        System.out.println(sentence);
	}

}
