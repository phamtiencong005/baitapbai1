import java.util.Scanner;
public class baitap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm chuyên cần: ");
        double diemchuyencan = scanner.nextDouble();
        System.out.print("Nhập điểm kiểm tra: ");
        double diemkiemtra = scanner.nextDouble();
        System.out.print("Nhập điểm thi học kỳ: ");
        double diemhocki = scanner.nextDouble();
        double diemtongket = tinhdiemtongket(diemchuyencan, diemkiemtra, diemhocki);
        String loai = xeploai(diemtongket);
        System.out.println("Điểm tổng kết: " + diemtongket);
        System.out.println("Xếp loại: " + loai);
        scanner.close();
    }
    public static double tinhdiemtongket(double chuyencan, double kiemtra, double hocki) {
        return chuyencan * 0.2 + kiemtra * 0.3 + hocki * 0.5;
    }
    public static String xeploai(double diem) {
        if (diem >= 8.5) {
            return "A";
        } else if (diem >= 7.0) {
            return "B";
        } else if (diem >= 5.5) {
            return "C";
        } else if (diem >= 4.0) {
            return "D";
        } else {
            return "F";
        }
    }
}