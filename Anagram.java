package StringProblems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "String1";
        String str2 = "Str1ing";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length()!= str2.length()){
            System.out.println("Both the strings are not anagram at first place");
        } else {
            char[] str3 = str1.toCharArray();
            char[] str4 = str2.toCharArray();

            Arrays.sort(str3);
            Arrays.sort(str4);

            if(Arrays.equals(str3, str4)==true){
                System.out.println("Both strings are anagram");
            } else {
                System.out.println("Both strings are not anagram");
            }
        }
    }
}
