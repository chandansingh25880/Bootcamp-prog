import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        System.out.println("please enter any number");
        Scanner sc = new Scanner(System.in);
        int no=sc.nextInt();
        if(no==1)
            System.out.println("January");
        else if(no==2)
            System.out.println("Febuary");
        else if(no==3)
            System.out.println("March");
        else if(no==4)
            System.out.println("April");
        else if(no==5)
            System.out.println("May");
        else if(no==6)
            System.out.println("June");
        else if(no==7)
            System.out.println("July");
        else if(no==8)
            System.out.println("August");
        else if(no==9)
            System.out.println("September");
        else if(no==10)
            System.out.println("October");
        else if(no==11)
            System.out.println("November");
        else if(no==12)
            System.out.println("December");
        else
            System.out.println("please enter valid month number");

    }
}
