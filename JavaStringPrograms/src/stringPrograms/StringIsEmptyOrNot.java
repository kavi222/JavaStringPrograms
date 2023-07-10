package stringPrograms;

public class StringIsEmptyOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " ";
		String str1 = "";
		//String str2 = null;
		String str3 = "Hello, World!";
		if (str.isEmpty()) {
			System.out.println("str is empty");
		} else {
			System.out.println("str is not empty");
		}

		if (str1.isEmpty()) {
			System.out.println("str1 is empty");
		} else {
			System.out.println("str1 is not empty");
		}

		if (str3.isEmpty()) {
			System.out.println("str3 is empty");
		} else {
			System.out.println("str3 is not empty");
		}

		/*if (str2.isEmpty()) {
			System.out.println("str2 is empty");
		} else {
			System.out.println("str2 is not empty");
		}
		*/

		if (str.length() == 0) {
			System.out.println("str is empty");
		} else {
			System.out.println("str is not empty");
		}

		if (str1.length() == 0) {
			System.out.println("str1 is empty");
		} else {
			System.out.println("str1 is not empty");
		}

		
		if (str3.length() == 0) {
			System.out.println("str3 is empty");
		} else {
			System.out.println("str3 is not empty");
		}
		
		/*if (str2.length() == 0) {
			System.out.println("str2 is empty");
		} else {
			System.out.println("str2 is not empty");
		}
		*/

	}

}
