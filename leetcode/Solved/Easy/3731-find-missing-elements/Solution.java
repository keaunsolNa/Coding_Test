class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        // boolean 배열은 false 로 자동 초기화되므로 별도 초기화 루프가 필요 없다.
        boolean[] seen = new boolean[max + 1];

        for (int num : nums) {
            seen[num] = true;
        }

        for (int num : nums) {
            present[num - min] = true;
        }

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < present.length; i++) {

            if (!seen[i]) {
                list.add(i);
            }
        }

        return answer;
    }
}
