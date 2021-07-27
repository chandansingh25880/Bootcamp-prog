public class PrimeNumber2 {

    public static void main(String[] args)
    {
        int i, number = 1, flag, sum = 0;

        while(number <= 100)
        {
            flag = 0;
            i = 2;
            while(i <= number/2 )
            {
                if(number % i == 0)
                {
                   flag++;
                   break;
                }
                i++;
            }
            if(flag == 0 && number != 1 )
            {
                System.out.println( +number);
                sum = sum + number;

            }
            number++ ;
        }
        System.out.println("\n The Sum of Prime Numbers from 1 to 100 = " + sum);
    }
}

