import java.util.Scanner;

class NumberTesting{
    boolean isPrime(int Number){
        for(int i = 2; i<Number; i++){
            if(Number%i==0){
                return false;
            }
        }
        return true;
    }
    boolean isStrong(int Number){
        int rem, copy=Number, sum=0;
        while(copy>0){
            int fact=1;
            rem= copy%10;
            for(int i=1; i<=rem; i++){
                fact= fact*i;
            }
            sum = sum+fact;
            copy= copy/10;
        }
        if(sum == Number){
            return true;
        }
        else return false;
    }
    boolean isArmstrong(int Number){
        int rem, sum=0, copy=Number, power=0;
        while(copy>0){
            power++;
            copy=copy/10;
        }
        copy= Number;
        while (copy>0){
            rem = copy%10;
            int temp = rem;
            for(int i=1; i<power; i++){
                rem=rem*temp;
            }
            sum = sum+rem;
            copy = copy/10;
        }
            if(sum==Number) return true;
            else return false;
    }
//    boolean isPalindrom(int Number){
//
//    }
//    boolean isPerfect(int Number){
//
//    }
//    boolean isAutomorphic(int Number){
//
//    }
//    boolean isNeon(int Number){
//
//    }
//    boolean isHarshad(int Number){
//
//    }
//    boolean isSpy(int Number){
//
//    }
//    boolean isSunny(int Number){
//
//    }
}

public class Exec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        NumberTesting test = new NumberTesting();

        boolean result1 = test.isPrime(input);
        boolean result2 = test.isStrong(input);
//        boolean result3 = test.isAutomorphic(input);
//        boolean result4 = test.isHarshad(input);
//        boolean result5 = test.isNeon(input);
//        boolean result6 = test.isPerfect(input);
//        boolean result7 = test.isPalindrom(input);
//        boolean result8 = test.isSpy(input);
//        boolean result9 = test.isSunny(input);
          boolean result10 = test.isArmstrong(input);

        if (result1 == true) {
            System.out.println("Prime Number");}
        if (result2 == true) {
            System.out.println("Strong Number");}
        if(result10 == true){
            System.out.println("Armstrong Number");}
    }
}
