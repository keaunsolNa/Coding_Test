package codingTestLevel2;

public class Lessons49 {
	
	public static void main(String[] args) {

		Lessons49 lessons49 = new Lessons49();

		int k = 40;
		int[][] dungeons = {{20,20},{10,10},{10,10},{10,10}};
		
		int answer = lessons49.solution(k, dungeons);

		System.out.println(answer);
		
	}
	boolean[] visit;
	int[] minimumTired; 
	int[] spendTired; 
	int round = 0;
	int answer = 0;
	public int solution(int k, int[][] dungeons) {
		
//		피로도 		
//		XX게임에는 피로도 시스템(0 이상의 정수로 표현합니다)이 있으며, 일정 피로도를 사용해서 던전을 탐험할 수 있습니다. 
//		이때, 각 던전마다 탐험을 시작하기 위해 필요한 "최소 필요 피로도"와 던전 탐험을 마쳤을 때 소모되는 "소모 피로도"가 있습니다. 
//		"최소 필요 피로도"는 해당 던전을 탐험하기 위해 가지고 있어야 하는 최소한의 피로도를 나타내며, "소모 피로도"는 던전을 탐험한 후 소모되는 피로도를 나타냅니다. 
//		예를 들어 "최소 필요 피로도"가 80, "소모 피로도"가 20인 던전을 탐험하기 위해서는 유저의 현재 남은 피로도는 80 이상 이어야 하며, 던전을 탐험한 후에는 피로도 20이 소모됩니다.
//
//		이 게임에는 하루에 한 번씩 탐험할 수 있는 던전이 여러개 있는데, 한 유저가 오늘 이 던전들을 최대한 많이 탐험하려 합니다. 
//		유저의 현재 피로도 k와 각 던전별 "최소 필요 피로도", "소모 피로도"가 담긴 2차원 배열 dungeons 가 매개변수로 주어질 때, 유저가 탐험할수 있는 최대 던전 수를 return 하도록 solution 함수를 완성해주세요.
		
		visit = new boolean[dungeons.length];
		minimumTired = new int[dungeons.length];
		spendTired = new int[dungeons.length];
		
		for(int i = 1; i <= dungeons.length; i++) {
			dfs(0, i, dungeons, k);
		}
        System.out.println("피로도 : " + k);
        
        return answer;
    }
	
	public int intArrayToInt(int[] minimumTired, int[] spendTired, int length, int k) {
        int temp = 0;
        for(int i = 0; i < length; i++) {
        	if(k >= minimumTired[i]) {
        		k = k - spendTired[i];
        		temp += spendTired[i];
        		round++;
        	}
        }
        return temp;
    }
	
	public void dfs(int level, int length, int[][] numbers, int k) {
        if(level == length) {
            int num = intArrayToInt(minimumTired, spendTired, length, k);
            System.out.println("소모 필요도 : " + num);
            	k = k - num;
            	if(num == 0) {
            		round = 0;
            	}
            	if(answer < round) {
            		answer = round;
            	}
            System.out.println("잔여 피로도 : " + k);
            System.out.println("최대 던전 누적 횟수 : " + answer);
            round = 0;
        } else {
            for(int i = 0; i < numbers.length; i++) {
            	System.out.println("dfs node level : " + level);
                if(!visit[i]) {
                    visit[i] = true;
                    minimumTired[level] = numbers[i][0];
                    spendTired[level] = numbers[i][1];
                    dfs(level+1, length, numbers, k);
                    visit[i] = false;
                }
            }
        }
    }
}