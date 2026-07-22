class Solution {
    public int[] findErrorNums(int[] nums) {

        Arrays.sort(nums);

        int min = 1;
        int max = nums[nums.length - 1];
        int[] arr = new int[max + 1];

        System.out.println(min + "   " + max);

        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }       

        int[] ans = new int[2];
        for (int i = 1; i < arr.length; i++) {
            
            System.out.print(arr[i] + " ");
            if (arr[i] == 0) ans[1] = i;
            if (arr[i] == 2) ans[0] = i;
        }

        System.out.println();
                System.out.println(arr[0] + "  " + arr[1]);
        if (arr[0] == 0) arr[1] = max + 1;

        return ans;
    }
}