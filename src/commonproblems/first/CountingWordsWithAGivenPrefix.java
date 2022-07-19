package commonproblems.first;

public class CountingWordsWithAGivenPrefix {

    // Time complexity: O(n)
    // Space complexity O(1)
    public int prefixCount(String[] words, String pref) {
        int result = 0;
        for (String word : words) if (word.startsWith(pref)) result++;
        return result;
    }

}
