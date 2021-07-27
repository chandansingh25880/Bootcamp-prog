import java.util.Scanner;

public class FindDiscount {
    public static void main(String[] args) {
        System.out.println("please enter amount!!!!");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        // Calculating only 10% discount if price >1500;
        int c  = p-(p*10/100);
        if(p>1500)
            System.out.println("Discount available in this product you have to pay only  " +c);
        else
            System.out.println("No Discount Available!!!");

    }
}
