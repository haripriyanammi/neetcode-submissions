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
    if(!map.containsKey(c2))
    {
        return false;
    }
   map.put(c2,map.get(c2)-1);


  if(map.get(c2)<0)
  {
    return false;
  }   



}
    
    
    
    return true;
    }
}
