class Solution {
    public void reverseString(char[] s) {
        changer(s, 0, s.length-1);
    }
    public void changer(char[] str, int left, int right){
        if( left >= right) return;     
        char temp = str[left];
        str[left++] = str[right];
        str[right--] = temp;
        changer(str, left, right);
    }
}