class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1.00000;
        if( n < 0) return myPow(1/x,Math.abs(n));
        if(n == 1) return x;        
        return x * myPow(x,n-1);
    }
}
/**
 * Stack over flow for following input : 291/ 306 cases passes 
 * 0.00001
 * 2147483647
*/