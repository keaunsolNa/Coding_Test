class Solution {
    public List<String> cellsInRange(String s) {

        String[] corners = s.split(":");
        String first = corners[0];
        String last = corners[1];

        char firstColumn = first.charAt(0);
        char lastColumn = last.charAt(0);

        // 제약상 행 번호는 '1'~'9' 한 자리다.
        int firstRow = first.charAt(1) - '0';
        int lastRow = last.charAt(1) - '0';

        List<String> cells = new ArrayList<>();

        for (char column = firstColumn; column <= lastColumn; column++) {

            for (int row = firstRow; row <= lastRow; row++) {

                cells.add(String.valueOf(column) + row);
            }
        }

        return cells;
    }
}
