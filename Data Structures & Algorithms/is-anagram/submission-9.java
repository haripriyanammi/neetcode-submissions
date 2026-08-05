class Solution {
    public boolean isAnagram(String s, String t) {
if(s.length()!=t.length())
{
    return false;
}
HashMap<Character,Integer> map=new HashMap<>();
for (char c1:s.toCharArray())
{
   map.put(c1,map.getOrDefault(c1,0)+1);
}
for(char c2:t.toCharArray())
{
    
  int val=map.getOrDefault(c2,0)-1;
  if(val<0)
  {
    return false;
  }   
map.put(c2,val);


}
                        return true;
    }
}
