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
        if(sum == Number)return true;
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
    boolean isPalindrom(int Number){
        int rem, copy=Number, rev=0;
        while(copy>0){
            rem = copy%10;
            rev = rev*10+rem;
            copy= copy/10;
        }
        if(rev==Number) return true;
        else return false;

    }
    boolean isPerfect(int Number){
        int sum=0;
    for(int i=1; i<Number; i++){
        if(Number%i == 0){
            sum = sum+i;
        }
    }
    if(sum == Number) return true;
    else return false;
    }
    boolean isAutomorphic(int Number){
        int square = Number*Number;
        while (Number>0){
            if (Number%10!=square%10) return false;
            Number=Number/10;
            square=square/10;
        }
        return true;
    }
    boolean isNeon(int Number){
        int copy=Number,rem,sum=0;
        copy=copy*copy;
        while (copy>0){
            rem=copy%10;
            sum=sum+rem;
            copy=copy/10;
        }
        if (sum==Number) return true;
        else return false;
    }
    boolean isHarshad(int Number){
        int sum=0, copy= Number,rem;
        while(copy>0){
            rem=copy%10;
            sum=sum+rem;
            copy=copy/10;
        }
        if(Number%sum==0)return true;
        else return false;
    }
    boolean isSpy(int Number){
        int rem, sum=0, pro=1, copy= Number;
        while (copy>0){
            rem=copy%10;
            sum=sum+rem;
            pro=pro*rem;
            copy=copy/10;
        }
        if (sum==pro) return true;
        else return false;
    }
//    boolean isSunny(int Number){
//        Number++;
//        float result = Math.sqrt(Number);
//        if(result)
//    }
}

public class Exec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        NumberTesting test = new NumberTesting();

        boolean result1 = test.isPrime(input);
        boolean result2 = test.isStrong(input);
        boolean result3 = test.isAutomorphic(input);
        boolean result4 = test.isHarshad(input);
        boolean result5 = test.isNeon(input);
        boolean result6 = test.isPerfect(input);
        boolean result7 = test.isPalindrom(input);
        boolean result8 = test.isSpy(input);
//        boolean result9 = test.isSunny(input);
          boolean result10 = test.isArmstrong(input);

        if (result1) {
            System.out.println("Prime Number");}
        if (result2) {
            System.out.println("Strong Number");}
        if(result10){
            System.out.println("Armstrong Number");}
        if(result7){
            System.out.println("Palindrom Number");}
        if(result6){
            System.out.println("Perfect Number");}
        if(result4){
            System.out.println("Harshad Number");}
        if(result8){
            System.out.println("Spy Number");}
        if(result5){
            System.out.println("Neon Number");}
        if(result3){
            System.out.println("Automorphic Number");}
    }
}
