class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);

        List<Integer> valList = new ArrayList<>();

        System.out.println(map);

        for (int key : map.keySet()) {
            
            int num = map.get(key);
            valList.add(num);

            System.out.println(num + " : " + valList);
            if (valList.contains(num)) return false;
        }

        return true;
    }
}