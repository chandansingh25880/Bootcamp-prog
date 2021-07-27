public class factor {

    public static void main(String[] args) {
        int num = 20;
        System.out.println("factors of given number is " +num);
        for(int i = 1; i<=num; ++i) {
            if(num%i ==0) {
                System.out.println(i + " ");
            }

        }
    }
}
