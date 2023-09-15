public class sumOfProduct {

    public static void main(String args[]){
          //int n = 1234;
          int n = Integer.parseInt(args[0]);
          int r,a,b,c,d;

          r = n%10;
          a=r;
          n = n/10;
          r = n%10;
          b = r;
          n = n/10;
          r = n%10;
          c = r;
          n = n/10;
          r = n%10;
          d = r;
          System.out.println("Sum of Product of Consecutive four digit number is :"+a+"*"+b +"+"+b+"*"+c+"+"+c+"*"+d+" = "+(a*b+b*c+c*d));

    }
    
}
