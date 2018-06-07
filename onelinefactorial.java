import java.io.*;
import java.util.Scanner;

class Main {
  static int factorial(int n)
  {
    // single line to find factorial
    return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
  }
  public static void main(String[] args)
  {
    Scanner input = new Scanner (System.in);
    System.out.print("Input the number to compute factorial: ");
    int num = input.nextInt();
    System.out.println("Factorial of " + num + " is " + factorial(num));
  }
}
