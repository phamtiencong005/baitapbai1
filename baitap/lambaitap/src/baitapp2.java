import java.util.Scanner;
public class baitapp2 {
public static void main(String[] args) {
        double vnd = 24000 ;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tiền USD bạn muốn đổi:");
        usd = scanner.nextDouble();
        double doi = usd * 24000;
        System.out.println("giá trị vnd: " + doi);
    }
}
