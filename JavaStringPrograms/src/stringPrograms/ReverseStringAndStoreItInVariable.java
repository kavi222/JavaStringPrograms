package stringPrograms;

public class ReverseStringAndStoreItInVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "kaviarasu";
		String reverseString ="";
		for(int i=str.length()-1;i>=0;i--) {
			reverseString=reverseString+str.charAt(i);
		}
		System.out.print(reverseString);

	}

}
