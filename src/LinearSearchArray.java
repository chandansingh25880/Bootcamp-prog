
public class LinearSearchArray {
    public static void main(String[] args) {
        int a[] = {2, 4, 6, 8, 10};
        int item = 4;
        int temp = 0;
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























