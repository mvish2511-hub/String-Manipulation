public class CharTraversal {
    public static String expandString(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int firstIndex = s.indexOf(ch);

            if (i > 0) {
                result.append("-");
            }

            for (int j = 0; j <= firstIndex; j++) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(expandString("abcaba"));
    }
}
