
public class PrimeNumber {

    // Function to check it is prime or not
    boolean isPrime(int n)
    {
        int c=0;
        for(int i = 1; i<=n; i++)
        {
            if(n%i==0)
                c++;
        }
        if(c==2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int sum = 0;
        PrimeNumber obj = new PrimeNumber();
        for(int i=0; i<=50; i++)
        {
            if(obj.isPrime(i) == true) {

                System.out.print(" , " + i);

                sum = sum + i;
            }
        }
        System.out.println();
        System.out.println("Sum of first 50 prime no is = " +sum);
    }
}