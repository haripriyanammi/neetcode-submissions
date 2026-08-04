class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length()!=t.length())
      return false;
      //coverting the string to array
      char[] sArray=s.toCharArray();
      char[] tArray=t.toCharArray();
      //sorting the array
      Arrays.sort(sArray);
      Arrays.sort(tArray);
      //seeing equal or not
      return Arrays.equals(sArray,tArray);
    }
}
