class Solution {
    public int[] decrypt(int[] code, int k) {

        int l = code.length;
        int[] result = new int[l];

        if (k == 0) return result;

        for (int i = 0; i < l; i++) {

            if (k > 0) {

                for (int offset = 1; offset <= k; offset++) {
                    int circularIndex = (i + offset) % l;
                    result[i] += code[circularIndex];
                }

            } else {

                for (int offset = k; offset < 0; offset++) {
                    int circularIndex = (i + offset + l) % l;
                    result[i] += code[circularIndex];
                }
                
            }
        }
      
        return result;
        
    }
}