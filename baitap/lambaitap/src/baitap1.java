import  java.util.Scanner;
public class baitap1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên của bạn:");
        String name = scanner.nextLine();
        System.out.println("xin chào " +  name + " !");
    }
}