class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);

        List<Integer> valList = new ArrayList<>();

        for (int key : map.keySet()) {
            
            int num = map.get(key);
            if (valList.contains(num)) return false;

            valList.add(num);

        }

        return true;
    }
}