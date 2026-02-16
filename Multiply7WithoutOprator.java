import java.util.Scanner;

class Multiply7WithoutOprator {

    static int multiplyBy7(int number) {
        return (number << 3) - number;   // (8x - x)
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Result = " + multiplyBy7(number));

        sc.close();
    }
}
