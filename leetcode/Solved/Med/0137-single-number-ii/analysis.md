# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 4. 오후 4:03:22 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.8 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/single-number-ii/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n)입니다. nums 배열의 각 원소를 한 번씩만 방문하기 때문입니다. Big-O 표기법에서 n은 입력 배열의 크기를 나타냅니다.

2. **공간 복잡도**: O(1)입니다. 사용된 배열의 크기는 입력 크기와 무관하게 고정되어 있기 때문입니다. 하지만 배열의 크기가 3 * 10000 + 1로 고정되어 있어, 실제로는 입력 크기에 따라 동적으로 크기를 조절하는 것이 더 효율적일 수 있습니다.

3. **풀이 접근법**: 해시 테이블을 이용한 접근법을 사용하고 있습니다. 각 숫자의 등장 횟수를 배열에 저장하고, 3의 배수인 횟수가 발생하면 결과에 XOR 연산을 수행합니다. 하지만, XOR 연산을 사용하는 것이 더 효율적인 방법입니다. 

4. **잘된 점**: 코드는 간결하고, 이해하기 쉽습니다. 또한, 문제의 요구 사항을满족하는 해법을 제공합니다.

5. **개선 사항**: 현재 코드는 단순하지만, 공간 복잡도를 개선할 수 있습니다. 예를 들어, XOR 연산을 사용하여 공간 복잡도를 O(1)로 줄일 수 있습니다. 또한, 입력 배열의 크기에 따라 동적으로 배열의 크기를 조절하여 메모리 사용을 최적화할 수 있습니다. 아래는 개선된 코드입니다.
```java
class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for(int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;
    }
}
```
이 코드는 XOR 연산을 사용하여 단일 숫자를 찾는 더 효율적인 방법입니다.
