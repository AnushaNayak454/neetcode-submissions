class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxFreq = 0;
        int result = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(ch));

            int windowLength = right - left + 1;

            int replacements = windowLength - maxFreq;

            while (replacements > k) {

                char leftChar = s.charAt(left);

                map.put(leftChar, map.get(leftChar) - 1);

                left++;

                windowLength = right - left + 1;
                replacements = windowLength - maxFreq;
            }

            result = Math.max(result, windowLength);
        }

        return result;
    }
}