package stringPrograms;

public class SwapTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Hello";
		String str2="World";
		String temp="";
		System.out.println("Before swapping:");
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		temp=str1;
		str1=str2;
		str2=temp;
		System.out.println("After swapping:");
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);

	}

}
