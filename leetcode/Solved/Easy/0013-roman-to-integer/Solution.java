class Solution {
    public int romanToInt(String s) {
        
        char[] arr = s.toCharArray();
        
        int prev = convertCharToInt(arr[0]);
        int total = prev;

        for (int i = 1; i < arr.length; i++) {

            char c = arr[i];
            int now = convertCharToInt(c);

            if (now > prev) total += (now - prev - prev);
            else total += now;

            prev = now;
        }

        return total;
    }

    private int convertCharToInt(char c)  {

        int num = switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };

        return num;
    }
}