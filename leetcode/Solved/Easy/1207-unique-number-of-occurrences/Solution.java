class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> counts = new HashMap<>();

        for (int value : arr) counts.merge(value, 1, Integer::sum);

        // A HashSet gives O(1) membership checks; add() returns false
        // when the occurrence count has already been seen.
        Set<Integer> seen = new HashSet<>();

        for (int count : counts.values()) {
            if (!seen.add(count)) return false;
        }

        return true;
    }
}
