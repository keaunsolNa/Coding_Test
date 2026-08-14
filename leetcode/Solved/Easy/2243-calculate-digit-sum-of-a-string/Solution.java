class Solution {
    public String digitSum(String s, int k) {

        if (s.length() <= k) return s;

        char[] arr = s.toCharArray();

        while (true) {

            StringBuilder temp = new StringBuilder();

            for (int i = 0; i < arr.length; i += k) {

                int sum = 0;
                int range = k;

                if (i + k < arr.length) {
                    
                    for (int j = i; j < i + k; j++) sum += arr[j] - '0';
                }

                else {
                   
                   for (int j = i; j < arr.length; j++) sum += arr[j] - '0';
              
                }

                temp.append(String.valueOf(sum));

            }

            arr = temp.toString().toCharArray();

            if (arr.length <= k) return temp.toString();
        }

    }
}