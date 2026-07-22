# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 22. 오후 3:32:12 |
| Language | java |
| Runtime | 6 ms (Beats 0.0%) |
| Memory | 43.2 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/set-mismatch/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n)입니다. Arrays.sort() 함수를 사용하여 배열을 정렬하는데, 이는 일반적으로 O(n log n)의 시간 복잡도를 가지기 때문입니다. 이후 반복문을 통해 배열을 탐색하는 작업은 O(n)의 시간 복잡도를 가지므로, 전체 시간 복잡도는 O(n log n) + O(n) = O(n log n)입니다.

2. **공간 복잡도**: O(n)입니다. 입력 배열의 최대 크기만큼의 추가 배열을 생성하여 사용하기 때문입니다.

3. **풀이 접근법**: 정렬과 카운팅을 사용한 접근법입니다. 먼저 입력 배열을 정렬하고, 이후 각 원소의 개수를 카운팅하여 중복된 원소와 누락된 원소를 찾습니다.

4. **잘된 점**: 코드는 간결하고 이해하기 쉽습니다. 또한, 문제의 요구 사항을 정확하게 구현하여 올바른 결과를 출력합니다.

5. **개선 사항**: Arrays.sort() 함수를 사용하여 배열을 정렬하는 대신, 해시 테이블을 사용하여 각 원소의 개수를 카운팅할 수 있습니다. 이는 시간 복잡도를 O(n)으로 개선할 수 있습니다. 또한, System.out.println() 함수를 사용하여 디버깅 정보를 출력하는 대신, 로깅 함수를 사용하여 출력할 수 있습니다. 이는 코드의 가독성을 높이고, 디버깅을 더 쉽게 할 수 있습니다. 예를 들어, 다음과 같이 개선할 수 있습니다.
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
