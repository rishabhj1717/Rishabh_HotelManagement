public class NumberToWords {
    /*
     * This class is only to convert numerical to worded values.
    */
    private static final String[] DIGIT_NAMES = new String[] {"Zero ", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine "};

    public static String toWords(int numericalDigit){
        String result = "";
        while (numericalDigit != 0) {
            result = DIGIT_NAMES[numericalDigit % 10] + result;
            numericalDigit = numericalDigit / 10;
        }
        return result;
    }

}
