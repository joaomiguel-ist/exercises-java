import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  // Write your code here
  
  while(true){
      System.out.println("Calculate the sum of digits of an integer:");
      Scanner input = new Scanner (System.in);
      System.out.print("Input first number: ");
      double r = input.nextDouble();
      int sum = 0;
      while (r!=0){
        
        sum += r % 10;
            r /= 10;
      }
      System.out.println("sum: " + sum);
      
      System.out.println();
    }
 }
}
