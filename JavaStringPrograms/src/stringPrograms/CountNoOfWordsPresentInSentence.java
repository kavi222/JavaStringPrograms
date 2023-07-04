package stringPrograms;

public class CountNoOfWordsPresentInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str =" I  am from   tamil    nadu ";
		int wordCount = countWords(str);
		str=str.toLowerCase().trim();
		//\\s+, which matches one or more whitespace characters
		//(including spaces, tabs, and line breaks). This splits the string into an array of words.
		String[] words = str.split("\\s+");
		//for(int i=0;i<words.length;i++) {
		System.out.println(words.length);
		System.out.println("Number of words : "+wordCount);

	}
	
	public static int countWords(String text) {
		int count=0;
		//If a non-space character is encountered and isWord is false
		boolean isWord = false;
		
		for(char c: text.toCharArray()) {
			if(c !=' ' && !isWord) {
				isWord=true;
				count++;
			}else if(c==' ') {
				isWord=false;
			}
		}
		return count;
	}

}
