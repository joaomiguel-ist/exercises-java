import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
      
      System.out.println("Calculate the moving average:");
      
      Scanner input = new Scanner (System.in);
      double sum = 0.0;
      int n = 0;
      double average = 0.0;
      double moving = 0.0;
      
      System.out.print("Input first number: ");
      double r = input.nextDouble();
      sum = sum + r;
      n = n+1;
      average = sum / n;  
      
      System.out.print("Input another number?");
      
      while(input.next().charAt(0)!='n'){
        System.out.println("Input number: ");
        double s = input.nextDouble();
        moving = (s + (n*average))/(n+1);
        n = n+1;
        System.out.println("moving average: " + moving);
        average = moving;
        System.out.print("Input another number?");
      }
      //System.out.println();
  
 }
}
