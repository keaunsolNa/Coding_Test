# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 22. 오후 3:38:53 |
| Language | java |
| Runtime | 4 ms (Beats 0.0%) |
| Memory | 42.9 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/set-mismatch/submissions/)

## Code Review

리뷰 대상 코드는 LeetCode의 'set-mismatch' 문제를 해결하기 위한 자바 솔루션입니다. 

1. **시간 복잡도**: 이 코드의 시간 복잡도는 O(n log n)입니다. 이는 Arrays.sort() 함수를 사용하여 입력 배열을 정렬하는 데 O(n log n) 시간이 소요되기 때문입니다. 이후 반복문을 통해 각 요소를 처리하는 데 O(n) 시간이 추가로 소요됩니다. 따라서 전체 시간 복잡도는 O(n log n) + O(n) = O(n log n)입니다.

2. **공간 복잡도**: 이 코드의 공간 복잡도는 O(n)입니다. 입력 배열의 최대값에 따라 추가 배열을 생성하기 때문에, 최악의 경우 배열의 크기가 n에 비례하여 증가합니다.

3. **풀이 접근법**: 이 코드는 정렬과 카운팅을 결합한 접근법을 사용합니다. 먼저 입력 배열을 정렬하고, 이후 각 요소의 출현 횟수를 카운팅하여 중복과 누락된 요소를 찾습니다. 이는 간단하고 직관적인 접근법이지만, 정렬에 의한 시간 복잡도가 상대적으로 높습니다.

4. **잘된 점**: 코드는 비교적 간단하고 이해하기 쉽습니다. 또한, 중복과 누락된 요소를 찾는 로직이 명확하게 구현되어 있습니다.

5. **개선 사항**: 이 코드의 시간 복잡도를 개선하기 위해, 정렬 대신 해시 테이블(HashMap 등)을 사용하여 각 요소의 출현 횟수를 카운팅할 수 있습니다. 이는 시간 복잡도를 O(n)으로 줄일 수 있습니다. 또한, 불필요한 System.out.println() 문을 제거하여 코드를 더 효율적으로 만들 수 있습니다. 해시 테이블을 사용한 예시는 다음과 같습니다.
```java
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] count = new int[nums.length + 1];
        int[] ans = new int[2];
        
        for (int num : nums) {
            count[num]++;
        }
        
        for (int i = 1; i <= nums.length; i++) {
            if (count[i] == 0) ans[1] = i;
            if (count[i] == 2) ans[0] = i;
        }
        
        return ans;
    }
}
```
