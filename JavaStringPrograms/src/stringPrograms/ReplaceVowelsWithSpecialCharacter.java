package stringPrograms;

public class ReplaceVowelsWithSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello, World!";
		//System.out.println(str.length());
		str = str.toLowerCase();
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				ch[i]='*';
			}
		}
		System.out.println(ch);

	}

}
