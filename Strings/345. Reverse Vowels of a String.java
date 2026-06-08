// 345. Reverse Vowels of a String

// Given a string s, reverse only all the vowels in the string and return it.
// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

// Example 1:
// Input: s = "IceCreAm"
// Output: "AceCreIm"
// Explanation:
// The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

// Example 2:
// Input: s = "leetcode"
// Output: "leotcede"

// Constraints:
// 1 <= s.length <= 3 * 105
// s consist of printable ASCII characters.

// ***************code****************
class Solution {

    public String reverseVowels(String s) {

        Set<Character> vowels = new HashSet<>();

        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        StringBuilder vowelStr = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (vowels.contains(Character.toUpperCase(c))) {
                vowelStr.append(c);
            }
        }

        vowelStr.reverse();

        char[] result = s.toCharArray();

        int idx = 0;

        for (int i = 0; i < result.length; i++) {
            if (vowels.contains(Character.toUpperCase(result[i]))) {
                result[i] = vowelStr.charAt(idx++);
            }
        }

        return new String(result);
    }
}
