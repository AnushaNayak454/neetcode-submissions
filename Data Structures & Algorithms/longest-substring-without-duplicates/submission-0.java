class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int j=0;
        int max=0;

        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(j));
                    j++;
            }
            set.add(s.charAt(i));
            int length=i-j+1;

            max=Math.max(max,length);


        }
        return max;
    }
}
