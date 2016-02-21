
public class fibbonaci 
{
	public static void main(String[] args) 
	{
		for ( int i = 1; i < 10; i++ ) {
            System.out.print ( fibs(i) + ", " );
        }
	}
	
	public static int fibs(int n)
	{
		if(n == 1 || n==2)
		{  
			return 1;
		}
		return fibs(n-1) + fibs(n-2);
	}

}
