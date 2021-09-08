public class Calculator {

    public static void main(String[] args){

        // variables

        int number1 = 2;
        double number2 = 101;
        String word = "cyalaekg";

        // print

        System.out.println("number1: " + number1 + "; number2: " + number2 + "; word: " + word);
        System.out.println("calculateAdd: " + calculateAdd(number1, number2));
        System.out.println("calculateSub: " + calculateSub(number1, number2));
        System.out.println("calculateMul: " + calculateMul(number1, number2));
        System.out.println("calculateDiv: " + calculateDiv(number1, number2));
        System.out.println("checkSomeNumberGreaterThan100: " + checkSomeNumberGreaterThan100(number1, number2));
        System.out.println("checkWordContainsFancy: " + checkWordContainsFancy(word));
        System.out.println("checkLengthWordGreaterThan20Chars: " + checkLengthWordGreaterThan20Chars(word));

    }

    // methods

    public static double calculateAdd(int val1, double val2){

        return val1 - val2;

    }

    public static double calculateSub(int val1, double val2){

        return val1 - val2;

    }

    public static double calculateMul(int val1, double val2){

        return val1 * val2;

    }

    public static double calculateDiv(int val1, double val2){

        return val1 / val2;

    }

    public static boolean checkSomeNumberGreaterThan100(int val1, double val2){

        return (val1 > 100 || val2 > 100);

    }

    public static boolean checkWordContainsFancy(String word1){

        return word1.contains("fancy");

    }

    public static boolean checkLengthWordGreaterThan20Chars(String word1){

        return (word1.length() > 20);

    }

}
