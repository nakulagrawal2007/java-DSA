import java.util.Scanner;

public class numcheckwithoutmodulo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        // Using bitwise AND with 1
        if ((num & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        
        sc.close();
    }
}