package baitachduongdan;

import java.util.*;

public class tachduongdan {

	public static void main(String[] args) {
		
		String s="D:/music/bolero/longme.mp3";
		
		 try {
	            String s3 = s.substring(16,22);
	            System.out.println(s3);

	            String s4 = s.substring(16,26);
	            System.out.println(s4);
	        } 
	        catch (StringIndexOutOfBoundsException e) {
	            System.out.println("vượt quá độ dài!");
	        }

	}

}
