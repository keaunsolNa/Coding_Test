class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        Arrays.sort(nums);
        
        int min = nums[0];
        int max = nums[nums.length - 1];
        boolean[] arr = new boolean[max + 1];

        for (int i = min; i <= max; i++) {
            arr[i] = false;
        }

        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]] = true;
        }       

        List<Integer> list = new ArrayList<>();

        for (int i = min; i <= max; i++) {

            if (!arr[i]) list.add(i);
        }

        return list;
    }
}