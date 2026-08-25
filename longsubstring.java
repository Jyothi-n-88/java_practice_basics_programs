public class longsubstring {

    public static int longestSubstring(String str, int k) {

        int left = 0;
        int maxLength = 0;

        int freq[] = new int[256];
        int distinct = 0;

        for (int right = 0; right < str.length(); right++) {

            char ch = str.charAt(right);
            if (freq[ch] == 0) {
                distinct++;
            }

            freq[ch]++;

            while (distinct > k) {
                char leftChar = str.charAt(left);

                freq[leftChar]--;

                if (freq[leftChar] == 0) {
                    distinct--;
                }

                left++;
            }

            if (distinct == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String str = "araaci";
        int k = 2;

        System.out.println("Longest length: "
                + longestSubstring(str, k));
    }
}