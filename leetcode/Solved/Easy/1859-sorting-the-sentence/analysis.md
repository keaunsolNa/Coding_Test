# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 20. 오후 2:00:31 |
| Language | java |
| Runtime | 1 ms (Beats 0.0%) |
| Memory | 42.1 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/sorting-the-sentence/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n)입니다. 여기서 n은 입력 문자열의 단어 수를 나타냅니다. `TreeMap`을 사용하여 단어를 정렬하는 데 O(n log n) 시간이 걸리기 때문입니다. 또한, 문자열을 분할하고 단어를 처리하는 데 O(n) 시간이 추가로 걸리지만, 이는 O(n log n)보다 작기 때문에 무시할 수 있습니다.

2. **공간 복잡도**: O(n)입니다. `TreeMap`에 단어를 저장하는 데 O(n) 공간이 필요합니다. 여기서 n은 입력 문자열의 단어 수를 나타냅니다.

3. **풀이 접근법**: 이 문제는 문자열을 분할하고, 각 단어의 인덱스를 추출하여 `TreeMap`에 저장하는 방식으로 해결됩니다. `TreeMap`은 자동으로 키를 정렬하므로, 단어를 정렬하여 원하는 순서로 출력할 수 있습니다.

4. **잘된 점**: 코드는 간결하고, 문제를 명확하게 이해하고 해결한 것으로 보입니다. `TreeMap`을 사용하여 단어를 정렬하는 것은 좋은 접근법입니다.

5. **개선 사항**: 코드는 이미 충분히 간결하고 효율적입니다. 그러나, 마지막에 빈 문자열을 제거하기 위해 `trim()` 함수를 사용할 수 있습니다. 또한, `StringBuilder`를 사용하여 문자열을 더하는 대신, 문자열을 연결하는 것은 더 효율적일 수 있습니다. 예를 들어, `StringBuilder`를 사용하여 문자열을 연결하면 다음과 같습니다.
```java
StringBuilder answer = new StringBuilder();
for (int i = 1; i <= map.size(); i++) {
    answer.append(map.get(i));
    if (i < map.size()) {
        answer.append(" ");
    }
}
return answer.toString();
```
이러한 변경은 코드의 효율성을 조금提高할 수 있습니다.
