class Solution {
    public boolean detectCapitalUse(String word) {
        int capitalCount = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                capitalCount++;
            }
        }

        if (capitalCount == word.length()) {
            return true; // All letters are uppercase
        }

        if (capitalCount == 0) {
            return true; // All letters are lowercase
        }

        if (capitalCount == 1
                && Character.isUpperCase(word.charAt(0))) {
            return true; // Only the first letter is uppercase
        }

        return false;
    }
}