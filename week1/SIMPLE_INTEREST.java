import java.util.Scanner;
public class SIMPLE_INTEREST

{
 public static void main(String[] args) throws Exception 
 {
  Scanner input = new Scanner(System.in);
  System.out.print("enter the principal value = ");
  int principal = input.nextInt();
  System.out.print("enter the Annual interest = ");
  int annualint = input.nextInt();
  System.out.print("enter the time = ");
  int time = input.nextInt();
  double simInt = principal * annualint * time /100 ;
  System.out.println("simple interest = " + simInt );
  double Finalamt = principal + simInt;
  System.out.println("final amout  = "+ Finalamt);
 }
}
