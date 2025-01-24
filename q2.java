// getting input 2 input for the user and printing them 
// eg:
// a=5 b=10
// output
// 5 6 7 8 9 10


import java.util.Scanner;
public class q2 {
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter value of A");
    int a = scan.nextInt();
    System.out.println("Enter value of B ");
    int b = scan.nextInt();
    
    for (int i=a;i<=b;i=i+1){
        System.out.println(i);
    }
 }   
}
