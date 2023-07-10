package stringPrograms;

public class CountOccurrencesOfSpecificCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello World!";
		str=str.toLowerCase().trim();
		char target ='l';
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == target) {
				count++;
			}
		}
		System.out.println(count);
		

	}

}
