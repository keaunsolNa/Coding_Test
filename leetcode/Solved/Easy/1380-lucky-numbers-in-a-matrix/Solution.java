class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        
        int max = 0;
        List<Integer> list = new ArrayList();

        for (int[] arr : matrix) {

            Arrays.sort(arr);
            int min = arr[0];

            if (max < min) {

                max = min;
                list.clear();
                list.add(max);
            }
            else if (max == min) list.add(max);
        }

        return list;
    }
}