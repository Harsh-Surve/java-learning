package java_learning.Day01_Variables;
import java.util.Scanner;
public class Practice2 {
public static void main(String[] args) {

        String name;
        int age;
        double salary;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        System.out.print("Enter your salary: ");
        salary = sc.nextDouble();

        System.out.println("Hello " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your salary is " + salary + " per month.");

        sc.close();
    }
}