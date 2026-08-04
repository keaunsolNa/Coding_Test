# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 4. 오후 3:57:58 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.5 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/single-number-iii/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n^2) - contains() 메서드는 리스트의 모든 원소를 순회하여 원하는 값을 찾기 때문에 O(n)의 시간 복잡도를 가지며, 이 메서드가 리스트의 모든 원소에 대해 호출되므로 전체 시간 복잡도는 O(n^2)입니다.

2. **공간 복잡도**: O(n) - 리스트에 최대 n개의 원소가 저장될 수 있으므로 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 풀이에서는 리스트를 사용하여 중복된 숫자를 제거하는 방식을 사용했습니다. 하지만 이 문제는 비트 조작을 사용하여 더 효율적으로 풀 수 있습니다. 비트 조작을 사용하면 XOR 연산을 통해 두 개의 단일 숫자를 찾을 수 있습니다.

4. **잘된 점**: 코드는 읽기 쉽고, 변수명이 명확합니다. 또한 리스트의 상태를 출력하여 디버깅을 쉽게 할 수 있습니다.

5. **개선 사항**: 이 풀이는 비트 조작을 사용하지 않기 때문에 효율적이지 않습니다. XOR 연산을 사용하여 두 개의 단일 숫자를 찾는 것이 더 좋은 접근법입니다. 또한, 리스트의 contains() 메서드 대신 HashMap을 사용하여 시간 복잡도를 개선할 수 있습니다. 또한 answer 배열을 초기화하고, 리스트의 원소를 answer 배열에 할당하는 코드가 주석처리되어 있습니다. 이 부분을 수정하여 올바른 결과를 반환하도록 해야 합니다. 

예를 들어, 비트 조작을 사용한 풀이는 다음과 같습니다.
```java
class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        
        int rightmostSetBit = xor & -xor;
        int single1 = 0, single2 = 0;
        for (int num : nums) {
            if ((num & rightmostSetBit) != 0) {
                single1 ^= num;
            } else {
                single2 ^= num;
            }
        }
        
        return new int[] {single1, single2};
    }
}
```
이 풀이는 시간 복잡도 O(n)과 공간 복잡도 O(1)을 가지며, 더 효율적입니다.
