package stringPrograms;

public class RemoveAllSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello, @World!";
		String str1=str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str1);
        String result="";
        for(int i=0;i<str.length();i++ ) {
        	char c=str.charAt(i);
        	if(Character.isLetterOrDigit(c)) {
        		result=result+c;
        	}
        }
        System.out.println(result);
       
	}

}
