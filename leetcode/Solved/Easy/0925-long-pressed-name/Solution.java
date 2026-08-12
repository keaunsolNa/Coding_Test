class Solution {
    public boolean isLongPressedName(String name, String typed) {
        
        if (name.equals(typed)) return true;

        char[] nameArr = name.toCharArray();
        char[] typedArr = typed.toCharArray();

        Map<Character, Integer> nameMap = new HashMap<>();
        Map<Character, Integer> typedMap = new HashMap<>();

        for (char c : nameArr) nameMap.put(c, nameMap.getOrDefault(c, 0) + 1);

        for (char c : typedArr) typedMap.put(c, typedMap.getOrDefault(c, 0) + 1);

        boolean check = true;

        for (char c : nameMap.keySet()) {
            
            if (null == typedMap.get(c)) return false;

            if (typedMap.get(c) < nameMap.get(c)) return false;

            if (typedMap.get(c) != nameMap.get(c)) check = false;
        }

        System.out.println(check);
        return !check;
        
    }
}