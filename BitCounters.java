import java.util.Scanner;

class BitCounter {

    static int countSetBits(int number) {
        int count = 0;

        while (number != 0) {
            count += number & 1;
            number >>= 1; 
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Set Bits = " + countSetBits(number));

        sc.close();
    }
}
