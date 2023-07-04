package stringPrograms;

public class LengthOfStringWOInBuildMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello, World!";
		str = str.replaceAll("\\s+", "");
		int length = findLength(str);
		System.out.println(length);
	}

	public static int findLength(String str) {
		int length = 0;
		for (char c : str.toCharArray()) {
			length++;
		}
		return length;
	}
}
