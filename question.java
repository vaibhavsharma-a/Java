
import java.util.Scanner;

public class question {
  public static void main(String[] args) {
    //todo : find if the number is prime or not
    Scanner number = new Scanner(System.in);
    System.out.println("Enter any number: ");
    int n = number.nextInt();
    boolean answer = isPrime(n);
    System.out.println(answer);
    System.out.println("Enter a new three digit number");
    int num = number.nextInt();
    boolean ans = isArmstrong(num);
    System.out.println(ans);
  }


  static boolean isPrime(int n){
    if (n <= 1){
      return false;
    }
    int c = 2;
    while (c*c <= n){
      if(n%c == 0){
        return false;
      }
      c++;
    }
    return true;
  }

  static boolean isArmstrong(int num){
    int orignal = num;
    int sum = 0;

    while (num > 0){
      int rem = num % 10;
      num = num/10;

      sum += rem*rem*rem;
    }

    return orignal == sum;
  }
}
