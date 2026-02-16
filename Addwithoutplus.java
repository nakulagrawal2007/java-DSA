import java.util.Scanner;
class Addwithoutplus {

    static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int FirstNumber = sc.nextInt();
        int SecondNumber = sc.nextInt();
        int Sum = add(FirstNumber, SecondNumber);
        System.out.println("Difference = "+ Sum);
    }
    }
