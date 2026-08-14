class Solution {
    public String digitSum(String s, int k) {

        char[] arr = s.toCharArray();

        while (true) {

            StringBuilder temp = new StringBuilder();

            for (int i = 0; i < arr.length; i += k) {

                int sum = 0;

                if (i + k < arr.length) {

                    int a = (int) arr[i] - '0';
                    int b = (int) arr[i + 1] - '0';
                    int c = (int) arr[i + 2] - '0';
                    sum = a + b + c;
                }

                else if (i + k < arr.length - 1) {
                   
                    int a = (int) arr[i] - '0';
                    int b = (int) arr[i + 1] - '0';
                    sum = a + b;
                }

                else {

                    sum = (int) arr[i] - '0';
                }

                temp.append(String.valueOf(sum));

            }

            arr = temp.toString().toCharArray();

            if (arr.length == 3) return temp.toString();
        }

    }
}