class Solution {
    public int search(int[] nums, int target) {
        int idx = -1;
        int l = 0;
        int r = nums.length -1;
        while(l <= r) {
            int i = l + (r - l) / 2;
            if(nums[i] > target) {
                r = i - 1;
            } else if(nums[i] < target) {
                l = i + 1;
            } else {
                idx = i;
                break;
            }
        }
        return idx;
    }
}
