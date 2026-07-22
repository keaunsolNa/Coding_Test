class Solution {
    public int[] findErrorNums(int[] nums) {

        Arrays.sort(nums);

        int min = 1;
        int max = nums[nums.length - 1];
        int[] arr = new int[max + 1];

        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }       

        int[] ans = new int[2];
        for (int i = 1; i < arr.length; i++) {
            
            if (arr[i] == 2) ans[0] = i;
            if (arr[i] == 0) ans[1] = i;
        }

        if (ans[1] == 0) ans[1] = max + 1;
        return ans;
    }
}