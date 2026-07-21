class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        
        String word = licensePlate.replaceAll("\\s", "").replaceAll("[0-9]", "").toLowerCase();

        char[] arr = word.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (char c : arr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        Map<Integer, String> ansMap = new TreeMap<>();

        for (String str : words) {

            char[] temp = str.toCharArray();
            Map<Character, Integer> tempMap = new HashMap<>();

            for (char c : temp) {

                tempMap.put(c, tempMap.getOrDefault(c, 0) + 1);
            }

            boolean check = true;

            for (char key : map.keySet()) {

                if (tempMap.getOrDefault(key, 0) < map.get(key)) {
                    check = false;
                    break;
                }
            }

            if (check && ansMap.get(str.length()) == null) {
                ansMap.put(str.length(), str);
            }
            
        }

        return ansMap.values().iterator().next();
    }
}