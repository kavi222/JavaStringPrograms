package stringPrograms;
import java.util.*;

public class InputStringHasAllUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is is a test test string string.";
		char[] ch=str.replaceAll("\\s+", "").toCharArray();
		int size=ch.length;
		int i=0;
		Map<Character,Integer> hmap=new HashMap<>();
		while(i!=size) {
			if(hmap.containsKey(ch[i])==false) {
				hmap.put(ch[i], 1);
			}else {
				int oldVal=hmap.get(ch[i]);
				int newVal=oldVal+1;
				hmap.put(ch[i], newVal);
			}
			i++;
		}
		Set<Map.Entry<Character, Integer>> hhmap=hmap.entrySet();
		for(Map.Entry<Character, Integer> data:hhmap) {
			if(data.getValue()>1) {
				System.out.println("String does not have all unique character");
				System.exit(0);
			}
		}
			System.out.println("String have all unique character");

	}

}
