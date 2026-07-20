# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 20. 오후 4:42:35 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.4 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/buddy-strings/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 이 코드의 시간 복잡도는 O(n)입니다. 여기서 n은 입력 문자열의 길이입니다. 코드는 문자열을 한 번만 순회하므로 시간 복잡도가 선형입니다.

2. **공간 복잡도**: O(n) - 이 코드의 공간 복잡도는 O(n)입니다. HashSet을 사용하여 문자열의 모든 문자를 저장하므로 최악의 경우 문자열의 길이만큼의 공간을 사용할 수 있습니다.

3. **풀이 접근법**: 이 코드는 해시 테이블과 문자열 순회를 사용하여 buddy strings 문제를 해결합니다. 두 문자열의 각 문자를 비교하여 다르면 bit를 증가시키고, 문자열의 모든 문자를 HashSet에 추가합니다. 이후 HashSet의 크기와 bit의 값을 확인하여 buddy strings인지 판단합니다.

4. **잘된 점**: 코드는 간결하고 이해하기 쉽습니다. 문자열 순회와 해시 테이블 사용이 적절하게 구현되어 있습니다. 또한 변수명이 명확하여 코드의 의도를 쉽게 파악할 수 있습니다.

5. **개선 사항**: 코드에서 `set.size() == 0` 조건은 불필요합니다. HashSet에 문자를 추가하는 과정에서 중복 문자가 있으면 HashSet의 크기는 줄어들지 않으므로, 이 조건은 항상 false입니다. 따라서 이 조건을 제거하고, bit의 값만 확인하여 buddy strings인지 판단할 수 있습니다. 또한, 변수명 `bit`은 다소 부적절합니다. `diffCount`와 같은 이름으로 변경하여 변수의 역할을 더 명확하게 나타낼 수 있습니다.
