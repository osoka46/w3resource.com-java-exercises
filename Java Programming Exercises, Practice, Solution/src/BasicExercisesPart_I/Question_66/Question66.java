public class Question66 {
    public static boolean checkPrimeNumbers(int number)
    {
        if (number==2)
        {
            return true;
        }
        for (int x=2;x<number;x++)
        {
            if (number%x==0)
            {
                return false;
            }
        }
        return true;
    }
    public static int sum()
    {
        int sum=0;
        for (int x=2;x<100;x++)
        {
            if (checkPrimeNumbers(x))
            {
                sum+=x;
            }
        }
        return sum;
    }
    public static void main(String[] args) {

        System.out.println(sum());


    }
}

  /*  Write a Java program to compute the sum of the first 100 prime numbers. Go to the editor
        Sample Output:

        Sum of the first 100 prime numbers: 1060 */
