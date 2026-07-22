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

        int left = 1; 
        int right = n;
        int pick = (n + 1) / 2;

        while (guess(pick) != 0) {
            
            System.out.println("pick : " + pick + " \t left : " + left + "\t right : " + right + "\t guess(pick) : " + guess(pick));
            
            if (guess(pick) == -1) {
                right = pick - 1;
            } else { 
                left = pick + 1;
            }

            pick = (left + right) / 2;
        }       

        return pick;
    }
}