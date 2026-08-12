# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 12. 오전 11:07:09 |
| Language | java |
| Runtime | 2 ms (Beats 0.0%) |
| Memory | 42.9 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/roman-to-integer/submissions/)

## Code Review

로마 숫자를 정수로 변환하는 문제의 코드 리뷰입니다.

1. **시간 복잡도**: O(n) - 입력 문자열의 길이(n)에 비례하는 시간 복잡도를 가지고 있습니다. 이는 문자열을 한 번만 순회하기 때문입니다.

2. **공간 복잡도**: O(1) - 입력 문자열을 배열로 변환하지만, 추가적인 공간 사용은 입력 크기에 비례하지 않습니다. 따라서 상수 공간 복잡도를 가지며, 이는 효율적입니다.

3. **풀이 접근법**: 이 코드는 단순한 순회를 통해 로마 숫자를 정수로 변환합니다. 각 문자를 정수로 변환하고, 이전 값과 비교하여 총합을 계산하는 방식을 사용합니다. 이는 그리디 알고리즘의 특성을 가지고 있습니다.

4. **잘된 점**: 코드는 비교적 간결하며, 로마 숫자를 정수로 변환하는 로직이 명확하게 구현되어 있습니다. 또한, `convertCharToInt` 메서드를 통해 코드의 재사용성과 가독성을 높였습니다.

5. **개선 사항**: 현재 코드에는 논리적인 오류가 있습니다. `if (now > prev) total -= now;` 부분에서 `total -= prev;`로 수정되어야 합니다. 또한, `else total += (now - prev);`는 `else total += now;`로 수정되어야 합니다. 이는 로마 숫자의 규칙을 올바르게 반영하기 위함입니다. 수정된 코드는 다음과 같습니다.
```java
for (int i = 1; i < arr.length; i++) {
    char c = arr[i];
    int now = convertCharToInt(c);

    if (now > prev) total -= prev;
    else total += now;

    prev = now;
}
```
