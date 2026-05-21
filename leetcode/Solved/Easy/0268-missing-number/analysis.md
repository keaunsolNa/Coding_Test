# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026-05-19 22:16:08 |
| Language | java |
| Runtime | 10 ms (Beats 6.8%) |
| Memory | 48.1 MB (Beats 5.4%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/missing-number/submissions/)

## Code Review

LeetCode 문제의 코드 리뷰입니다.

1. **시간 복잡도** — 이 코드의 시간 복잡도는 O(n log n)입니다. Arrays.sort() 함수를 사용하여 배열을 정렬하는 데 O(n log n)의 시간이 걸리기 때문입니다. 이후의 반복문은 O(n)의 시간을 가지고 있지만, 정렬에 사용되는 시간이 더 크기 때문에 전체 시간 복잡도는 O(n log n)입니다.

2. **공간 복잡도** — 이 코드의 공간 복잡도는 O(1)입니다. 입력 배열을 제외하고 추가 공간을 사용하지 않기 때문입니다. Arrays.sort() 함수는 원본 배열을 수정하는 방식으로 작동하기 때문에 별도의 공간이 필요하지 않습니다.

3. **풀이 접근법** — 이 코드는 정렬 알고리즘을 사용하여 배열을 정렬한 후, Missing Number를 찾는 접근법을 사용합니다. 정렬 후에 각 요소가 연속된 숫자인지 확인하여 MISSING NUMBER를 찾습니다.

4. **잘된 점** — 코드는 비교적 간단하고 이해하기 쉽습니다. 또한 MISSING NUMBER를 찾는 논리는 명확하게 구현되어 있습니다. 특히, 최소값이 0이 아닐 경우 0을 리턴하는 부분과, 배열의 마지막 요소 이후에 MISSING NUMBER가 있는 경우 이를 올바르게 처리하는 부분은 잘 구현된 점입니다.

5. **개선 사항** — 이 코드는 정렬 알고리즘을 사용하기 때문에 비효율적입니다. MISSING NUMBER를 찾는 다른 방법으로는 수학적 접근법이 있습니다. 예를 들어, 0에서 n까지의 모든 수의 합을 계산한 후, 실제 배열의 합을 빼는 방식으로 MISSING NUMBER를 계산할 수 있습니다. 이를 사용하면 시간 복잡도를 O(n)으로 개선할 수 있습니다. 또한, XOR 연산을 사용하여 MISSING NUMBER를 찾을 수도 있습니다. 이러한 방법을 사용하면 배열을 정렬할 필요가 없기 때문에 시간 복잡도를 개선할 수 있습니다. 대안적인 접근방식은 다음과 같습니다.
```java
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectSum - actualSum;
    }
}
```
