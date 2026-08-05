class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length())
    {
        return false;
    }
    int[] indexValue=new int[30];
    for(char c:s.toCharArray())
    {
        indexValue[c-'a']++;
    }
    for(char c:t.toCharArray())
    {
        indexValue[c-'a']--;
    }
    for(int num:indexValue)
    {
        if(num<0)
        return false;
    }
return true;
    }
}
