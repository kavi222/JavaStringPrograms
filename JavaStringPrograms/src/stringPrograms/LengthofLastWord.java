package stringPrograms;

public class LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am from dharmapuri";
		String[] words=str.split("\\s+");
		if(words.length>0) {
			String lastWord=words[words.length - 1];
			int lastWordLength=lastWord.length();
			System.out.println("Length of last word : "+lastWordLength);
		}else {
			System.out.println("No words found in string");
		}

	}

}
