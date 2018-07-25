import java.util.Scanner;

public class Main {
  public static void main(String[] args) 
  {
    while(true){
      System.out.println("Choose one: (C)ircle , (S)phere or Cylinde(R)");
      Scanner choice = new Scanner (System.in);
      char s = choice.next().charAt(0);
      if(s=='c'){
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
      if(s=='s'){      
        System.out.println("Calculate the area and volume of a sphere: ");
        Scanner input = new Scanner (System.in);
        System.out.print("Input the radius: ");
        double r = input.nextDouble();
        double area = Math.PI * r * r * 4;
        double volume = 4 * Math.PI * r * r * r / 3;
        System.out.println("area: " + area);
        System.out.println("volume: " + volume);
        System.out.println();
      }
      if(s=='r'){
        System.out.println("Calculate the area and volume of a cylinder: ");
        Scanner input = new Scanner (System.in);
        System.out.print("Input the radius: ");
        double r = input.nextDouble();
        System.out.print("Input the height: ");
        double h = input.nextDouble();
        double basearea = Math.PI * r * r * 2;
        double lateralarea = 2 * Math.PI * r * h;
        double area = basearea + lateralarea;
        double volume = Math.PI * r * r * h;
        System.out.println("base area: " + basearea);
        System.out.println("lateral area: " + lateralarea);
        System.out.println("total area: " + area);
        System.out.println("volume: " + volume);
        System.out.println();
      }
    }
  }
}
