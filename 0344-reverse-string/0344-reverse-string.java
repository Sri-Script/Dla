class Solution {
    public void reverseString(char[] s) {
      //two pointer
      int start=0, end=s.length-1; [0 to n-1th index]
      while(start<end)
      {
        char temp= s[start];
        s[start]=s[end];
        s[end]= temp;
        start++;
        end--;
      }  
    }
}
