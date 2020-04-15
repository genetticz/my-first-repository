package problem_solving;

public class ReverseNumber {

    public static void main(String[] args) {

        int num = 30;

        System.out.println(num + " reversed is " + reverseDigits(30));
    }

    public static String reverseDigits(int a) {

        String b = String.valueOf(a);
        String c = "";

        for(int i = 0; i < b.length(); i++) {

            c+= b.charAt(b.length() - 1 - i);
        }

        return c;
    }
}
