/*find bitwise and , or , and xor of 2nd and 4th digit of any 4 digit
number? */
public class operature1 {

    public static void main(String args[]){
       //int n = 3456;
       int n = Integer.parseInt(args[0]);

       int r,secondDigit, fourthDigit;

       r = n%10;
       fourthDigit = r;
       n = n/10;
       r = n%10;
       n = n/10;
       r = n%10;
       secondDigit = r;
       n = n/10;
       r = n%10;

       int bitwise_or,bitwise_and,bitwise_xor;

       bitwise_and = secondDigit & fourthDigit;
       System.out.println("bitwise-AND of "+secondDigit+" and "+fourthDigit+" is "+bitwise_and);

       bitwise_or = secondDigit | fourthDigit;
       System.out.println("bitwise-OR of "+secondDigit+" and "+fourthDigit+" is "+bitwise_or);

       bitwise_xor = secondDigit ^ fourthDigit;
       System.out.println("bitwise-XOR of "+secondDigit+" and "+fourthDigit+" is "+bitwise_xor);


    
    }
    
}
