public class LinearSearchString {
    public static void main(String[] args) {
        String[] arr = {"maggi","chowmin","cheese","butter","milk"};
        String item = "maggi";
        int temp = 0;
        for(int i=0;i< arr.length-1;i++)
        {
            if(arr[i].equals(item))
            {
                System.out.println("item found the index is " +i+ " item name is " +item );
                temp = temp+1;
            }
        }
        if(temp==0)
        {
            System.out.println("item not found in list");
        }
    }
}
