/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {

        int num = n;
        while (guess(num) != 0) {
            
            if (guess(num) == -1) {
                num /= 2;
            } else { 
                num += ((n - num) / 2);
            }
        }       

        return num;
    }
}