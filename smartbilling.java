import java.util.Scanner;

class SmartBilling{

    static double finalPrice(double total) {
        double discount = 0;

        if (total >= 5000) {
            discount = total * 0.10;
        } else if (total >= 2000) {
            discount = total * 0.05;
        }

        double discountedAmount = total - discount;
        double gst = discountedAmount * 0.18;

        return discountedAmount + gst;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double totalAmount = 0;

        System.out.print("Enter number of items: ");
        int items = sc.nextInt();

        for (int i = 1; i <= items; i++) {
            System.out.println("\nItem " + i);

            System.out.print("Enter item price: ");
            double price = sc.nextDouble();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            totalAmount += price * quantity;
        }

        double finalAmount = finalPrice(totalAmount);

        System.out.println("\nTotal Amount (before discount & GST):" + totalAmount);
        System.out.println("Final Payable Amount:" + finalAmount);

           sc.close();
    }
}
