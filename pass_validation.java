import java.util.Scanner;

public class pass_validation {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String pass = "klu@123";
        int attempt = 3;
        int a = 0;
        while(a <=3)
        {
            String check = sc.next();
            if(check.equals(pass))
            {
                System.out.println("Login Succesfully...");
                return;
            }
            else if(attempt == 0)
            {
                System.out.println("Maximum Login limit reached try again later...");
                return;
            }
            else if(!check.equals(pass))
            {
                System.out.println("Attempt Remaining : " + attempt);
                attempt-=1;
            }
            a++;
        }
        sc.close();
    }
}
