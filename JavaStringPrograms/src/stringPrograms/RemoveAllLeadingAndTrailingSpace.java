package stringPrograms;

public class RemoveAllLeadingAndTrailingSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "   This is is a test test string string.     ";
		System.out.println("Before removing trailing and leading space : " + str);
		str = str.trim();
		System.out.println("After removing trailing and leading space : " + str);

	}

}
