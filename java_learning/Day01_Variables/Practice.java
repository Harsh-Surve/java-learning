package java_learning.Day01_Variables;
import java.util.Scanner;
public class Practice {
    public static void main(String[]args){
        int age;
        String name;
        double salary;
        char garde;
        float percentage;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your age:");
        age = sc.nextInt();
        System.out.println("Enter your salary:");
        salary = sc.nextDouble();
        System.out.println("Enter your grade:");
        garde = sc.next().charAt(0);
        System.out.println("Enter your percentage:");
        percentage = sc.nextFloat();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + garde);
        System.out.println("Percentage: " + percentage);
    }
}