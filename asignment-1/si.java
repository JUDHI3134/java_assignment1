public class si {
    public static void main(String args[]){
        // int principal = 10000;
        // int time = 5;
        // int rate = 10;

        int principal = Integer.parseInt(args[0]);
        int time = Integer.parseInt(args[1]);
        int rate = Integer.parseInt(args[2]);
        int simpleInterest = (principal*rate*time)/100;
        System.out.println("Principal Amount = "+principal+" "+"Rate = "+rate+" "+"Time ="+time);
        System.out.println("Simple Interest is = "+simpleInterest);
    }
}
