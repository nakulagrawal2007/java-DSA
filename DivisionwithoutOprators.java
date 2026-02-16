import java.util.Scanner;
class DivisionwithoutOperators {

    static int divide(int dividend, int divisor) {
        int quotient = 0;

        while (dividend >= divisor) {
            dividend = dividend - divisor;
            quotient++;
        }

        return quotient;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int FirstNumber = sc.nextInt();
        int SecondNumber = sc.nextInt();
        int Quosint = divide(FirstNumber, SecondNumber);
        System.out.println("quosint = "+ Quosint);
    }
}
