class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        
        first.add(1);
        list.add(first);
        
        if (rowIndex == 0) return first;
        
        second.add(1);
        second.add(1);

        list.add(second);

        if (rowIndex == 1) return second;

        for (int i = 2; i < rowIndex; i++) {

            List<Integer> target = new ArrayList<>();
            List<Integer> prev = list.get(i - 1);

            for (int j = 0; j <= prev.size(); j++) {

                if (j == 0) target.add(prev.get(0));
                else if (j == prev.size()) target.add(prev.get(prev.size() - 1));
                else {

                    target.add(prev.get(j - 1) + prev.get(j));
                }
            }

            list.add(target);
            prev = target;
        }

        return list.get(rowIndex - 1);
    }
}