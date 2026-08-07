class Solution {
    public boolean isPalindrome(String s) {
     s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
     String rev="";
     for(char c:s.toCharArray())
     {
        rev=c+rev;
     }
    return s.equals(rev);
    }
}
