class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length()!=t.length())
      return false;
      //coverting the string to array
      char[] str1=s.toCharArray();
      char[] str2=t.toCharArray();
      //sorting the array
      Arrays.sort(str1);
      Arrays.sort(str2);
      //seeing equal or not
      return Arrays.equals(str1,str2);
    }
}
