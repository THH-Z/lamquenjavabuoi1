import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Invoice {
    private String maMatHang;
    private String moTaHang;
    private int soLuong;
    private double donGia;

    public Invoice(String maMatHang, String moTaHang, int soLuong, double donGia) {
        this.maMatHang = maMatHang;
        this.moTaHang = moTaHang;
        this.soLuong = (soLuong > 0) ? soLuong : 0;
        this.donGia = (donGia > 0) ? donGia : 0;
    }

    // Getters
    public String getMaMatHang() { return maMatHang; }
    public int getSoLuong() { return soLuong; }

    public double getThanhTien() {
        return soLuong * donGia;
    }

    @Override
    public String toString() {
        return String.format("Mã: %-10s | Mô tả: %-15s | SL: %-5d | Đơn giá: %-10.2f | Tổng: %-10.2f", 
                maMatHang, moTaHang, soLuong, donGia, getThanhTien());
    }
}

public class InvoiceTest {
    private static ArrayList<Invoice> list = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- MENU QUaN Ly HaA doN ---");
            System.out.println("1. Nhap danh sach Invoice (it nhất 10)");
            System.out.println("2. Xuat danh sach Invoice");
            System.out.println("3. Sap xep theo Ma và So luonng (Tang dan)");
            System.out.println("4. Tim kiem theo Ma mat hang");
            System.out.println("5. Xoa Invoice theo Ma mat hang");
            System.out.println("0. Thoat");
            System.out.print("Lua chon cua ban: ");
            choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {
                case 1: nhapDuLieu(); break;
                case 2: xuatDuLieu(); break;
                case 3: sapXep(); break;
                case 4: timKiem(); break;
                case 5: xoaInvoice(); break;
                case 0: System.out.println("Tam biet!"); break;
                default: System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 0);
    }

    // 1. Nhập dữ liệu (có kiểm tra trùng mã)
    public static void nhapDuLieu() {
        System.out.print("Nhap so luong hoa donn muon them: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhapp hoa don thu " + (i + 1) + ":");
            String ma;
            while (true) {
                System.out.print(" - Ma mat hang: ");
                ma = sc.nextLine();
                boolean trungMa = false;
                for (Invoice inv : list) {
                    if (inv.getMaMatHang().equalsIgnoreCase(ma)) {
                        trungMa = true;
                        break;
                    }
                }
                if (!trungMa) break;
                System.out.println("Loi: Ma mat hang đa ton tai! Vui long nhap ma khac.");
            }
            System.out.print(" - Mo ta: ");
            String moTa = sc.nextLine();
            System.out.print(" - So luong: ");
            int sl = sc.nextInt();
            System.out.print(" - don gia: ");
            double dg = sc.nextDouble();
            sc.nextLine();

            list.add(new Invoice(ma, moTa, sl, dg));
        }
    }

    // 2. Xuất dữ liệu
    public static void xuatDuLieu() {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong!");
            return;
        }
        System.out.println("\nDANH SaCH HoA doN:");
        for (Invoice inv : list) System.out.println(inv);
    }

    // 3. Sắp xếp (Dùng Comparator để sắp xếp đa tiêu chí)
    public static void sapXep() {
        Collections.sort(list, new Comparator<Invoice>() {
            @Override
            public int compare(Invoice o1, Invoice o2) {
                // Sắp xếp theo Mã trước
                int res = o1.getMaMatHang().compareTo(o2.getMaMatHang());
                if (res == 0) {
                    // Nếu mã trùng (trong trường hợp cho phép) thì xếp theo số lượng
                    return Integer.compare(o1.getSoLuong(), o2.getSoLuong());
                }
                return res;
            }
        });
        System.out.println("da sap xep danh sach.");
    }

    // 4. Tìm kiếm (Tìm tuyến tính)
    public static void timKiem() {
        System.out.print("Nhap ma can tim: ");
        String ma = sc.nextLine();
        boolean found = false;
        for (Invoice inv : list) {
            if (inv.getMaMatHang().equalsIgnoreCase(ma)) {
                System.out.println("Ket qua: " + inv);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Khong tim thay ma: " + ma);
    }

    // 5. Xóa Invoice
    public static void xoaInvoice() {
        System.out.print("Nhap ma can xoa: ");
        String ma = sc.nextLine();
        boolean removed = list.removeIf(inv -> inv.getMaMatHang().equalsIgnoreCase(ma));
        if (removed) System.out.println("da xoa thanh cong.");
        else System.out.println("Khong tim thay ma de xoa.");
    }
}