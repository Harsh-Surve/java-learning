package java_learning.Day02_Conditionals;
import java.util.Scanner;
public class If_Elseif_Else {
    public static void main(String[] args) {
        int button;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the button number: ");
        button=sc.nextInt();
        if(button==1){
            System.out.println("Hello");
        }
        else if(button==2){
            System.out.println("Namaste");
        }
        else if(button==3){
            System.out.println("Hola");
        }
        else{
            System.out.println("Invalid button");
        }

    }
}
