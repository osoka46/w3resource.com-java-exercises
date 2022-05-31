package BasicExercisesPart_I.Question_71;

public class Text {
    private String text1;
    private String text2;

    public Text(String text1, String text2) {
        this.text1 = text1;
        this.text2 = text2;
    }

    public boolean checkLength() {
        if (this.text1.isEmpty() || this.text2.isEmpty()) {
            return false;
        }
        return true;
    }

    public String[] subString() {
        String[] arr = {text1.substring(1), text2.substring(1)};
        return arr;
    }

    public void concanateText(String[] arr) {
        for (String elements : arr) {
            System.out.print(elements);
        }
    }

    public void run() {
        if (checkLength()) {
            concanateText(subString());
        } else {
            System.out.println("text can not be less than 1");
        }

    }
}
