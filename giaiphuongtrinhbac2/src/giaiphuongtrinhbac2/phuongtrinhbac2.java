package giaiphuongtrinhbac2;

import java.util.*;

public class phuongtrinhbac2 {

	public static void main(String[] args) {
		
		System.out.println("Nhập a:");
		int a=new Scanner(System.in).nextInt();
		
		System.out.println("Nhập b:");
		int b=new Scanner(System.in).nextInt();
		
		System.out.println("Nhập c:");
		int c=new Scanner(System.in).nextInt();
	
	
		if(a==0)
		{
			if(b==0)
			{
				if(c==0)
				{
					System.out.println("phương trình vô số nghiệm");
				}
			}
			else
			{
				int x=-c/b;
				System.out.println("gia tri ="+c);
			}

		}
		else 
		{	
			int delta=(b*b-4*a*c);
			System.out.println("delta ="+delta);
			
				
				if(delta<0)
				{
					System.out.println("phương trình vô nghiệm");
				}
				else
				{
					if(delta>0)
					{
						System.out.println("phương trình có 2 nghiệm");
						System.out.println("x1="+(-b+Math.sqrt(delta))/2*a);
						System.out.println("x1="+(-b-Math.sqrt(delta))/2*a);
						
						
					}
					else
					{
						if(delta==0)
						{
							System.out.println("x="+(-b/2*a));
							
						}
					}
				}
			
		}

	}

}
