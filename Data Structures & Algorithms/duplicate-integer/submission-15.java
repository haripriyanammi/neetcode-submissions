class Solution {
    public boolean hasDuplicate(int[] nums) {
      HashSet<Integer>saw=new HashSet<>();
      for(int num:nums)
      {
        if(!saw.add(num))
        {
          return true;
        }
      }  
    return false;
    }
}