
import java.util.Scanner;

public class TwoDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a two digit number");
        int num = sc.nextInt();
        if(num>9 && num<100) {
            int temp = num;
            int sum = 0;
            int product = 1;
            int digit = 0;
            sum = (num%10)+(num/10);
            product = (num%10)*(num/10);

      /*     while (num != 0) {
                digit = num % 10;
                sum = sum + digit;
                product = product * digit;
                num = num / 10;
            }
            */

            if ((sum + product) == temp)
                System.out.println(temp + " is a special two digit number");
            else
                System.out.println(temp + " is not two digit number");
        }
    }
}
