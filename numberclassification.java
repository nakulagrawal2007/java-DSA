import java.util.Scanner;

class numberclassification {

    static void numberclassify(int number) {

        if (number >= 0)
            System.out.println("Positive Number");
        else
            System.out.println("Negative Number");

        if (number % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");

        if (number % 5 == 0 && number % 7 == 0)
            System.out.println("Divisible by both 5 and 7");
        else
            System.out.println("Not divisible by both 5 and 7");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        numberclassify(number);
    }
}
