import java.util.Scanner;
import java.util.Scanner;

public class baitap4 {
    private static final String[] oneDigit = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] twoDigitsFrom10To19 = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tensMultiple = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private static final String[] tensPower = {"hundred"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần đọc (0-999): ");
        int number = scanner.nextInt();
        if (number < 0 || number > 999) {
            System.out.println("Số không hợp lệ");
            return;
        }
        String result = "";
        if (number == 0) {
            result = "zero";
        } else {
            result = convertToWords(number);
        }
        System.out.println("Số " + number + " được đọc là: " + result);
        scanner.close();
    }

    public static String convertToWords(int number) {
        if (number < 10) {
            return oneDigit[number];
        } else if (number < 20) {
            return twoDigitsFrom10To19[number - 10];
        } else if (number < 100) {
            return tensMultiple[number / 10] + " " + oneDigit[number % 10];
        } else {
            return oneDigit[number / 100] + " " + tensPower[0] + " and " + convertToWords(number % 100);
        }
    }
}
