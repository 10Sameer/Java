public class while {
    public static void main(String[] args) {
        int number = 10;

        System.out.println("Prime numbers between 10 and 50:");

        while (number <= 50) {
            boolean isPrime = true;

            if (number == 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
            }

            number++;
        }
    }
}
