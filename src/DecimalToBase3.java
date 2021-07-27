import java.util.Scanner;

public class DecimalToBase3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter any num what ever you want to do !!!");
        int n = sc.nextInt();
        int rem, i = 0, total = 0;
        while (n != 0)  {
            rem = n % 10;
            n = n / 10;
            total = (int) (total + (rem * Math.pow(3, i)));
            i++;
        }
        System.out.println(total);
    }
}
