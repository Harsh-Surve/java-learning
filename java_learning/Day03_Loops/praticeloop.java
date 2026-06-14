package java_learning.Day03_Loops;

public class praticeloop {
    public static void main(String[] args){
        int n=2;
        int i;
        System.out.println("Multiplication table of "+n);
        
        for(i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+n*i);
        }
        System.out.println("This is the multiplication table of "+n+" using for loop");
        
        int j=1;
        while(j<=10){
            System.out.println(n+"x"+j+"="+n*j);
            j++;
        }
        System.out.println("This is the multiplication table of "+n+" using while loop");
        
        int k=1;
        do{
            System.out.println(n+"x"+k+"="+n*k);
            k++;
        }
        while(k<=10);
        System.out.println("This is the multiplication table of "+n+" using do-while loop");

    }
}
