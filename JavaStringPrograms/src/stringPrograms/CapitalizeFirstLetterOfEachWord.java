package stringPrograms;

public class CapitalizeFirstLetterOfEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="this is a sample string";
		String[] words=str.split("\\s+");
		String result="";
		for(String word:words) {
			if(!word.isEmpty()) {
				char firstChar=Character.toUpperCase(word.charAt(0));
				String capitalizedWord=firstChar+word.substring(1);
				result=result+capitalizedWord+" ";
			}
		}
		result=result.trim();
		System.out.println(result);

	}

}
