import java.util.Scanner;

class Pattern1 {
    public static void main(String[] args) {
        System.out.println("please enter any number");
        Scanner sc = new Scanner(System.in);
         int no = sc.nextInt();
        for(int i=0;i<no;i++) {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
 }

