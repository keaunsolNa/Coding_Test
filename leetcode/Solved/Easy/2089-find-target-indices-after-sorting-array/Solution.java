class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        // 정렬 후 target 이 놓일 구간은 "target 보다 작은 값의 개수" 부터 시작한다.
        int smallerCount = 0;
        int targetCount = 0;

        for (int num : nums) {

            if (num < target) {
                smallerCount++;
            } else if (num == target) {
                targetCount++;
            }
        }

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < targetCount; i++) {
            answer.add(smallerCount + i);
        }

        return answer;
    }
}
