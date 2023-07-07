package stringPrograms;
import java.util.*;

public class OccurenceOfCharShouldbeRandomOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is is a test test string string.";
		str=str.replaceAll("\\s+", "").toLowerCase();
		System.out.println(str);
		char[] eachCharacter = str.toCharArray();
		int size = eachCharacter.length;
		int i=0;
		Map<Character,Integer> hmap = new HashMap<>();
		while(i!=size) {
			if(hmap.containsKey(eachCharacter[i])==false) {
			hmap.put(eachCharacter[i], 1);
			}else {
				int oldVal=hmap.get(eachCharacter[i]);
				int newVal=oldVal+1;
				hmap.put(eachCharacter[i], newVal);
			}
			i++;
		}
		
		Set<Map.Entry<Character, Integer>> hhmap = hmap.entrySet();
		for(Map.Entry<Character, Integer> data : hhmap){
			System.out.println(data.getKey()+" : "+data.getValue());
		}
		
		

	}

}
