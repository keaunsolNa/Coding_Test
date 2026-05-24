# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026-05-24 14:39:15 |
| Language | java |
| Runtime | 2113 ms (Beats 5.8%) |
| Memory | 47.1 MB (Beats 51.6%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/submissions/)

## Code Review

**코드 리뷰**

### 1. 시간 복잡도
시간 복잡도는 O(n^2)입니다. 이는 while 루프 내에서 배열을 순회하고, 각 요소에 대해 다음 요소를 비교하기 때문입니다. 또한, remove 연산은 리스트의 모든 요소를_shift 하므로 O(n)의 시간 복잡도를 가지게 됩니다.

### 2. 공간 복잡도
공간 복잡도는 O(n)입니다. 입력 문자열의 모든 문자를 리스트에 저장하기 때문에 최대 n개의 문자를 저장해야 합니다.

### 3. 풀이 접근법
이 풀이는 배열을 순회하고, 인접한 중복 문자를 제거하는 접근법을 사용했습니다. 이는 기본적으로 반복과 비교를 기반으로 하는 알고리즘입니다. 하지만, 스택을 사용하여 더 효율적으로 풀 수 있는 문제입니다.

### 4. 잘된 점
코드는 비교적 읽기 쉽고, 변수 이름이 명확합니다. 또한, 풀이의 流れ가 순서대로 명확하게 진행됩니다.

### 5. 개선 사항
이 문제는 스택을 사용하여 더 효율적으로 풀 수 있습니다. 스택을 사용하여 인접한 중복 문자를 제거하면, 시간 복잡도를 O(n)으로 개선할 수 있습니다. 또한, 리스트에서 요소를 삭제하는 연산을 피할 수 있으므로, 더 많은 성능 개선을 기대할 수 있습니다. 

```java
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
```
이 코드는 StringBuilder를 사용하여 문자열을 빌드하고, 마지막 문자가 현재 문자와 같으면 삭제하고, 아니라면 추가합니다. 이 방법은 시간 복잡도를 O(n)으로 줄일 수 있으며, 더 효율적인 풀이 방법입니다.
