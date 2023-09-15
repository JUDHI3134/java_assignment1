public class position {
    public static void main(String args[]){

        //int n = 5678;
        int n = Integer.parseInt(args[0]);
        int r,firstDigit, secondDigit, thirdDigit, fourthDigit;

        r = n%10;
        fourthDigit=r;
        n = n/10;
        r = n%10;
        thirdDigit = r;
        n = n/10;
        r = n%10;
        secondDigit = r;
        n = n/10;
        r = n%10;
        firstDigit = r;

        System.out.println("The Digit at 10 th place is "+thirdDigit);
        System.out.println("The Digit at 100 th place is "+secondDigit);
        System.out.println("The Digit at 1000 th place is "+firstDigit);
        
    }
}
