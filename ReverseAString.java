package StringProblems;

public class ReverseAString {

    public static void main(String[] args) {

        String str = "This is an example";
        String revStr = "";

        for(int i = str.length()-1; i>=0; i--){
            revStr = revStr + str.charAt(i);
        }

        System.out.println("Original string is " + str);
        System.out.println("Reversed string is " + revStr);
    }
}
