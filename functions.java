
import java.util.Arrays;
import java.util.Scanner;

public class functions {
  public static void main(String[] args) {
    String name = "Vaibhav Sharma";
    greet(name);
    String greets = greetString(name);
    System.out.println(greets);

    //get number from the user input
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int a = in.nextInt();
    System.out.println("Enter the second number: ");
    int b = in.nextInt();
    int sum = sum(a,b);
    System.out.println(sum);

    VarArg(12,23,44,23,56,76,24,67,32);
    manymore(12,34,"i am here","to do some magic","lets work harder");
  }

  static void greet(String name){
    System.out.println("Hello " + name);
  }

  static String greetString(String name){
    return "Welcome back " + name;
  }

  static int sum(int a, int b){
    return a + b;
  }
  // multiple arguments passing
  static void VarArg(int ...v){
    System.out.println(Arrays.toString(v));
  }

  static void manymore(int a, int b, String ...s){
    System.out.println(a);
    System.out.println(b);
    System.out.println(Arrays.toString(s));
  }
}
