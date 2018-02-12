package HackerRank;

public class SubstringComparisons {
    static String smallest = "";
    static String largest = "";


    public static String getSmallestAndLargest(String s, int k) {

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest = "";
        largest = "";

        char[] charString = s.toCharArray();

        for (int i = 0; i < charString.length-k+1; i++) {
            String currentSubstring = getSubstring(charString, i, k);
            setSmallest(currentSubstring);
            setLargest(currentSubstring);
        }

        return smallest + "\n" + largest;
    }

    private static void setLargest(String current) {
        if (largest.isEmpty()) {
            largest = current;
            return ;
        }

        if (current.compareTo(largest) > 0) {
            largest = current;
            return ;
        }
    }

    private static void setSmallest(String current) {
        if (smallest.isEmpty()) {
            smallest = current;
            return ;
        }

        if (current.compareTo(smallest) < 0) {
            smallest = current;
            return ;
        }
    }

    public static String getSubstring(char[] str, int index, int k) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++) {
            sb.append(str[i+index]);
        }

        return sb.toString();
    }


}
