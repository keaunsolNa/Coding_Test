class Solution {
    public boolean rotateString(String s, String goal) {

        // Every rotation of s is a substring of s + s, so goal is a
        // rotation of s iff lengths match and s+s contains goal.
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}
