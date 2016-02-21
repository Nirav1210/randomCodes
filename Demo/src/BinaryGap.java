import java.util.Scanner;

public class BinaryGap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		
		int number = s.nextInt();
		System.out.println(findGap(number));
	}
	
	public static int findGap(int n)
	{	
		String s = Integer.toBinaryString(n);
		System.out.println(s);
		char[] c = s.toCharArray();
		int maxGap=0;
		int gap=0;
		for(int i=0;i<c.length;i++)
		{	
			String remaining = s.substring(i);
			if(c[i]=='0' && i<c.length-1 && remaining.indexOf('1')>0)
			{
				gap = gap+1;
				if(gap>maxGap)
				{
					maxGap=gap;
				}
			}
			else
			{
				gap=0;
			}
		}
		return maxGap;
		
	}

}
