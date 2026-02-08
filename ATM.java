import java.util.Scanner;

class ATM {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        if (amount % 100 == 0 && (balance - amount) >= 1000) {
            balance = balance - amount;
            System.out.println("\nWithdrawal Successful");
            System.out.println("Remaining Balance = " + balance);
        } else {
            System.out.println("Withdrawal Failed");
        }

        sc.close();
    }
}
