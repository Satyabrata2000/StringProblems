package StringProblems;

import java.util.Locale;

public class CountVowelConsonant {

    public static void main(String[] args) {

        int vCount=0, cCount=0;
        String str = "There are twelve months in a year";
        str = str.toLowerCase(Locale.ROOT);
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)== 'a' || str.charAt(i)== 'e' || str.charAt(i)== 'i' || str.charAt(i)== 'o' ||str.charAt(i)== 'u'){
                vCount++;
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                cCount++;
            }
        }
        System.out.println("Total no of vowels is " + vCount);
        System.out.println("Total no of consonants is " + cCount);
    }
}
