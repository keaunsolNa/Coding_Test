# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오후 3:29:11 |
| Language | java |
| Runtime | 1 ms (Beats 0.0%) |
| Memory | 42.8 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/shortest-completing-word/submissions/)

## Code Review

**코드 리뷰**

1. **시간 복잡도**: O(n*m) - 여기서 n은 단어의 개수, m은 단어의 평균 길이입니다. licensePlate의 문자를 처리하고, 각 단어를 처리하는 데 걸리는 시간이 포함됩니다.
2. **공간 복잡도**: O(n*m) - licensePlate의 문자와 각 단어의 문자를 저장하는 데 필요한 공간이 포함됩니다. HashMap을 사용하여 문자의 빈도를 저장하기 때문에 공간 복잡도가 증가합니다.
3. **풀이 접근법**: 해시 맵을 사용하여 문자의 빈도를 저장하고, 각 단어를 비교하여 조건을 만족하는지 확인하는 알고리즘을 사용했습니다. 이 접근법은 문제를 효율적으로 해결할 수 있습니다.
4. **잘된 점**: 코드는 문제를 명확하게 이해하고, 해시 맵을 사용하여 효율적으로 해결했습니다. 또한, 코드는 읽기 쉽고, 변수 이름이 명확합니다.
5. **개선 사항**: 현재 코드는 모든 단어를 처리한 후에 가장 짧은 단어를 찾습니다. 하지만, 더 짧은 단어가 나타나면 바로 반환할 수 있도록 코드를 최적화할 수 있습니다. 또한, System.out.println문을 제거하여 코드를 더 깨끗하게 만들 수 있습니다. 

```java
// 개선된 코드
String shortestWord = null;
int minLength = Integer.MAX_VALUE;

for (String str : words) {
    // ...
    if (check && str.length() < minLength) {
        shortestWord = str;
        minLength = str.length();
    }
}

return shortestWord;
```
