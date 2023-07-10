package stringPrograms;

public class CheckStringContainsOnlyDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1 = "12345";
	        String str2 = "1234a56";
	        System.out.println(str1+" contains only digits: "+containsOnlyDigits(str1));
	        System.out.println(str2+" contains only digits: "+containsOnlyDigits(str2));

	}
	public static boolean containsOnlyDigits(String str) {
		if(str==null|| str.isEmpty()) {
			return false;
		}
		
		for(char c:str.toCharArray()) {
			if(!Character.isDigit(c)) {
				return false;
			}
		}
		
		return true;
	}

}
