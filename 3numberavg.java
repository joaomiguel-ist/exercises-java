import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  // Write your code here
  
  while(true){
      System.out.println("Calculate the average:");
      Scanner input = new Scanner (System.in);
      System.out.print("Input first number: ");
      double r = input.nextDouble();
      System.out.print("Input second number: ");
      double s = input.nextDouble();
      System.out.print("Input third number: ");
      double t = input.nextDouble();
      double sum = r + s + t;
      double average = sum / 3;
      System.out.println("sum: " + sum);
      System.out.println("average: " + average);
      System.out.println();
    }
 }
}
