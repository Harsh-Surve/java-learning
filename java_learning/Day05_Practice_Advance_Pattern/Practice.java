package java_learning.Day05_Practice_Advance_Pattern;

public class Practice {

    public static void main(String[] args) {

        // Butterfly pattern
        // int n = 5;
        // Upper half
        // for (int i = 1; i <= n; i++) {
        // First part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // Spaces
        // int spaces = 2 * (n - i);
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }
        // Second part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Lower half
        // for (int i = n; i >= 1; i--) {
        // First part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // Spaces
        // int spaces = 2 * (n - i);
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }
        // Second part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Solid Rhombus pattern
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // Spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // Stars
        // for (int j = 1; j <= n; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Number pyramid pattern
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // Spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // Numbers -> print row no,row no times
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // Palindromic pattern
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // Spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // 1st half numbers
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j);
        // }
        // 2nd half numbers
        // for (int j = 2; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();

        //diamond pattern
        // int n = 5;
        // Upper half
        // for (int i = 1; i <= n; i++) {
        // Spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // Stars
        // for (int j = 1; j <= 2 * i - 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // Lower half
        // for (int i = n - 1; i >= 1; i--) {
        // Spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // Stars
        // for (int j = 1; j <= 2 * i - 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        
    }

}
