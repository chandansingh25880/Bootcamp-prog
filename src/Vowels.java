import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        System.out.println("Please enter any words :");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
            System.out.println("it is vowel");
        }
        else
        {
            System.out.println("it is constant");
        }

    }
}
