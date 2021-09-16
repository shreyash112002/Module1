import java.util.Scanner;
public class Rollper {
    public static void main(String[] args) {
        int rollno;
        double per;
        Scanner sc;
        sc=new Scanner(System.in);

        System.out.println("Enter your rollno");
        rollno=sc.nextInt();
        System.out.println("Enter your percentage");
        per=sc.nextDouble();
        System.out.println("your rollno is "+rollno);
        System.out.println("Your percentage is"+per);
    }
}
