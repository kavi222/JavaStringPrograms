package stringPrograms;

public class SwapTwoStringsWOThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Hello";
		String str2="World";
		//str1 = str1 ^ str2;
		System.out.println("Before swapping:");
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		str1=str1 + str2;
		System.out.println("concat:"+str1);
		str2=str1.substring(0, str1.length()-str2.length());
		System.out.println("substring str2:"+str2);
		str1=str1.substring(str2.length());
		System.out.println("After swapping:");
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);

	}

}
