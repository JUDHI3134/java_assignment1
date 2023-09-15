/*Find left shit, right shift and zero fill of summation of all digits of any
4 digit number and it will be shifted by 3rd digit of any 4 digit
number? */
public class Shift {
    public static void main(String args[]){
         
        //int n = 3567;
        int n = Integer.parseInt(args[0]);
        int r,firstDigit,secondDigit,thirdDigit,fourthDigit;
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
        int sumOfDigit = firstDigit+secondDigit+thirdDigit+fourthDigit;

        //summation of all digits of any 4 digit number and it will be shifted by 3rd digit
        
        int shiftt = sumOfDigit << thirdDigit;
        System.out.println("Sum of all digit left shift third digit :"+shiftt);
        //bit operation
        int leftShift = shiftt << thirdDigit;
        int rightShift = shiftt >> thirdDigit;
        int zeroFillRightShift = shiftt >>> thirdDigit;

        System.out.println("Left Shift :"+leftShift);
        System.out.println("Right Shift :"+rightShift);
        System.out.println("Zero fill Right Shift :"+zeroFillRightShift);

    }
}
