/* Program to write all the prime 
numbers between a given range*/
import java.io.*;
class Prime1
{
	public static void main(String[] args) throws IOException
	{
		int start,end;
	start=Integer.parseInt("1");
	end=Integer.parseInt("10");
		for(int i=start;i<=end;i++)
		{
			int k=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					k=k+1;
			}
			if(k==2)
				System.out.println(i);
		}
		
	}
}