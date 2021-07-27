import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        System.out.println("please enter any Year!!!!!!");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year%400==0) || (year%4==0) && (year%100 !=0)) {
            System.out.println("leapYear");
        }
            else
            {
                System.out.println("not leapYear");
            }
        }
    }
