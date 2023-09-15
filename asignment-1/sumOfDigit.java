public class sumOfDigit {
    public static void main(String args[]){
       //int num = 3456;
       int num = Integer.parseInt(args[0]);
        int sum = 0,remainder;
        
        remainder  = num%10;
        sum = sum+remainder;
        num = num/10;
        remainder  = num%10;
        sum = sum+remainder;
        num = num/10;
        remainder  = num%10;
        sum = sum+remainder;
        num = num/10;
        remainder  = num%10;
        sum = sum+remainder;
        num = num/10;
        System.out.println("Sum of this(3456) four digit number is = "+sum);

    }
}
