import java.util.*;
import java.util.regex.*;

public class bai2chuongtirnhdemsoam {
    public static void NegativeNumberInStrings(String str) {
        Pattern p = Pattern.compile("-\\d+");
        Matcher m = p.matcher(str);

        List<Integer> result = new ArrayList<>();

        while (m.find()) {
            result.add(Integer.parseInt(m.group()));
        }

        System.out.println("Count: " + result.size());
        System.out.println("Numbers: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String input = sc.nextLine();

        NegativeNumberInStrings(input);
        //NegativeNumberInStrings("abc-5xyz-12k9l--p");
        sc.close();
    }
}


