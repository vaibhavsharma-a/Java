import java.util.Scanner;

public class conditional {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // char ch = in.next().trim().charAt(0);

    // if (ch >= 'a' && ch <= 'z'){
    //   System.out.println("Charater is lowercase");
    // } else {
    //   System.out.println("charater is uppercase");
    // }

    //?fibo
    // int n = in.nextInt();
    // int a = 0;
    // int b = 1;
    // int count = 2;

    // while (count <= n){
    //   int temp = b;
    //   b = b + a;
    //   a = temp;
    //   count++;
    // }

    // System.out.println(b);

    //? count the occuance of a number
    // System.out.println("Enter a large number: ");
    // long number = in.nextLong();
    // System.out.println("Enter the number to count the occurance for: ");
    // int ocr = in.nextInt();
    // int count = 0;

    // while (number > 0){ 
    //   int n = (int)(number%10);
    //   if (n == ocr){
    //     count++;
    //   }
    //   number = number/10;
    // }
    
    // System.out.println("Number " + ocr + " has occured " + count + " times");

    //? reverse a number
    System.out.println("Enter any number: ");
    long num = in.nextLong();
    long answer = 0;
    
    while(num > 0) {
      long digit = num%10;
      answer = answer * 10 + digit;

      num = num/10;

    }
    System.out.println("Reverse of the number is: " + answer);


  }
}
