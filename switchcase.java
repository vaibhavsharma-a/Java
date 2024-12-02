
import java.util.Scanner;

public class switchcase {
  public static void main(String[] args) {
    Scanner get = new Scanner(System.in);
    String Player = get.next();
    int year = get.nextInt();

    switch (Player) {
        case "Virat" -> {
          System.out.println("The GOAT of ODI");
          switch (year) {
              case 2008 -> System.out.println("Debut year");
              case 2011 -> System.out.println("Won the odi world cup at 22");
              case 2013 -> System.out.println("won the champions trophy");
              case 2014 -> System.out.println("Became india's Test captain");
          }
        } 
        case "Rohit" -> System.out.println("The 200 hundred machine");
        case "Dhoni" -> {
          System.out.println("Captain cool");
          switch (year){
            case 2007 -> System.out.println("Won the T20 world cup as a captain");
            case 2011 -> System.out.println("Won the ODI world cup as a captain");
            case 2013 -> System.out.println("Won the Champions trophy as a captain");
          }
        }
        case "ABD" -> System.out.println("Alien playing cricket");
        default -> System.out.println("Enter a valid player"); 
    }

  }
}
