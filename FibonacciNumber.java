import java.util.HashMap;

class Solution {

    // Creating hashMap to store previously calc values
    HashMap<Integer, Integer> cache = new HashMap<>();
    
    public int fib(int n) {
        
        // Check first in predef cache
        if( cache.containsKey(n) ) return cache.get(n);
        
        // Hardcode for 0
        if (n == 0) return 0;
        // Hardcode for 1
        if (n== 1) return 1;
        
        // Init returning variable
        int sum = 0;
        sum = fib (n-1)+ fib (n-2);
        // If this particular sum was absent in cache hashMap then add to w/ sum value
        cache.putIfAbsent(n, sum);
        return sum;
        
    }
}