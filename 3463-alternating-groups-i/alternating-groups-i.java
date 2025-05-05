class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int i=0;
        int j=2;
        int count = 0;
        while(i != colors.length) {
            if(j >= colors.length) {
                j = j%colors.length;
            }
            if(colors[i] == colors[j] && colors[i] != colors[(i+1)%colors.length]) count++;
            i++;
            j++;
        }
        return count;
    }
}