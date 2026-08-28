class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        Stack<Integer> studentStack = new Stack<>();
        Stack<Integer> sandwichesStack = new Stack<>();
        
        for (int i : students) studentStack.push(i);
        for (int i : sandwiches) sandwichesStack.push(i);

        int ans = 0;

        while (!sandwichesStack.isEmpty()) {
            
            System.out.println(sandwichesStack);
            System.out.println(studentStack);

            Stack<Integer> afterStack = new Stack<>();
            int prevLength = afterStack.size();
            ans++;

            while (!studentStack.isEmpty()) {
                if (studentStack.peek() == sandwichesStack.peek()) {

                    studentStack.pop();
                    sandwichesStack.pop();
                    continue;

                }
                else 
                {
                    afterStack.push(studentStack.pop());
                }
            }

            if (prevLength == afterStack.size()) break;

        }

        return sandwichesStack.isEmpty() ? 0 : ans;
    }
}