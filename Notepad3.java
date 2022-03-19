import java.util.*;
import java.io.*;
class Notepad3
	{
	public static void main(String[] args)
		{
		Runtime rs=Runtime.getRuntime();
		Try	
			{
			rs.exec("calc");
			rs.exec("notepad");
			}
		catch(IOException e)
			{
			System.out.println(e);
			}
		}	
	}
