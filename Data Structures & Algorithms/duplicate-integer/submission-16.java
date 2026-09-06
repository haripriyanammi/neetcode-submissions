class Solution {
    public boolean hasDuplicate(int[] nums) {
      HashSet<Integer>saw=new HashSet<>();
      for(int n:nums)
      {
        if(!saw.add(n))
        {
          return true;
        }
      }  
    return false;
    }
}