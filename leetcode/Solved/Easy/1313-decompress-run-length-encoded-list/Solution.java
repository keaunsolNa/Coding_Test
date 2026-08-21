class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i +=2) {

            for (int j = 0; j < nums[i]; j++) list.add(nums[i + 1]);
        }

        int[] ans = list.stream().mapToInt(Integer::intValue).toArray(); 

        return ans;
    }
}