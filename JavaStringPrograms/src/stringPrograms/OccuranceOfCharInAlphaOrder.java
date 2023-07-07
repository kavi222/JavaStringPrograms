package stringPrograms;
import java.util.*;

public class OccuranceOfCharInAlphaOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is is a test test string string.";
		char[] ch=str.replaceAll("\\s+", "").toLowerCase().toCharArray();
		int size=ch.length;
		int i=0;
		Map<Character,Integer> tmap= new TreeMap<>();
		while(i!=size) {
			if(tmap.containsKey(ch[i])==false) {
				tmap.put(ch[i], 1);
			}else {
				int oldVal=tmap.get(ch[i]);
				int newVal=oldVal+1;
				tmap.put(ch[i], newVal);
			}
			i++;
		}
		Set<Map.Entry<Character, Integer>> ttmap = tmap.entrySet();
		for(Map.Entry<Character, Integer> data:ttmap) {
			System.out.println(data.getKey()+" : "+data.getValue());
		}
	}

}
