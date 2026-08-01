class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        // If we need to remove all digits, the result is "0"
        if (k == n) {
            return "0";
        }
        
        // Use a character array as a custom stack for optimal performance
        char[] stack = new char[n];
        int top = 0; // Stack pointer
        
        for (int i = 0; i < n; i++) {
            char digit = num.charAt(i);
            
            // Pop digits from the stack if the current digit is smaller
            // and we still have removals (k > 0) left.
            while (top > 0 && stack[top - 1] > digit && k > 0) {
                top--;
                k--;
            }
            
            // Push the current digit onto the stack
            stack[top++] = digit;
        }
        
        // If k > 0, pop the remaining k digits from the end
        top -= k;
        
        // Build the result string while removing leading zeros
        int startIndex = 0;
        while (startIndex < top && stack[startIndex] == '0') {
            startIndex++;
        }
        
        // If all remaining digits were zeros, return "0"
        if (startIndex == top) {
            return "0";
        }
        
        // Construct and return the final string
        return new String(stack, startIndex, top - startIndex);
    }
}