class Solution {
    public int maxArea(int[] num) {
        int i=0;
        int j=num.length-1;
        int width=0;
        int max=0;

        while(i<j){
            width=j-i;
            int height=Math.min(num[i],num[j]);

            int area=width*height;
            max=Math.max(max,area);

            if(num[i]<num[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}
