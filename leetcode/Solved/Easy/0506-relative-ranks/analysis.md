# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026-05-20 23:23:30 |
| Language | java |
| Runtime | 18 ms (Beats 13.8%) |
| Memory | 47.5 MB (Beats 68.3%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/relative-ranks/submissions/)

## Code Review

**코드 리뷰**

1. **시간 복잡도**: 이 코드의 시간 복잡도는 O(n log n)입니다. 이는 `TreeMap`을 사용하여 정렬하는 과정에서 발생합니다. `TreeMap`은 트리 기반의 데이터 구조로, 삽입 및 삭제 연산의 시간 복잡도가 O(log n)입니다. score 배열을 `TreeMap`에 넣고, 다시 `TreeMap`의 키를 반복하여 rank를 매기는 과정에서 시간 복잡도가 증가합니다.

2. **공간 복잡도**: 이 코드의 공간 복젝트도는 O(n)입니다. 이는 `TreeMap`을 사용하여 score 배열의 모든 원소를 저장하기 때문입니다. 두 개의 `TreeMap`을 사용하여 공간 복젝트도가 증가합니다.

3. **풀이 접근법**: 이 코드는 정렬을 기반으로 하는 접근법을 사용합니다. `TreeMap`을 사용하여 score 배열을 내림차순으로 정렬하고, 정렬된 순서에 따라 rank를 매깁니다. 이는 간단하고 직관적인 접근법입니다.

4. **잘된 점**: 코드에서 잘 구현된 부분은 `TreeMap`을 사용하여 정렬하는 과정입니다. 이는 코드를 단순하고 직관적으로 만들어 주었습니다. 또한, rank를 매기는 로직도 명확하고 이해하기 쉽습니다.

5. **개선 사항**: 코드를 개선할 수 있는 부분은 `TreeMap`을 사용하여 정렬하는 과정입니다. `Arrays.sort()` 함수를 사용하여	score 배열을 정렬할 수 있습니다. 또한, 두 개의 `TreeMap`을 사용하는 대신, 한 개의 `TreeMap`을 사용하여 공간 복젝트도를 줄일 수 있습니다. 또한, rank를 매기는 로직을 조금 더 간단하게 만들 수 있습니다. 예를 들어, `String[]` 배열을 미리 초기화하여, rank를 매기는 과정에서 `String`을 생성하는 것을 tránh할 수 있습니다. 예시는 다음과 같습니다.
```java
class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] ans = new String[score.length];
        Integer[] indexes = new Integer[score.length];
        for (int i = 0; i < score.length; i++) {
            indexes[i] = i;
        }
        Arrays.sort(indexes, (a, b) -> score[b] - score[a]);
        for (int i = 0; i < indexes.length; i++) {
            if (i == 0) {
                ans[indexes[i]] = "Gold Medal";
            } else if (i == 1) {
                ans[indexes[i]] = "Silver Medal";
            } else if (i == 2) {
                ans[indexes[i]] = "Bronze Medal";
            } else {
                ans[indexes[i]] = String.valueOf(i + 1);
            }
        }
        return ans;
    }
}
```
