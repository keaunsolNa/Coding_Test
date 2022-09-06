package codingTestLevel2;

import java.util.Stack;

public class Lessons42 {

	public static void main(String[] args) {

		Lessons42 lessons42 = new Lessons42();
		String skill = "S";
		String[] skill_trees = {"ZS"};
		int answer = lessons42.solution(skill, skill_trees);

		System.out.println("ANSER : " + answer);
		
	}
	
	public int solution(String skill, String[] skill_trees) {
		
//		선행 스킬이란 어떤 스킬을 배우기 전에 먼저 배워야 하는 스킬을 뜻합니다.
//
//		예를 들어 선행 스킬 순서가 스파크 → 라이트닝 볼트 → 썬더일때, 썬더를 배우려면 먼저 라이트닝 볼트를 배워야 하고, 라이트닝 볼트를 배우려면 먼저 스파크를 배워야 합니다.
//
//		위 순서에 없는 다른 스킬(힐링 등)은 순서에 상관없이 배울 수 있습니다. 따라서 스파크 → 힐링 → 라이트닝 볼트 → 썬더와 같은 스킬트리는 가능하지만, 썬더 → 스파크나 라이트닝 볼트 → 스파크 → 힐링 → 썬더와 같은 스킬트리는 불가능합니다.
//
//		선행 스킬 순서 skill과 유저들이 만든 스킬트리1를 담은 배열 skill_trees가 매개변수로 주어질 때, 가능한 스킬트리 개수를 return 하는 solution 함수를 작성해주세요.
				
        int answer = 0;
        String temp = "";
        int num = skill.length() - 1;
        Stack<String> skillStack = new Stack<>();
        
        for (String string : skill_trees) {
        	for(int i = 0; i < string.length(); i++) {
        		if(skill.contains(string.charAt(i) + "")) {
        			temp += string.charAt(i) + "";
        		}
        	}
        	skillStack.add(temp);
        	temp = "";
		}
        
        System.out.println(skillStack);
        if(skillStack.isEmpty())return skill_trees.length;
        
        while(skillStack.size() != 0) {
        	String skilltree = skillStack.pop();
        	// skill의 마지막 스킬이 skill_trees의 마지막 char에 있다면, skill의 모든 skill이 있어야 한다.
        	// 없다면 skill의 뒤에서 2번째 스킬이 ---로 반복
        	if(skilltree.equals("")) {
        		answer++;
        		continue;
        	}
        	for(int j = skilltree.length() - 1; j > -1; j--) {
        		if(skilltree.charAt(j) == skill.charAt(num)) {
        			if(skillCheck(skilltree.substring(0, j+1), skill.substring(0, num+1)))answer++;
        			System.out.println("for문 종료");
        			break;
        		} else {
        			num--;
        			j++;
        			if(num == -1) {
        				break;
        			}
        		}
        	}
        	num = skill.length() - 1;
        }

        System.out.println(skillStack);
        return answer;
    }
	
	public boolean skillCheck(String skilltree, String skill) {
		
		System.out.println("skill : " + skill);
		System.out.println("skillTree : " + skilltree);
		int skillLeg = skill.length()-1;
		int skillTreeLeg = skilltree.length()-1;
		for(int i = skillLeg; i > -1; i--) {
			if(skillTreeLeg == -1)return false;
			System.out.println("TEST :" + skilltree.charAt(skillTreeLeg));
			System.out.println("TEST2 :" + skill.charAt(i));
			if(skilltree.charAt(skillTreeLeg) == skill.charAt(i)) {
				System.out.println(i);
				System.out.println(skillTreeLeg);
				skillTreeLeg--;
			} else {
				System.out.println("불일치");
				return false;
			}
		}
		if(skillTreeLeg == 0) return false;
		return true;
	}
}
	