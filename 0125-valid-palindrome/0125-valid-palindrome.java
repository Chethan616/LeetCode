class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int end = s.length() - 1;
        int start = 0;
        boolean palin = false;
        while(start < end){
            if (s.charAt(start) != s.charAt(end)) {
                return false; 
            }
            start++;
            end--;
        }
        return true;
    }
}