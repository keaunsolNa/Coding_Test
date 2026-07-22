# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 22. 오후 1:36:26 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/guess-number-higher-or-lower/submissions/)

## Code Review

**코드 리뷰**

1. **시간 복잡도**: O(n) - 현재 구현된 코드는 선형 탐색과 유사한 방식으로 동작하여 시간 복잡도가 O(n)입니다. 이는 입력 크기 n에 비례하는 시간을 소요합니다.

2. **공간 복잡도**: O(1) - 코드는 상수 공간만 사용하므로 공간 복잡도는 O(1)입니다. 이는 입력 크기에 관계없이 메모리 사용량이 일정함을 의미합니다.

3. **풀이 접근법**: 현재 코드는 단순한 반복문을 사용하여 숫자를猜测하고, 결과에 따라 값을 조정합니다. 그러나 이 문제는 이진 탐색 알고리즘을 사용하여 더 효율적으로 해결할 수 있습니다. 이진 탐색은 탐색 범위를 반복적으로 반으로 나누어 더 빠른 시간 복잡도인 O(log n)를 달성할 수 있습니다.

4. **잘된 점**: 코드는 간단하고 이해하기 쉽게 작성되어 있습니다. 또한, `guess` API를 사용하여 숫자를猜测하는 로직은 명확하게 구현되어 있습니다.

5. **개선 사항**: 현재 코드는 효율적인 이진 탐색 알고리즘을 사용하지 않습니다. 이를 개선하기 위해, `low`와 `high` 변수를 사용하여 탐색 범위를 설정하고, 반복적으로 중간 값을猜测하여 범위를 좁혀가는 방식으로 구현할 수 있습니다. 예를 들어:
```java
public int guessNumber(int n) {
    int low = 1;
    int high = n;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        int result = guess(mid);
        if (result == 0) {
            return mid;
        } else if (result == -1) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    return -1; // 찾지 못한 경우
}
```
이러한 개선으로 시간 복잡도를 O(log n)으로 줄일 수 있습니다.
