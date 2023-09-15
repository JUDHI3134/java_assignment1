public class operator {

    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        int r,a,b,c,d;

        int se = 0;
        int so = 0;
        r = n%10;
        a = (r%2==0)?r:0;
        se = se+a;
        so = so+0;
        a = (r%2 != 0)?r:0;
        so = so+a;
        se = se+0;
        n = n/10;

        r = n%10;
        b = (r%2==0)?r:0;
        se = se+b;
        so = so+0;
        b = (r%2 != 0)?r:0;
        so = so+b;
        se = se+0;
        n = n/10;

        r = n%10;
        c = (r%2==0)?r:0;
        se = se+c;
        so = so+0;
        c = (r%2 != 0)?r:0;
        so = so+c;
        se = se+0;
       n = n/10;

        r = n%10;
        d = (r%2==0)?r:0;
        se = se+d;
        so = so+0;
        d = (r%2 != 0)?r:0;
        so = so+d;
        se = se+0;
        System.out.println("Sum of all Even Number in a four digit Number is :"+se);
        //System.out.println("Sum of all Odd Number in a four digit Number is :"+so);



    }
    
}
