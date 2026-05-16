import java.util.Scanner;

public class bai3lophinhhoc {
 public static class Hinh 
 {
  protected String mauSac;
  protected double dienTich;
  protected double chuVi;

    public Hinh(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) 
    {
        this.mauSac = mauSac;
    }

    public void dientich() {
        // Phương thức tính diện tích sẽ được triển khai trong các lớp con
    }

    public void chuVi() {
        // Phương thức tính chu vi sẽ được triển khai trong các lớp con
    }

 }

 //HINH CHU NHAT
 public static class hinhchunhat extends Hinh 
 {
     protected double chieuDai;
     protected double chieuRong; 

     public hinhchunhat(String mauSac, double chieuDai, double chieuRong) {
        super(mauSac);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public void dientich() {
        double dienTich = chieuDai * chieuRong;
        System.out.println("Dien tich hinh chu nhat: " + dienTich);
    }
    public void chuVi() {
        double chuVi = 2 * (chieuDai + chieuRong);
        System.out.println("Chu vi hinh chu nhat: " + chuVi);
    }
    public double getChieuDai() {
    return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }
}

//HINH TRON
 public static class hinhtron extends Hinh
    {
        private double banKinh;
    
        public hinhtron(String mauSac, double banKinh) {
            super(mauSac);
            this.banKinh = banKinh;
        }

        public void dientich() {
            double dienTich = Math.PI * banKinh * banKinh;
            System.out.println("Dien tich hinh tron: " + dienTich);
        }

        public void chuVi() {
            double chuVi = 2 * Math.PI * banKinh;
            System.out.println("Chu vi hinh tron: " + chuVi);
        }
        public double getBanKinh() {
            return banKinh;
        }

    }

    //HINH VUONG
    public static class hinhvuong extends hinhchunhat
    {
        public hinhvuong(String mauSac, double canh) {
            super(mauSac, canh, canh);
        }
        
        public double getCanh() {
            return chieuDai; // Hoặc chieuRong, vì chúng bằng nhau
        }
        public void setCanh(double canh) {
            this.chieuDai = canh;
            this.chieuRong = canh;
        }
        public void setMauSac(String mauSac) {
            super.setMauSac(mauSac);
        }
        public String getMauSac() {
            return super.getMauSac();
        }


        @Override
        public void dientich() {
            double dienTich = Math.pow(super.chieuDai, 2);
            System.out.println("Dien tich hinh vuong: " + dienTich);
        }

        @Override
        public void chuVi() {
            double chuVi = 4 * super.chieuDai;
            System.out.println("Chu vi hinh vuong: " + chuVi);
        }
    }



    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        try
        {
            System.out.println("--- NHAP THONG TIN HINH CHU NHAT ---");
            System.out.print("Nhap mau sac: ");
            String mauSacCN = scanner.nextLine().trim();
            System.out.print("Nhap chieu dai: ");
            double chieuDai = Double.parseDouble(scanner.nextLine().trim());
            System.out.print("Nhap chieu rong: ");
            double chieuRong = Double.parseDouble(scanner.nextLine().trim());
            hinhchunhat hinh1 = new hinhchunhat(mauSacCN, chieuDai, chieuRong);
            hinh1.dientich();
            hinh1.chuVi();

            System.out.println("\n--- NHAP THONG TIN HINH TRON ---");
            System.out.print("Nhap mau sac: ");
            String mauSacHT = scanner.nextLine().trim();
            System.out.print("Nhap ban kinh: ");
            double banKinh = Double.parseDouble(scanner.nextLine().trim());
            hinhtron hinh2 = new hinhtron(mauSacHT, banKinh);
            hinh2.dientich();
            hinh2.chuVi();

            System.out.println("\n--- NHAP THONG TIN HINH VUONG ---");
            System.out.print("Nhap mau sac: ");
            String mauSacHV = scanner.nextLine().trim();
            System.out.print("Nhap canh: ");
            double canh = Double.parseDouble(scanner.nextLine().trim());
            hinhvuong hinh3 = new hinhvuong(mauSacHV, canh);
            hinh3.dientich();
            hinh3.chuVi();
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Loi: " + ex.getMessage());
        }
        finally
        {
            scanner.close();    
        }
       
    }
}

