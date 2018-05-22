import java.util.Scanner;

public class Main {
  public static void main(String[] args) 
  {
    while(true){
      System.out.println("Calculate the area and perimeter of a circle: ");
      Scanner input = new Scanner (System.in);
      System.out.print("Input the radius: ");
      double r = input.nextDouble();
      double area = Math.PI * r * r;
      double perimeter = 2 * Math.PI * r;
      System.out.println("area: " + area);
      System.out.println("perimeter: " + perimeter);
      System.out.println();
    }
  }
}
