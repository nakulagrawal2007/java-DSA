import java.util.Scanner;

class TwosPowerCheaker {

    static boolean isPowerOfTwo(int number) {
        return number > 0 && (number & (number - 1)) == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isPowerOfTwo(number)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        sc.close();
    }
}
