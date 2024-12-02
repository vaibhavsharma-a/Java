import java.util.Scanner;

public class Input {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // int num1 = input.nextInt();
    // int num2 = input.nextInt();

    // int sum = num1 + num2;

    // System.out.println("Sum of the numbers is: " + sum);
    //largest number
    int one = input.nextInt();
    int two = input.nextInt();
    int three = input.nextInt();

    int max  = one;
    if (two > max){
      max = two;
    }
    if (three > max){
      max = three;
    }
    System.out.println("maximum is: " + max);


    // //!type converstion both type should be compatible 
    // int num = (int)(45.4567f);
    // System.out.println(num);

    // //! automatic type prmotion in experssions
    // int a = 257;
    // byte b = (byte)(a); //? as the max value that byte can store is 256 so this performs a modules as 257 % 256 
    // System.out.println(b);

    // byte m = 40;
    // byte n = 30;
    // byte o = 50;
    // int d = m * n / o; //! at this point while performing the multiplication the m * n promoted to the integer as it exceedes the values of the bytes
    // System.out.println(d);

    // // while loop
    // int count = 1;
    // while (count <= 5){
    //   System.out.println(count);
    //   count++;
    // }

    // System.out.println("---------------------------");
    // //for loop
    // for (int cnt = 1; cnt <= 5; cnt++){
    //   System.out.println(cnt);
    // }


  }
}

