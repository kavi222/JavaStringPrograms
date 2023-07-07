package stringPrograms;

public class RemoveAllWhiteSpacesFromAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " I am working   from my   home town   ";
		str=str.replaceAll("\\s+", "");
        System.out.println(str);
	}

}
