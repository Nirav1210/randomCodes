
public class Solution {
	public static void main(String[] args){
		String s = "555372654";
		String str = solution(s);
		System.out.println(str);
		String.format("(%s) %s-%s", str.substring(0, 3), str.substring(3, 6), 
		          str.substring(6, 10));
	}
	    public static String solution(String S) 
	    {
	    	//remove all the "dashes('-')" from given string
	        S = S.replace("-", "");
	        
	        //remove all white spaces from string
	        String str = S.replaceAll("\\s+","");
	        
	        //output string
	        String result="";
	        
	        //convert string to character array
	        char[] c = str.toCharArray();
	        
	        //loop through all the elements of the string
	        for(int i=1;i<=c.length;i++)
	        {
	        	result = result+c[i-1];
	        	//put a dash if counter is multiple of 3
	        	

		        	if(i % 3 == 0 && i<c.length)
		        	{
		        		result = result+"-";
		        	}
	        	
	        	System.out.println(" i :"+ i + " result :" + result);
	        }
	        String[] re = result.split("-");
	       
	        String s = re[re.length-1];
	        System.out.println(s);
	        char[] res = result.toCharArray();
	        
	        if(s.length()<=1)
	        {
	        	char temp = res[res.length-2];
	        	res[res.length-2] = res[res.length-3];
	        	res[res.length-3]= temp;
	        }
	        String b = new String(res);
	        return b;
	    }
}
