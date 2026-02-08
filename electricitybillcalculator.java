import java.util.Scanner;

class electricitybillcalculator {

    static double Billcalculator(int units) {
        double bill, Total;

        if (units <= 100) {
            bill = units * 2;
        } 
        else if (units <= 200) {
            bill = (100 * 2) + ((units - 100) * 3);

        } 
        else {
            bill = (100 * 2) + (100 * 3) + ((units - 200) * 5);
        }
        Total = bill + 150;

        return Total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        double totalBill = Billcalculator(units);

        System.out.println("Total Electricity Bill = " + totalBill);

        sc.close();
    }
}
