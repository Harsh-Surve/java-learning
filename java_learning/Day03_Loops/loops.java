package java_learning.Day03_Loops;
import java.util.*;
public class loops {
    public static void main(String[] args) {
        // for loop
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.print(" Total number of natural number needed : ");
      n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(+i +" ");
        }
        System.out.println("This are the Natural numbers using for loop from 1 to "+n);
    
        // while loop
        int i=1;                
        while(i<=n){
            System.out.println(+i +" ");
            i++;
        }
        System.out.println("This are the Natural numbers using while loop from 1 to "+n);        
        // do while loop
        i=1;        
        do{
            System.out.println(+i +" ");
            i++;    
        }while(i<=n);
        System.out.println("This are the Natural numbers using do-while loop from 1 to "+n);    
    }
    
}