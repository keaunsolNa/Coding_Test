class Solution {
    public int dominantIndex(int[] nums) {
        
        int max = 0;
        int secondMax = 0;
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {

            int target = nums[i];
            System.out.print(target + " ");

            if (max < target) {

                secondMax = max;
                max = target;
                idx = i;
            }
        }

        System.out.println();
        
        System.out.println(max + " " + secondMax + " " + idx);

        if (max >= secondMax * 2) return idx;
        else return -1;

    }
}