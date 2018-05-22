import java.util.Scanner;

public class Main {
  public static void main(String[] args) 
  {
    while(true){
      Scanner input = new Scanner (System.in);
      System.out.print("Input the first number: ");
      Float a = input.nextFloat();
      System.out.print("Input the second number: ");
      Float b = input.nextFloat();
      
      System.out.println();
      for(int j=1; j<= a; j++){
        for(int i=1; i<= b; i++){
          int mult = j * i;
          System.out.println(j + "x" + i + "=" + mult);
        }
      System.out.println();
      }
    }
  }
}
