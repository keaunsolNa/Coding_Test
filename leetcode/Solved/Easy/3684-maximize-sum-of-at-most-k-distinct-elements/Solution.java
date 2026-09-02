class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        
        Set<Integer> set = Arrays.stream(nums)
                         .boxed()
                         .collect(Collectors.toCollection(LinkedHashSet::new));

        List<Integer> list = new ArrayList<>(set);
    
        list.sort(Comparator.reverseOrder());
        
        int size = Math.min(list.size(), k);
        int[] ans = new int[size];

        for (int i = 0; i < size; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}