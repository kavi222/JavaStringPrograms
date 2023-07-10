package stringPrograms;

public class CountNoOfUppercaseLettersInGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello World!";
		// int upperCaseCount = isUpperCase(input);
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isUpperCase(c)) {
				count++;
			}
		}
		System.out.print(count);

	}

}
