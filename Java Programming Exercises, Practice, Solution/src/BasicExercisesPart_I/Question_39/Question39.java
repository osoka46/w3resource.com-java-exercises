package BasicExercisesPart_I.Question_39;

public class Question39 {
    public static void main(String[] args) {
        firstLoop:
        for (int x = 1; x <= 9; x++) {
            secondLoop:
            for (int y = 0; y <= 9; y++) {
                thirdLoop:
                for (int z = 0; z <= 9; z++) {

                    if (x != y && x != z && y != z) {
                        System.out.println(x+""+y+""+z);
                    }
                }

            }
        }
    }
}

   /* Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there. Go to the editor
        Expected Output

        123
        124
        ...

        431
        432
        Total number of the three-digit-number is 24*/