import java.util.Scanner;

class numberreverse {

    static void analyzeNumber(int number) {
        int temp = number;
        int reverse = 0;
        int sum = 0;
        int count = 0;


        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            sum =sum + digit;
            count++;
            temp = temp/10;
        }

        System.out.println("Reverse = " + reverse);
        System.out.println("Sum of digits = " + sum);
        System.out.println("Count of digits = " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        analyzeNumber(number);

        sc.close();
    }
}




