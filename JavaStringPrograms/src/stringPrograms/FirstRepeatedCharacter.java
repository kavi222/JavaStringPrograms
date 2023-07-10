package stringPrograms;
import java.util.*;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is is a test test string string.";
		char[] ch=str.toLowerCase().replaceAll("\\s+", "").toCharArray();
		int size=ch.length;
		int i=0;
		Map<Character,Integer> lmap = new LinkedHashMap<>();
		while(i!=size) {
			if(lmap.containsKey(ch[i])==false) {
				lmap.put(ch[i], 1);
			}else {
				int oldMap=lmap.get(ch[i]);
				int newVal=oldMap+1;
				lmap.put(ch[i], newVal);
			}
			i++;
		}
		Set<Map.Entry<Character, Integer>> llmap=lmap.entrySet();
		for(Map.Entry<Character, Integer> data: llmap) {
			if(data.getValue()>1) {
				System.out.println(data.getKey());
				System.exit(0);
			}
		}
	}

}
