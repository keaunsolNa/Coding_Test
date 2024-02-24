import java.io.*;
import java.util.*;

class Solution {
    
    private static Stack<Subject> stack;
    private static Subject newSubject;
    private static int nowTime; 
    private static class Subject {

        String name;
        int start;
        int time;

        Subject(String name, String start, String time) {

            this.name = name;
            this.start = timeToMinute(start);
            this.time = Integer.parseInt(time);
        }

        public int timeToMinute(String start) {
            
            String[] arr = start.split(":");
            int h = Integer.parseInt(arr[0]) * 60;
            int m = Integer.parseInt(arr[1]);
            return h + m;
        }
    }
    
    public String[] solution(String[][] plans) {
        
        Subject[] arr = new Subject[plans.length];
        
        for(int i = 0; i < plans.length; i++) {
            
            Subject temp = new Subject(plans[i][0], plans[i][1], plans[i][2]);
            
            arr[i] = temp;
        }

        Arrays.sort(arr, (o1, o2) -> {
            return o1.start - o2.start;
        });
        
        
        stack = new Stack<>();
        List<String> ans = new ArrayList<>();
        
        nowTime = -1;
        
        for(int i = 0; i < arr.length; i++) {
            
            if(stack.isEmpty()) {
                stack.push(arr[i]);
                continue;
            }
            
            Subject nowSubject = stack.peek();
            newSubject = arr[i];
            
            nowTime = nowSubject.start;
            
            if(nowTime + nowSubject.time <= newSubject.start) pop(stack, newSubject, nowTime, ans);
            else nowSubject.time -= newSubject.start - nowTime;
            
            stack.push(newSubject);
        }
        
        while(!stack.isEmpty()) ans.add(stack.pop().name);
        
        return ans.toArray(new String[0]);
      
    }

    private static void pop(Stack<Subject> stack, Subject newSubject, int nowTime, List<String> ans) {
        
        if(stack.isEmpty()) return;
        
        Subject now = stack.peek();
        
        if(nowTime + now.time <= newSubject.start) {
          
            ans.add(stack.pop().name);
            pop(stack, newSubject, nowTime + now.time, ans);
            
        } else now.time -= newSubject.start - nowTime;
    }
}