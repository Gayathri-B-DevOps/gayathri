import java.util.Scanner;
 public class ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        // ternary operator syntax
        // datatype variable = condition? "true stmt": "flase stmt";

        String result = (a>b)? "A is greater" :"B is greater";
        System.out.println(result);
       System.out.print(a+"a");
     
    }
}
