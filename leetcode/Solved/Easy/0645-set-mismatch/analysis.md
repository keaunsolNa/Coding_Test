# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 22. 오후 3:34:56 |
| Language | java |
| Runtime | 4 ms (Beats 0.0%) |
| Memory | 43.2 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/set-mismatch/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n)입니다. Arrays.sort() 함수를 사용하여 배열을 정렬하는 데 O(n log n)의 시간이 소요됩니다. 이후 반복문을 통해 배열을 탐색하는 데 O(n)의 시간이 추가로 소요됩니다.

2. **공간 복잡도**: O(n)입니다. 입력 배열의 최대 크기만큼의 추가 배열을 생성하여 공간을 사용합니다.

3. **풀이 접근법**: 정렬 및 카운팅 알고리즘을 사용하여 풀이합니다. 먼저 입력 배열을 정렬하고, 이후 각 숫자의 개수를 카운팅하여 중복된 숫자와 누락된 숫자를 찾습니다.

4. **잘된 점**: 코드는 비교적 간단하고 이해하기 쉽습니다. 중복된 숫자와 누락된 숫자를 찾는 로직이 명확하게 구현되어 있습니다.

5. **개선 사항**: Arrays.sort() 함수 대신에 해시 테이블을 사용하여 숫자의 개수를 카운팅할 수 있습니다. 이는 시간 복잡도를 O(n)으로 개선할 수 있습니다. 또한, 불필요한 System.out.println() 문을 제거하여 코드를 더 효율적으로 만들 수 있습니다. 예를 들어, 해시 테이블을 사용하여 다음과 같이 개선할 수 있습니다.
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
