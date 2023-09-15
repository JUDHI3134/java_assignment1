/*find the face value and position value of any 4 digit number? */
public class faceValue {
    public static void main(String args[]){
       //int n = 9873;
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

        System.out.println("Face value of "+fourthDigit+" is "+fourthDigit);
        System.out.println("position value of "+fourthDigit+" is "+fourthDigit);

         System.out.println("Face value of "+thirdDigit+" is "+thirdDigit);
        System.out.println("position value of "+thirdDigit+" is "+thirdDigit*10);

         System.out.println("Face value of "+secondDigit+" is "+secondDigit);
        System.out.println("position value of "+secondDigit+" is "+secondDigit*100);

         System.out.println("Face value of "+firstDigit+" is "+firstDigit);
        System.out.println("position value of "+firstDigit+" is "+firstDigit*1000);
    }
}
