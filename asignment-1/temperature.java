public class temperature {
    public static void main(String args[]){
        //float celcius = 30;
        float celcius = Integer.parseInt((args[0]));
        float fahrenheit = (9/5*celcius)+32;
        System.out.println(celcius+"degree celcius is = "+fahrenheit+"fahrenheit");
    }
}
