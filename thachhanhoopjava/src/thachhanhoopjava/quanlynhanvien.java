package thuchanhoopjava;
import java.util.*;
public class quanlynhanvien {
	
	
	
public class NhanVien
{
	private String ho,ten;
	private  int soSP;
	
	public NhanVien(String string, String string2, int i) {
        this.ho=ho;
        this.ten=ten;
        if(soSP<0)
        {
        	soSP=0;
        }
        else
        {
        	soSP=soSP
        }
	}

	public void setho(String ho) { this.ho=ho;}
	
	public void seten(String ten) { this.ten=ten;}
	
	public void setsoSp(int soSP) { this.soSP=soSP;}
	
	
	public String getho(String ho) { return this.ho;}
	
	public String getten(String ten) { return this.ten;}
	
	public int getsoSp(int soSP) { return this.soSP;}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NhanVien nv = new NhanVien("truong","huy",7);
			
	}

}
