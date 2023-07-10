package stringPrograms;

public class RemoveAllOccurencesOfSpecificCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello, World!";
		char target='o';
		String result="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c!=target) {
				result=result+c;
			}
		}
      System.out.println(result);
	}

}
