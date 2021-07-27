import java.util.Scanner;

public class Marriage {
    public static void main(String[] args) {
        System.out.println("please enter any number");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        if(no%2==0 && no%3==0)
        {
            System.out.println("Sanju weds Geeta");
        }
        else if(no%2==0) {
            System.out.println("Sanju");
        }
        else if(no%3==0) {
            System.out.println("Geeta");
        }
        else
        {
            System.out.println("Breakup!!!");
        }
    }
}
