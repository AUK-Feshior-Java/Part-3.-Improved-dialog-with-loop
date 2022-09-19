import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userStr;
        char userAns='Y';

        while (userAns=='Y' || userAns=='y'){
            System.out.print("Enter any string: ");
            userStr = sc.nextLine();
            for(int x =userStr.length()-1;x>=0;x--){
                System.out.print(userStr.charAt(x));
            }
            System.out.println();

            System.out.println("Do you want to continue Y/N");


            userStr = sc.nextLine();
            if(userStr.length()>0)
                userAns = userStr.charAt(0);
            else
                userAns='N';

        }
    }
}