import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("HÓA ĐƠN TIỀN ĐIỆN");
        System.out.println("NHẬP SỐ ĐIỆN BẠN DÙNG HẾT TRONG THÁNG NÀY:");
        int soDien = scanner.nextInt();
        double bac1;
        double bac2;
        double bac3;
        double bac4;
        double bac5;
        double bac6;
        if (soDien < 0){
            System.out.println("Nhập số điện không hợp lệ. " + "\n" + "Vui long nhập lại.");
        }
        if(soDien <= 50){
            bac1 = soDien * 1.678;
            System.out.println("Số tiền điện bạn phải trả tháng này là: " + bac1);
        }else if(soDien <= 100){
            bac2 = ((soDien - 50) * 1.734 ) + (50 * 1.678);
            System.out.println("Số tiền điện bạn phải trả tháng này là: " + bac2);
        } else if (soDien <= 200) {
            bac3 = (soDien - 100) * 2.014 + 50 * 1.678 + 50 * 1.734;
            System.out.println("Số tiền điện bạn phải trả tháng này là: " + bac3);
        } else if (soDien <= 300) {
            bac4 = (soDien - 200) * 2.536 + 50 * 1.678 + 50 * 1.734 + 100 * 2.014;
            System.out.println("Số tiền điện bạn phải trả tháng này là: " + bac4);
        } else if (soDien <= 400) {
            bac5 = (soDien - 300) * 2.834 + 50 * 1.678 + 50 * 1.734 + 100 * 2.014 + 100 * 2.536;
            System.out.println("Số tiền điện bạn phải trả tháng này là: " + bac5);
        }else{
            bac6 = soDien * 2.927;
            System.out.println("Số tiền điện bạn phải trả tháng này là: " + bac6);
        }


    }
}