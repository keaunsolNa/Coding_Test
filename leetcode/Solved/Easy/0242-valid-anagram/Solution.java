class Solution {
    public boolean isAnagram(String s, String t) {
        
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (char c : s.toCharArray()) sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        for (char c : t.toCharArray()) tMap.put(c, tMap.getOrDefault(c, 0) + 1);

        System.out.println(sMap);
        System.out.println(tMap);

        for (Character key : sMap.keySet()) {

            System.out.println(key + " " + tMap.get(key) + " : " + sMap.get(key));
            
            if (tMap.get(key) != sMap.get(key)) return false;
        }

        for (Character key : tMap.keySet()) {

            if (tMap.get(key) != sMap.get(key)) return false;
        }

        return true;
    }
}