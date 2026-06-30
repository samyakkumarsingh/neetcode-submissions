class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int flag=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
            flag++;
        }

        if(flag==0)
        return false;
        else return true;
    }
}