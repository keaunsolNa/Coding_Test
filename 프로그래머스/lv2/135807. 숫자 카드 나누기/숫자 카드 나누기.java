import java.io.*;
import java.util.*;


class Solution {

    private static Iterator<Integer> iter;
    public int solution(int[] arrayA, int[] arrayB) {

        int answer = 0;

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        Set<Integer> setA = new TreeSet<>(Arrays.asList(Arrays.stream(arrayA).boxed().toArray( Integer[]::new )));
        Set<Integer> setB = new TreeSet<>(Arrays.asList(Arrays.stream(arrayB).boxed().toArray( Integer[]::new )));

        Set<Integer> listA = new TreeSet<>();
        Set<Integer> listB = new TreeSet<>();

        iter = setA.iterator();
        Integer target = iter.next();

        for(int i = target; i > 0; i--) {

            if(check(i)) listA.add(i);
            iter = setA.iterator();
        }

        iter = setB.iterator();
        target = iter.next();

        for(int i = target; i > 0; i--) {

            if(check(i)) listB.add(i);

            iter = setB.iterator();
        }


        iter = listA.iterator();
        Iterator<Integer> iter2 = setB.iterator();

        while(iter.hasNext()) {

            int temp = iter.next();
            if(check2(iter2, temp)) answer = Math.max(temp, answer);
            iter2 = setB.iterator();
        }

        iter = listB.iterator();
        iter2 = setA.iterator();

        while(iter.hasNext()) {

            int temp = iter.next();
            if(check2(iter2, temp)) answer = Math.max(temp, answer);
            iter2 = setA.iterator();
        }

        return answer;
    }

    private static boolean check(int target) {

        while(iter.hasNext())
            if(iter.next() % target != 0) return false;

        return true;
    }

    private static boolean check2(Iterator<Integer> iter, int target) {

        while(iter.hasNext())
            if(iter.next() % target == 0) return false;

        return true;
    }
}