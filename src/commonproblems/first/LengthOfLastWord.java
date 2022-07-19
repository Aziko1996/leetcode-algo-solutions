package commonproblems.first;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        String[] tempArray = s.split(" ");
        return tempArray[tempArray.length - 1].length();
    }

}
