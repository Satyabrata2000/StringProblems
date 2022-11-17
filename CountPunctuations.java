package StringProblems;


public class CountPunctuations {

    public static void main(String[] args) {

        int count = 0;
        String str = "This may be 5th day of the week, but not sure, may be!";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' || str.charAt(i) == '?' || str.charAt(i) == '-') {
                count++;
            }
        }
        System.out.println("The total no of punctuations in the string is " + count);
    }
}
