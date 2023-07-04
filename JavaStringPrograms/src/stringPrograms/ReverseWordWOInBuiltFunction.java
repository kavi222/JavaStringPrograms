package stringPrograms;

public class ReverseWordWOInBuiltFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given = "Hello world !";
		String reversed="";
		String[] words=given.split("\\s+");
		for(int i=words.length-1;i>=0;i--) {
			reversed=reversed+words[i]+" ";
		}
		System.out.print(reversed);

	}

}
