package StringProblems;

public class DuplicateCharsInAString {

    public static void main(String[] args) {

        String str1 = "This is an example";
        int count;
        char str2[] = str1.toCharArray();
        System.out.println("Duplicate characters in a given string : ");
        for(int i=0; i<str2.length; i++) {
            count = 1;
            for (int j = i + 1; j < str2.length; j++) {
                if (str2[i] == str2[j] && str2[i] != ' ') {
                    count++;
                }
            }

            if (count > 1 && str2[i] != '0') {
                System.out.println(str2[i]);
            }
        }
    }
}
