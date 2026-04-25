package thuchanhbuoi254;
import java.util.*;

public class menusinhvien {

	public static void main(String[] args) {
		System.out.println("Nhap so luong sinh vien");
		Scanner sc=new Scanner(System.in);
		
			int n = 0;
             n= sc.nextInt();
			int[] a=new int[n];
			int k=0;
			while(k>0)
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
				
				
				
			}
			
	}

}
