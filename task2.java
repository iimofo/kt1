public class Task2 {
    public static void main(String[] args) {
        for (int number = 0; number <= 1000; number++) {
            if (number % 3 == 0 && number % 5 != 0) {
                int total = sumDigits(number);
                if (total < 10) {
                    System.out.println(number);
                }
            }
        }
    }

    private static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
