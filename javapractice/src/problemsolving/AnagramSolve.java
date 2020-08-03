package problemsolving;

import java.util.*;

public class AnagramSolve {

    public static void main(String[] args) {

        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String str1 = "ARMY";
        String str2 = "MARY";
        boolean isAnagram = checkForAnagram(str1, str2);

        System.out.println("Comparing " + str1 + " to " + str2 + ". Is it an anagram ? " + isAnagram + "!");
    }

    public static boolean checkForAnagram(String a, String b) {

        if (a.length() != b.length()){
            return false;
        }
        else{
            Set<String> check1 = new HashSet<>(Arrays.asList(a.split("")));
            Set<String> check2 = new HashSet<>(Arrays.asList(b.split("")));

            List<String> check3 = new ArrayList<>(check1);
            List<String> check4 = new ArrayList<>(check2);

            Collections.sort(check3);
            Collections.sort(check4);

            return (check3.equals(check4)) ? true : false;
        }
    }

}
