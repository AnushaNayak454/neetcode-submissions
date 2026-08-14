class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();

        int j = 0;
        int maxFreq = 0;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(ch));

            int windowLength = i - j + 1;

            int replacements = windowLength - maxFreq;

            while (replacements > k) {

                char leftChar = s.charAt(j);

                map.put(leftChar, map.get(leftChar) - 1);

                j++;

                windowLength = i - j + 1;
                replacements = windowLength - maxFreq;
            }

            result = Math.max(result, windowLength);
        }

        return result;
    }
}