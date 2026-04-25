package baithuchanh254;

import java.util.*;

public class bai1menusinhvien {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int n = 0;
		int k=0;
        
        ArrayList<String>ds=new ArrayList<String>();
        
        try
        {
        	System.out.println("Nhap so luong sinh vien");
        
        	Scanner sc = new Scanner(System.in);
			n= sc.nextInt();
			sc.nextLine();
			
			System.out.println("Nhap sinh vien : ");
         	for (int i = 0 ; i < n ; i++)
         		{
         			String s=sc.nextLine();
         			ds.add(s);
         		}	
			
		
		do
		{
				
               
			System.out.println("--------Menu--------");

			System.out.println("\n1.Them sinh vien");

			System.out.println("\n2.Xuat sinh vien");

			System.out.println("\n3.Sua sinh vien");

			System.out.println("\n4.Xoa sinh vien");

			System.out.println("\n5.Tim sinh vien");

			System.out.println("\n6.Sap xep sinh vien");

			System.out.println("\n7.Xuat so luong sinh vien");

			System.out.println("\n8.Thoat");
				
			k= sc.nextInt();
			 sc.nextLine();
			
			switch (k)
		      {
		        case 1:
		        
		         System.out.println("Nhap số lượng sinh viên muốn thêm : ");
		         n= sc.nextInt();
					sc.nextLine();
					
		         	for (int i = 0 ; i < n ; i++)
		         		{
		         			System.out.println("Nhap sinh vien thu"+ (i+1) + ": ");
		         			String s = sc.nextLine();
		         			ds.add(s);
		         		}
		            break;
		        case 2:
		           System.out.println("Cac phan tu trong Mang Array : ");
		           		for (String s: ds)
							{
								System.out.println(s);
							}
		            break;
		        case 3:
		           
		            break;
		        case 4:
		          
		            break;
		        case 5:
		      
		            break;
		        case 6:
		         
		            break;
		        case 7:
		        	do
		        	{
		        		System.out.println("so luong sinh vien la :"+ ds.size() +" ");
		        		System.out.println("quay lai? 1/0");
		        		int o = sc.nextInt();
		        		break;
		        	}while(0==1);
		        	
			case 8:
		        	break;
		      }
					
		}while(k!=8);
		
		
		
			
			
			
			//System.out.println("Nhap phan tu muon them vao");
			
		}
		catch(Exception ex)
		{
			System.out.println("Loi nhap du lieu!");
		}
		finally
		{
//						
		}
	}
}
