class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // min 을 0 으로 당겨 [min, max] 구간 크기만큼만 할당한다.
        boolean[] present = new boolean[max - min + 1];

        for (int num : nums) {
            present[num - min] = true;
        }

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < present.length; i++) {

            if (!present[i]) {
                answer.add(i + min);
            }
        }

        return answer;
    }
}
