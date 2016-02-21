

import java.util.ArrayList;

public class ReverseString {

	public static void main(String[] args) {
		String str = new String();
		str = "I am a Software developer";
		
		System.out.println(reverseStr(str));
		System.out.println("Better solution : "+ reverseString("abcde"));
	}

	private static String reverseStr(String str) {
		if(str.length()<1){
			return str;
		}
		return reverseStr(str.substring(1))+str.charAt(0);
		
	}
	
	private static String reverseString(String str){
		int len = str.length();
		int last = len-1;
		char[] chars = str.toCharArray();
		for(int i=0;i<len/2;i++)
		{
			char c = chars[i];
			chars[i] = chars[last-i];
			chars[last-i] = c;
			
		}
		return new String(chars);
	}
	

}
