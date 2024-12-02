
import java.util.Scanner;

public class calculation {
  public static void main(String[] args) {
    while (true){
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the Operator you want to use or X to end! ");
      char ch = in.next().trim().charAt(0);
      if (ch == '+' || ch == '-' || ch == '/' || ch == '*' || ch == '%'){
        System.out.println("Enter first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter Second number: ");
        int num2 = in.nextInt();
        if (ch == '+'){
          int result = num1 + num2;
          System.out.println("Sum is:" + result);
        }
        if (ch == '-'){
          int result = num1-num2;
          System.out.println("Subtraction is:" + result);
        }
        if (ch == '*'){
          long result = num1 * num2;
          System.out.println("Multiplication is: " + result);
        }
        if (ch == '/'){
          float result = num1 / num2;
          System.out.println("Division is: " + result);
        }
        if (ch == '%'){
          int result = num1 % num2;
          System.out.println("Modulo is: " + result);
        }
      } else if (ch == 'x' || ch == 'X'){
        System.out.println("X is detected, getting out of the functions");
        break;
      } else {
        System.out.println("Invalid operation");
      }

    }
  }
}
