import java.util.Scanner;

public class Pract {

    public static void main(String[] args) {
        int item=4;
        int temp =0;

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the array size!!!");
        int size = sc.nextInt();

        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter element of the array  are");
            a[i] = sc.nextInt();

        }
        System.out.println("enter element is");
        for (int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
        for(int i = 0;i<a.length-1;i++) {
            if (a[i] == item) {
                System.out.println("Element is found the index is " + i);
                temp = temp + 1;
            }
        }
        if(temp==0)
        {
            System.out.println("Element not found in the index");
        }
    }
}


