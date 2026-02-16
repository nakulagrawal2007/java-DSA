import java.util.Scanner;
class SubtractWithoutMinus {

    static int subtract(int a, int b) {
        return add(a, add(~b, 1));   // a + (-b)
    }

    static int add(int x, int y) {
        while (y != 0) {
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;

        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int FirstNumber = sc.nextInt();
        int SecondNumber = sc.nextInt();
        int Difference = subtract(FirstNumber, SecondNumber);
        System.out.println("Difference = "+ Difference);
    }
}
