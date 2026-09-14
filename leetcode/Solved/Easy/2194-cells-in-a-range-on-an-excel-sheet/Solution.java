class Solution {
    public List<String> cellsInRange(String s) {
        
        String one = s.split(":")[0];
        String two = s.split(":")[1];

        char oneC = one.charAt(0);
        char twoC = two.charAt(0);

        int oneNum = (int) (one.charAt(1) - '0');
        int twoNum = (int) (two.charAt(1) - '0');

        List<String> list = new ArrayList<>();

        for (char c = oneC; c <= twoC; c++) {

            for (int i = oneNum; i <= twoNum; i++) {

                list.add(c + "" + i);
            }
        }

        return list;
    }
}