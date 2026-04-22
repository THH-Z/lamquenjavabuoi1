package chuoipanlyndrome;
import java.util.*;

public class chuoipanlyndrome {

	public static void main(String[] args) {
		String s="yes";
		boolean panlyndrome=true;
		
		try
		{
			for(int i=0;i<s.length()/2;i++)
			{
				if(s.charAt(i)!=s.charAt(s.length()-1-i))
				{
					panlyndrome=false;
					break;
				}
									
			}
			if(panlyndrome==true)
			{
					System.out.println("TRUE");
			}
			else
			{
				    System.out.println("FALSE");
			}

		}
		catch(InputMismatchException e)
		{
			System.out.println("nhap chuoi");
		}
		finally
		{
			for(int i=0;i<s.length();i++)
			{
				System.out.println(s.charAt(i));
			}
		}
		

	}

}
