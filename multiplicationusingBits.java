import java.util.Scanner;
class multiplicationusingBits {

    static int multiplication(int a, int b) {
        int result = 0;
        boolean negative = false;

        if (a < 0) { a = -a; negative = !negative; }
        if (b < 0) { b = -b; negative = !negative; }

        while (b != 0) {
            if ((b & 1) == 1)
                result = result + a;

            a <<= 1;
            b >>= 1;
        }

        return negative ? -result : result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int FirstNumber = sc.nextInt();
        int SecondNumber = sc.nextInt();
        int Product = multiplication(FirstNumber, SecondNumber);
        System.out.println("Product = "+ Product);
    }
    }
