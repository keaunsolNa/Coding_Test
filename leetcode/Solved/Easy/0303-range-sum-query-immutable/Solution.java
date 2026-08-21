class NumArray {

    private int[] arr;

    public NumArray(int[] nums) {
        
        int len = nums.length;


        arr = new int[len + 1];

        for (int i = 0; i < len; i++) {
            arr[i + 1] = arr[i] + nums[i];
        }

    }
    
    public int sumRange(int left, int right) {

        return arr[right + 1] - arr[left];

    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */