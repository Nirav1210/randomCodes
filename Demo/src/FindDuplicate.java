import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		String str = "Programming";
		findDuplicates(str);
	}

	private static void findDuplicates(String str) {
		char[] StrtoChar = str.toCharArray();
		
		HashMap<Character,Integer> mapData = new HashMap<Character,Integer>();
		
		for(Character ch: StrtoChar){
			if(mapData.containsKey(ch)){
				mapData.put(ch, mapData.get(ch)+1);
			}else{
				mapData.put(ch,1);
			}
		}
		
		//Iterate through Hashmap
		Set<Map.Entry<Character, Integer>> entryset = mapData.entrySet();
		for(Map.Entry<Character,Integer> set: entryset){
			if(set.getValue()>1){
				System.out.printf("%s - %d %n", set.getKey(), set.getValue());
			}
		}
	}

}
