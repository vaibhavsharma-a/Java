import java.util.Scanner;

public class temp {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the Temperature in Celcius: ");
    float tempC = in.nextFloat();

    float tempF = (tempC * 9/5) + 32;
    System.out.println("Temperature in Fahrenheight: " + tempF);
  }
}
