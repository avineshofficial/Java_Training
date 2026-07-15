import java.util.Scanner;
public class mark {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 5 subject marks: ");
        int mark1 = 0;
        int mark2 = 0;
        int mark3 = 0;
        int mark4 = 0;
        int mark5 = 0;
        int subjects = sc.nextInt();
        int totalmark = 0;

        if (subjects < 0 && subjects == 5) {
            for(int i=1 ; i<=subjects ; i++)
            {
                System.out.print("Enter the five Subjets Marks:");
                if (i==1) {
                    System.out.print("\nEnter the Mark 1 :");
                    mark1 = sc.nextInt();
                }
                else if(i==2){
                    System.out.print("\nEnter the Mark 2 :");
                    mark2 = sc.nextInt();
                }
                else if(i==3){
                    System.out.print("\nEnter the Mark 3 :");
                    mark3 = sc.nextInt();
                }
                else if(i==4){
                    System.out.print("\nEnter the Mark 4 :");
                    mark4 = sc.nextInt();
                }
                else if(i==5){
                    System.out.print("\nEnter the Mark 5 :");
                    mark5 = sc.nextInt();
                }
            }
            totalmark = (mark1 + mark2 + mark3 + mark4 + mark5);
        }

        else{
            System.out.println("you are total subject is 5 but You are less then 5 subjects\n'You are not elegiable to get totalmark'");
        }

        System.out.print("Your Totalmark is:" + totalmark);

        sc.close();
    }
}

