package stringPrograms;

public class RemoveAllNonAlphabeticCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello, World!";
		String result="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(Character.isLetter(c)) {
				result=result+c;
			}
		}
		System.out.println(result);

	}

}
