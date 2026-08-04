class Solution {
    public int longestConsecutive(int[] nums) {
HashSet<Integer>set=new HashSet<>();
for(int v:nums)
{
    set.add(v);
}        
int maxLength=0;
for(int v:set)
{
    if(!set.contains(v-1))
    {
        int current=v;
        int length=1;
    while(set.contains(current+1))
    {
        current=current+1;
        length++;
    }
    maxLength=Math.max(maxLength,length);

    }

}
return maxLength;
    }
}
