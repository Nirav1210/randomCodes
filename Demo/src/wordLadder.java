import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class wordLadder {

	public static void main(String[] args) {
		String start = "hit";
		String end = "cog";
		HashSet<String> set = new HashSet<String>();
		set.add("hot");
		set.add("dot");
		set.add("dog");
		set.add("lot");
		set.add("log");
		
		System.out.println(getLadder(start, end, set));
		System.out.println(getDistance("hip","hot"));

	}
	
	public static int getLadder(String s, String e, HashSet<String> dict)
	{	
		if(dict.size() ==0){
			return 0;
		}
		dict.add(e);
		
		LinkedList<String> wordQueue = new LinkedList<String>();
		LinkedList<Integer> distanceQueue = new LinkedList<Integer>();
		
		wordQueue.add(s);
		distanceQueue.add(1);
		
		int result = Integer.MAX_VALUE;
		
		while(!wordQueue.isEmpty())
		{
			String curWord = wordQueue.pop();
			Integer currDistance = distanceQueue.pop();
			
			//System.out.println(wordQueue);
			//System.out.println(currDistance);
			
			if(curWord.equals(e)){
				result = Math.min(result, currDistance);
			}
			
			for(int i=0; i<curWord.length(); i++)
			{
				char[] charArray = curWord.toCharArray();
				for(char c='a';c<='z';c++)
				{
					charArray[i]=c;
					
				
					String newWord = new String(charArray);
					//System.out.println(newWord);
					if(dict.contains(newWord))
					{
						wordQueue.add(newWord);
						distanceQueue.add(currDistance+1);
						dict.remove(newWord);
					}
				}
			}
		}
		
		if(result < Integer.MAX_VALUE){
			return result;
		}else{
			return 0;
		}
	}
	
	public static boolean getDistance(String a, String b)
	{
		char[] first = a.toCharArray();
		char[] second = b.toCharArray();
		int index=0;
		for(int i=0;i<first.length;i++){
			int yes = b.indexOf(first[i]);
			if(yes>0){
				index = index +1;
				System.out.println(index);
			}
		}
		if(index == 1){
			return true;
		}
		else{
			return false;
		}
	}

}
