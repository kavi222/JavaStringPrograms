package stringPrograms;

public class RemoveWhiteSpacesWOReplaceAllMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " I am working   from my   home town   ";
		char[] ch=str.toCharArray();
		int length=ch.length;
		int count=0;
		for(int i=0;i<length;i++) {
			if(!Character.isWhitespace(ch[i])) {
				ch[count++]=ch[i];
			}
		}

		String output = new String(ch,0,count);
		System.out.println(output);
	}

}
