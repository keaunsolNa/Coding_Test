# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 22. 오후 3:28:32 |
| Language | java |
| Runtime | 1 ms (Beats 0.0%) |
| Memory | 42.8 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/set-mismatch/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도** — O(n log n)입니다. Arrays.sort() 함수가 사용되는데, 이는 일반적으로 퀵소트 또는 머지소트 알고리즘을 사용하여 O(n log n)의 시간 복잡도를 가지기 때문입니다. 이후 반복문을 통해 배열을 순회하므로 O(n)의 시간 복잡도가 추가됩니다. 그러나 정렬의 시간 복잡도가 더 크므로 전체 시간 복잡도는 O(n log n)입니다.

2. **공간 복잡도** — O(n)입니다. 입력 배열의 크기와 동일한 크기의 추가 배열이 생성되므로 O(n)의 공간 복잡도를 가지게 됩니다.

3. **풀이 접근법** — 정렬과 카운팅을 사용한 접근법입니다. 먼저 입력 배열을 정렬하고, 이후 각 숫자의 등장 횟수를 카운팅하여 중복된 숫자와 누락된 숫자를 찾습니다. 이는 간단하고 직관적인 접근법이지만, 정렬의 시간 복잡도가 상대적으로 높습니다.

4. **잘된 점** — 코드는 비교적 간결하고 이해하기 쉽습니다. 또한, 문제의 요구 사항을 명확하게 이해하고 이를 구현한 점은 잘된 점입니다.

5. **개선 사항** — 현재 코드는 정렬을 사용하여 시간 복잡도가 O(n log n)입니다. 이를 개선하기 위해, 해시 테이블을 사용하여 각 숫자의 등장 횟수를 카운팅할 수 있습니다. 이는 O(n)의 시간 복잡도를 가지므로, 더 효율적인 접근법입니다. 또한, 입력 배열을 정렬하지 않고, 직접 각 숫자의 등장 횟수를 카운팅하여 중복된 숫자와 누락된 숫자를 찾을 수 있습니다. 이는 공간 복잡도를 줄이고, 더 효율적인 코드를 작성할 수 있습니다. 예를 들어, 다음과 같이 해시 테이블을 사용하여 개선할 수 있습니다.
```java
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] count = new int[nums.length + 1];
        int duplicate = -1;
        for (int num : nums) {
            count[num]++;
            if (count[num] > 1) {
                duplicate = num;
            }
        }
        int missing = -1;
        for (int i = 1; i <= nums.length; i++) {
            if (count[i] == 0) {
                missing = i;
                break;
            }
        }
        return new int[] {duplicate, missing};
    }
}
```
