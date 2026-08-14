class Solution {
    public int triangularSum(int[] nums) {

        if (nums.length == 1) return nums[0];

        if (nums.length == 2) return nums[0] + nums[1];
        

        for (int i = 0; i <= nums.length; i++) {

            int[] arr = new int[nums.length - 1];

            for (int j = 0; j < arr.length; j++) {
                arr[j] = (nums[j] + nums[j + 1]) % 10;
                System.out.print(arr[j] + " ");
            }
            
            System.out.println();

            nums = arr;


        }       

        return nums[0];
    }
}