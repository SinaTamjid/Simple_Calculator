
import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    char parameter;
    double Number_1;
    double Number_2;
    double result;
    System.out.println("Choose an operator: +, -, *, or /");
    parameter = input.next().charAt(0);
    System.out.println("Enter First Number");
    Number_1=input.nextDouble();
    System.out.println("Enter Second Number");
    Number_2=input.nextDouble();

    switch(parameter){
      case '+':
      result=Number_1+Number_2;
      System.out.println(result);
      break;
      case '-':
      result=Number_1-Number_2;
      System.out.println(result);

      break;
      case '*':
      result=Number_1*Number_2;
      System.out.println(result);

      case '/':
      result=Number_1/Number_2;
      System.out.println(result);

      default:
      System.out.println("wrong parameter!");
      break;
    }
    input.close();
  }
}
