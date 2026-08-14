class Solution {
    public int triangularSum(int[] nums) {

        if (nums.length == 1) return nums[0];

        if (nums.length == 2) return nums[0] + nums[1];
        
        int[] copyArr = nums;

        for (int i = 0; i < nums.length - 1; i++) {

            int[] arr = new int[copyArr.length - 1];

            for (int j = 0; j < arr.length; j++) {
                arr[j] = (copyArr[j] + copyArr[j + 1]) % 10;
                System.out.print(arr[j] + " ");
            }
            
            System.out.println();

            copyArr = arr;

        }       

        return copyArr[0];
    }
}