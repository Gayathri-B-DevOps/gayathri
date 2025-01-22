import java.util.Scanner;
public class ave {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        int s3 = scan.nextInt();
        int s4 = scan.nextInt();
        int s5 = scan.nextInt();
        
        int total_mark = s1+s2+s3+s4+s5;
        int average = total_mark/5;

        if (average<35)
        {
            System.out.println("additional class is required");
            
        }
        else{
            System.out.println(" you are good to go");
        }
        
    }
}
