public class question32 
{ 
 public static void main(String args[]) throws Exception
 {
  Scanner input = new Scanner(System.in);
  System.out.println("enter a positive 3 digit number");
  int no = input.nextInt();
  int hundreds = no/100;
  int Tens = (no/10) % 10;
  int Units = no % 10;
  System.out.println("hundred = "+ hundreds);
  System.out.println("tens = "+ Tens);
  System.out.println("units = "+ Units);
 }
}