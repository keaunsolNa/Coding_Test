class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++) {

            if (selfDividing(i)) list.add(i);
        }   

        return list;
    }

    private boolean selfDividing(int num) {

        int temp = num;
      
        while (temp > 0) {

            int digit = temp % 10;
          
            if (digit == 0 || num % digit != 0) {
                return false;
            }
          
            temp /= 10;
        }
      
        return true;
    }
}