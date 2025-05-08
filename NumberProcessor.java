// NumberProcessor.java
import java.util.Scanner;

public class NumberProcessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumEven = 0;
        int sumOdd = 0;

        System.out.println("Nhập 5 số nguyên:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Số thứ " + (i + 1) + ": ");
            int number = scanner.nextInt();

            // Rẽ nhánh
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }

        System.out.println("Tổng các số chẵn: " + sumEven);
        System.out.println("Tổng các số lẻ: " + sumOdd);
    }
}
