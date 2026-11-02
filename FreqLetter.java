import java.util.*;

public class FreqLetter {
    public static String mostFrequentPair(String s) {
        String[] words = s.split("\\s+");

        Map<String, Integer> freq = new LinkedHashMap<>();

        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }

            String pair = "" + word.charAt(0)
                             + word.charAt(word.length() - 1);

            freq.put(pair, freq.getOrDefault(pair, 0) + 1);
        }

        String result = "";
        int max = 0;

        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "she is good grid god and ground player plotter";

        System.out.println(mostFrequentPair(s));
    }
}
