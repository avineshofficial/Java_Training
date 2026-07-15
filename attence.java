import java.util.Scanner;
public class attence {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int students = 10;
        int count = 1;
        int totalpresent = 0;
        int totalabsent = 0;

        for(int i = 0; i < students; i++ )
        {
            System.out.print("\nEnter student attence :" + count);
            int attence = sc.nextInt();

            if(attence == 1){
                totalpresent+=1;
            }
            else if(attence==0){
                totalabsent+=1;
            }
            else{
                System.out.print("Invalid number '1' or '0'");
                i--;
                count--;
            }
            count+=1;
        }
        System.out.println("Total Present Students :" + totalpresent);
        System.out.println("Total Present Students :" + totalabsent);
    }
}