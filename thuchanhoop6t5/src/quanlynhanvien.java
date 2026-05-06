import java.util.*;

class NhanVien {
    private String ho, ten;
    private int soSP;

    public NhanVien(String ho, String ten, int soSP) {
        this.ho = ho;
        this.ten = ten;
        this.soSP = (soSP < 0) ? 0 : soSP;
    }

    public String getHo() { return ho; }
    public String getTen() { return ten; }
    public int getSoSP() { return soSP; }

    public void nhap(Scanner sc) {
        System.out.print("Nhap ho: ");
        ho = sc.nextLine();

        System.out.print("Nhap ten: ");
        ten = sc.nextLine();

        System.out.print("Nhap so SP: ");
        soSP = Integer.parseInt(sc.nextLine());
    }

    public void xuat() {
        System.out.println(ho + " " + ten + " - SP: " + soSP);
    }
}

public class quanlynhanvien {

    static ArrayList<NhanVien> ds = new ArrayList<>();

    public static void main(String[] args) {

         NhanVien nv = new NhanVien("", "", 0);
        Scanner sc = new Scanner(System.in);
        nv.nhap(sc);
        ds.add(nv);
       
        nv.xuat();
    }
}