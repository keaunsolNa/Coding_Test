class Solution {
    public int[] singleNumber(int[] nums) {
        
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (list.contains(nums[i])) list.remove(Integer.valueOf(i));
            else list.add(nums[i]);

            System.out.println(list);
        }

        System.out.println(list);

        int[] answer = new int[2];
        // answer[0] = list.get(0);
        // answer[1] = list.get(1);

        return answer;
    }
}