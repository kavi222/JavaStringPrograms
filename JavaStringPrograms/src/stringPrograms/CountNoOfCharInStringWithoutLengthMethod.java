package stringPrograms;

public class CountNoOfCharInStringWithoutLengthMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello world";
		int count=0;
		for(char c : str.toCharArray()) {
			count++;
		}
		System.out.println(count);

	}

}
