class Solution {
    public int findShortestSubArray(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int maxCnt = 0;
        int target = 0;
        int startIndex = 0;
        int maxIndex = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if (maxCnt < map.get(nums[i])) {

                maxCnt = map.get(nums[i]);
                target = nums[i];

                list.clear();
                list.add(target);
            }

            else if (maxCnt == map.get(nums[i])) {

                list.add(nums[i]);
            }

        }   

        System.out.println(list);
        List<Integer> originalArr = Arrays.stream(nums)
                                  .boxed()
                                  .collect(Collectors.toList());

        int ans = 50001;


        for (int key : list) {
            
            int first = originalArr.indexOf(key);   
            int last = originalArr.lastIndexOf(key);
            ans = Math.min(ans, last - first + 1);
        }

        return ans;

    }
}