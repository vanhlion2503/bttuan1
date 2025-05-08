package NumberProcessorApp;

public class NumberProcessor {
    public String processNumbers(int[] numbers) {
        int sum = 0;
        for (int num : numbers) { // Vòng lặp
            if (num % 2 == 0) { // Lệnh rẽ nhánh
                sum += num;
            } else {
                sum -= num;
            }
        }
        if (sum > 0) {
            return "Positive";
        } else if (sum < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }
}
