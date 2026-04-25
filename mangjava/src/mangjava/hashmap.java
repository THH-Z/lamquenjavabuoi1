package mangjava;

import java.util.*;

public class hashmap {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        HashMap<String, Integer> map = new HashMap<>();

	        System.out.print("Nhập số lượng phần tử: ");
	        int n = sc.nextInt();
	        sc.nextLine(); // tránh lỗi nhập chuỗi

	        for (int i = 0; i < n; i++) {
	            System.out.println("Phần tử thứ " + (i + 1));

	            System.out.print("Nhập key: ");
	            String key = sc.nextLine();

	            System.out.print("Nhập value: ");
	            int value = sc.nextInt();
	            sc.nextLine(); // clear buffer

	            map.put(key, value);
	        }

	        // In ra kết quả
	        System.out.println("\nDanh sách HashMap:");
	        for (String key : map.keySet()) {
	            System.out.println(key + " = " + map.get(key));
	        }
	}

}
