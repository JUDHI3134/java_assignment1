/*Write a java program to find sum of product of corresponding even digits of
first any digit number and corresponding odd digit of any 4 digit number Such as
n=1234 m=4567 output=4*7+2*5 */
public class productSum {
    public static void main(String args[]){
       // int n = 4567,  m = 3456;
       int n = Integer.parseInt(args[0]);
       int m = Integer.parseInt(args[1]);
        int r,a,b,c,d,e,f,g,h;

        r = n%10;
        a = r;
        n = n/10;
        r = n%10;
        b = r;
        n = n/10;
        r = n%10;
        c = r;
        n = n/10;
        r = n%10;
        d = r;

        r = m%10;
        e = r;
        m = m/10;
         r = m%10;
        f = r;
        m = m/10;
         r = m%10;
        g = r;
        m = m/10;
         r = m%10;
        h = r;
        m = m/10;

        int product1 = (a%2==0 &&  e%2 !=0)?a*e:0;
        int product2 = (b%2==0 &&  f%2 !=0)?b*f:0;
        int product3 = (c%2==0 &&  g%2 !=0)?c*g:0;
        int product4 = (d%2==0 &&  h%2 !=0)?d*h:0;

        int totalSum = product1+product2+product3+product4;

        System.out.println("sum of product of corresponding even digits of first any digit number and corresponding odd digit of any 4 digit number  = "+totalSum);

    }
}
