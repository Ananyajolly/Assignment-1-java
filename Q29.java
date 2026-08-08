import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ARTHEMATIC CALCULATOR");
        Scanner input = new Scanner(System.in);
        System.out.println("enter no1");
        int no1 = input.nextInt();
        System.out.println("enter no2");
        int no2= input.nextInt();
        System.out.println("sum"+ (no1+no2));
        System.out.println("sub"+ (no1-no2));
        System.out.println("multi"+ (no1*no2));
        System.out.println("divide"+ (no1/no2));
        System.out.println("remainder"+ (no1%no2));
        
    }
}
