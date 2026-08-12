class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int[] copy = Arrays.copyOf(candies, candies.length);
        Arrays.sort(copy);

        int max = copy[copy.length - 1];
        List<Boolean> list = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {

            if (candies[i] + extraCandies >= max) list.add(true);
            else list.add(false); 
        }

        return list;

    }
}