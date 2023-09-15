public class diffAverage {
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        int r,a,b,c,d;
        int se = 0;
        int so = 0;
        int evenCount = 0,oddCount = 0;

        r = n%10;
        a = r;
        int p = (a%2==0 && a%4 != 0)?a:0;
        se = se+p;
        p = (a%2 != 0 && a%3 != 0)?a:0;
        so = so+p;
        int x=(a%2==0)?evenCount++:oddCount++;
       n = n/10;

        r = n%10;
        b = r;
        int q = (b%2==0 && b%4 != 0)?b:0;
        se = se+q;
        q = (b%2 != 0 && b%3 != 0)?b:0;
        so = so+q;
        int y=(b%2==0)?evenCount++:oddCount++;
        n = n/10;

        r = n%10;
        c = r;
        int s = (c%2==0 &&  c%4 != 0)?c:0;
        se = se+s;
        s = (c%2 != 0 && c%3 != 0)?c:0;
        so = so+s;
        int z=(c%2==0)?evenCount++:oddCount++;
        n = n/10;

        r = n%10;
        d = r;
        int t = (d%2==0 &&  d%4 != 0)?d:0;
        se = se+t;
        t = (d%2 != 0 && d%3 != 0)?d:0;
        so = so+t;
        int w=(d%2==0)?evenCount++:oddCount++;
        //System.out.println(se+"   "+so+"   "+evenCount+"    "+oddCount);

       float eA = se/evenCount;
       float oA = so/oddCount;
       float difference = eA - oA;

    //    int evenAverage = (eA%4==0)?0:eA;
    //    int oddAverage = (oA%3==0)?0:oA;

    //    int difference = evenAverage - oddAverage;

       System.out.println("Difference between average of all even digits except divisible by 4 and avearge of all odd digits except divisble by 3 of any 4 digit number "+difference);



    }
    
}
