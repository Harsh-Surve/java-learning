package java_learning.Day02_Conditionals;
import java.util.*;
public class IfElse {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a=sc.nextInt();
        System.out.print("Enter the second number: ");
        b=sc.nextInt();
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }else if(a<b){
            System.out.println(a+" is less than "+b);       
        }
        else{
            System.out.println(a+" is equal to "+b);
        }

    }
}
