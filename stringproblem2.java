public class stringproblem2 {
    public static String compressString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder compressed = new StringBuilder();
        int count =0;

        for (int i = 0; i < str.length(); i++) {
            count = 1;
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i));
                compressed.append(count);
            
            }
        }

        String result = compressed.toString();
        return result.length() < str.length() ? result : str;
    }

    public static void main(String[] args) {
        String input1 = "aabcccccaaa";
        String input2 = "abcd";

        System.out.println("Compressed input1: " + compressString(input1)); 
        System.out.println("Compressed input2: " + compressString(input2));
    }
}
