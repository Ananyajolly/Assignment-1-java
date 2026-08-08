import java.util.Scanner;
public class Q30
{
    public static void main(String[] args) throws Exception 
    {
     System.out.println("enter temp in celcius");
     Scanner input = new Scanner(System.in);
     int temp1 = input.nextInt();
     double temp2 = temp1 * (9.0 / 5.0) + 32.0;
     System.out.println("temperature in Fahrenheit " + temp2);
    }

}