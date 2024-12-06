package oops;

public class play {
  public static void main(String[] args) {
    System.out.println("This is the main function in the public class running:");

    Info person1 = new Info("Vimal",34,25000);
    Info person2 = new Info("Virat", 36, 5000000);

    Info otherp = new Info(person1);
    

    System.out.println("name of the person is " + person1.name);
    System.out.println("age of the person is " + person1.age);
    System.out.println("income of the person is " + person1.income);
    System.out.println("___________________________________");
    System.out.println("name of the person is " + person2.name);
    System.out.println("age of the person is " + person2.age);
    System.out.println("income of the person is " + person2.income);
    System.out.println("___________________________________");
    System.out.println("name of the person is " + otherp.name);
    System.out.println("age of the person is " + otherp.age);
    System.out.println("income of the person is " + otherp.income);
  }

}

class Info{
  public String name;
  public int age;
  public int income;

  // parameterised constructor
  Info (String name, int age, int income){
    this.name = name;
    this.age = age;
    this.income = income;
  }

  // constructor that takes another object as an argument
  Info (Info somone){
    this.name = somone.name;
    this.age = somone.age;
    this.income = somone.income;
  }
}
