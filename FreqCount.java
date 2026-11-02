public class FreqCount {
    public static int stringTransformation(String S1, String S2) {
        int[] freq = new int[26];

        for (int i = 0; i < S1.length(); i++) {
            freq[S1.charAt(i) - 'A']++;
        }

        int cost = 0;

        for (int i = 0; i < S2.length(); i++) {
            char ch = S2.charAt(i);
            int index = ch - 'A';

            if (freq[index] > 0) {
                freq[index]--;
            } else {
                cost++;
            }
        }

        return cost;
    }

    public static void main(String[] args) {
        System.out.println(
            stringTransformation("ABD", "AABCCAD")
        );

        System.out.println(
            stringTransformation("ABC", "XYZ")
        );
    }
}
