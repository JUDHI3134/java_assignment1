/*find sum of product of corresponding digits of two any 4 digit
number Such as n=1234 m=7896 output=6*4+9*3+8*2+7*1*/

public class SumProduct {

    public static void main(String args[]){

        //int n = 1234,  m = 7896;
        int n = Integer.parseInt(args[0]);
         int m = Integer.parseInt(args[1]);
        int r,a,b,c,d,e,f,g,h;

        r = n%10;
        a= r;
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
        e= r;
        m = m/10;
        r = m%10;
        f = r;
        m = m/10;
        r = m%10;
        g = r;
        m = m/10;
        r = m%10;
        h = r;

        int sOfP = (a*e+b*f+c*g+d*h);
        System.out.println("Sum of Product of Corresponding digit of Any four digit number :"+a+"*"+e+"+"+b+"*"+f+"+"+c+"*"+g+"+"+d+"*"+h+" = "+sOfP);

    }
    
}
