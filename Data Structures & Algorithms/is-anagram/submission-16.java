class Solution {
    public boolean isAnagram(String s, String t) {
      int[] Freq=new int[26];
      for(char c:s.toCharArray())
      {
        Freq[c-'a']++;
      }
      for(char c:t.toCharArray())

      {
         Freq[c-'a']--;   
      }
    for(int count:Freq)
    {
        if(count!=0)
        {
            return false;
        }
    }
    return true;
    }
}
