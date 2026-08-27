//Time complexity :O(n)
public class patternmatch {

    public static boolean checkSubstring(String s1, String s2) {

        int k = s2.length();

        for (int i = 0; i <= s1.length() - k; i++) {

            String window = s1.substring(i, i + k);

            if (window.equals(s2)) {
                System.out.println("Pattern found at index: " + i + " "+ (i+1) +" "+ (i+2));
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String s1 = "helloworld";
        String s2 = "low";

        System.out.println(checkSubstring(s1, s2));
    }
}


// without using substring Time complexity(O(n*k))-->outer loop :O(n-k)  &  inner loop :O(k) -->time complexity :O((n-k)*(k)) --> O((nk)-(k^2)) --O(nk) {because O(nk)>O(k^2)}
// public class patternmatch {

//     public static boolean checkSubstring(String s1, String s2) {

//         int k = s2.length();

//         for (int i = 0; i <= s1.length() - k; i++) {

//             int j;

//             for (j = 0; j < k; j++) {

//                 if (s1.charAt(i + j) != s2.charAt(j)) {
//                     break;
//                 }
//             }

//             if (j == k) {
//                 System.out.println("Pattern found at index: " + i);
//                 return true;
//             }
//         }

//         return false;
//     }

//     public static void main(String[] args) {

//         String s1 = "helloworld";
//         String s2 = "low";

//         System.out.println(checkSubstring(s1, s2));
//     }
// }