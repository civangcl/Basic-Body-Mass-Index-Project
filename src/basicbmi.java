import java.util.Scanner;

public class basicbmi {
   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.println("What's you'r weight ? : ");
       int weight = scanner.nextInt();

       System.out.println("What's you'r height ? example ; 1.74 m : ");
       double height = scanner.nextDouble() ;

       double bmi = weight / (height * height);
       System.out.println("That's you'r BMI = " + bmi);


    }
}