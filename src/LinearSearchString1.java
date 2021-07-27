
public class LinearSearchString1 {
    public static void main(String[] args) {
        String a[] = {"butter","milk","cheese","bread","dry cheese"};
        String value = "cheese";
        int temp = 0;
        for(int i = 0; i<a.length; i++) {
            if(a[i]==value) {
                System.out.println("element found index is " +i+ " item name is " +value);
                 temp = temp+1;
            }
        }
        if(temp==0)
        {
            System.out.println("element not found in given index ");
        }
    }
}