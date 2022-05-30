public class Question28 {
    public static void main(String[] args) {
        String sayi="25";
        char[]arr=sayi.toCharArray();
        int sum=0;


        for (int x= arr.length-1,y=0;x>=0;x--,y++)
        {
            sum+=Character.getNumericValue(arr[x])*(Math.pow(16,y));
        }

        System.out.println((int) sum);

    }
}


    /*Write a Java program to convert a hexadecimal to a decimal number. Go to the editor
        Input Data:
        Input a hexadecimal number: 25
        Expected Output

        Equivalent decimal number is: 37*/