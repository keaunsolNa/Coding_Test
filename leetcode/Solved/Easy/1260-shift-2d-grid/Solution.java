class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        int x = grid.length;
        int y = grid[0].length;
        int idx = 0;
        int[] arr = new int[x * y];
        int length = arr.length;

        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {
                arr[idx++] = grid[i][j];
            }
        }

        int[] movedArr = new int[length];

        for (int i = 0; i < length; i++) {

            int tempIndex = (i - k) % length;
            if (tempIndex < 0) tempIndex = length + tempIndex;

            System.out.println(tempIndex);
            movedArr[i] = arr[tempIndex];
        }

        List<List<Integer>> list = new ArrayList<>();
        int xL = 0;

        for (int i = 0; i < x; i++) {


            List<Integer> innerList = new ArrayList<>();
            for (int j = 0; j < y; j++) {

                innerList.add(movedArr[xL + j]);
            }

            xL += x;

            list.add(innerList);
        }

        return list;
    }
}