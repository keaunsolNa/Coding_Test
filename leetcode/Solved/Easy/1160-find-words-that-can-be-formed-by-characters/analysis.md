# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 13. 오전 10:05:36 |
| Language | java |
| Runtime | 6 ms (Beats 87.2%) |
| Memory | 47.4 MB (Beats 82.3%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n*m) - 여기서 n은 단어의 개수, m은 가장 긴 단어의 길이입니다. 코드는 각 단어를 순회하며 사용 가능한 문자와 비교하기 때문입니다.

2. **공간 복잡도**: O(1) - 코드는 문자의 개수(26개)를 기준으로 고정된 크기의 배열을 사용하기 때문에 공간 복잡도는 상수입니다.

3. **풀이 접근법**: 해시 테이블(배열)을 사용하여 사용 가능한 문자와 각 단어의 문자를 비교합니다. 이는 카운팅 알고리즘의典型적인 패턴입니다.

4. **잘된 점**: 코드는 매우 간결하고 읽기 쉽습니다. 또한, 변수명이 명확하여 코드의 의도를 쉽게 이해할 수 있습니다. 특히, `availableCharCount`와 `wordCharCount` 변수명이 좋은 예입니다.

5. **개선 사항**: 코드는 이미 매우 효율적이지만, Java 8의 Stream API를 사용하여 더 간결하게 구현할 수 있습니다. 또한, `canFormWord` 변수를 사용하지 않고, 바로 `totalLength`에 추가하는 방식으로도 구현할 수 있습니다. 하지만, 이러한 변경은 코드의 가독성을 저해할 수 있으므로, 현재의 구현이 가장 좋습니다.
