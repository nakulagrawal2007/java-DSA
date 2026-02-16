import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "1234";

        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter username: ");
            String username = sc.next();

            System.out.print("Enter password: ");
            String password = sc.next();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login Successful");
                return;
            } else {

                attempts++;
                System.out.println("Wrong credentials. Attempts left: " + (3 - attempts));
            }
        }

        System.out.println("Account Locked");
    }
}
