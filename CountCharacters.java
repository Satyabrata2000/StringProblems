package StringProblems;

public class CountCharacters {

    public static void main(String[] args) {
        String string = "This is 5th day of the week.";
        int count = 0;
        for(int i=0; i< string.length(); i++){
            if(string.charAt(i)!=' ')
                count++;
        }
        System.out.println("Total no of characters in this string is " + count);
    }
}
