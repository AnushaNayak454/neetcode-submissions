class Solution {
    public boolean isAnagram(String s, String t) {
        char s1[]=s.toCharArray();
        char t1[]=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        if(s1.length!=t1.length){
            return false;
        }
        if(Arrays.equals(s1,t1)){
            return true;
        }
        return false;

    }
}
