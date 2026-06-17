# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 6. 17. 오후 9:19:51 |
| Language | java |
| Runtime | 11 ms (Beats 38.6%) |
| Memory | 47.1 MB (Beats 25.3%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/ransom-note/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n + m) - 여기서 n은 magazine의 길이, m은 ransomNote의 길이입니다. magazine과 ransomNote를 각각 한 번씩 반복하여 처리하기 때문입니다.

2. **공간 복잡도**: O(n) - magazine의 문자를 저장하기 위한 해시맵의 크기가 최대 n이 될 수 있기 때문입니다.

3. **풀이 접근법**: 해시맵을 사용하여 magazine의 문자와 그 빈도를 저장하고, ransomNote의 문자를 하나씩 확인하면서 해시맵에서 해당 문자의 빈도를 감소시키는 방식입니다. 이는 해시맵의 평균 시간 복잡도가 O(1)인 것을 이용한 것입니다.

4. **잘된 점**: 코드가 간결하고 이해하기 쉽습니다. 또한, 문제의 요구를 정확하게 구현했습니다. 해시맵을 사용하여 문자의 빈도를 효율적으로 관리했습니다.

5. **개선 사항**: 코드는 이미 충분히 최적화되어 있습니다. 그러나, 변수명과 메서드명이 더 명확하게 변경될 수 있습니다. 예를 들어, `map`을 `magazineCharCount`로 변경하여 변수의 역할을 더 명확하게 나타낼 수 있습니다. 또한, 주석을 추가하여 코드의 로직을 설명할 수 있습니다.
