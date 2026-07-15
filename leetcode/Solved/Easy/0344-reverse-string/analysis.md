# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 15. 오후 12:53:12 |
| Language | java |
| Runtime | 3 ms (Beats 0.0%) |
| Memory | 43 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/reverse-string/submissions/)

## Code Review

리뷰 대상 코드는 문자열을 반전시키는 문제를 해결하기 위한 자바 솔루션입니다. 

1. **시간 복잡도**: O(n) - 코드는 입력 문자열의 길이(n)에 비례하는 시간을 소요합니다. 이는 문자열의 모든 문자를 한 번씩 처리하기 때문입니다.

2. **공간 복잡도**: O(n) - 코드는 입력 문자열의 길이(n)에 비례하는 추가적인 메모리를 사용합니다. 이는 문자열을 반전시키기 위해 새로운 배열을 생성하기 때문입니다.

3. **풀이 접근법**: 두 개의 포인터를 사용하지 않고, 새로운 배열을 생성하여 문자열을 반전시키는 방법을 사용했습니다. 이는 기본적인 반복문을 사용한 접근법입니다.

4. **잘된 점**: 코드는 간단명료하며, 문제의 요구사항을 충족합니다. 또한, 중간 결과를 출력하는 부분이 있어 디버깅에 도움이 될 수 있습니다.

5. **개선 사항**: 현재 코드는 새로운 배열을 생성하여 문자열을 반전시키기 때문에, 공간 복잡도가 높습니다. 이를 개선하기 위해, 두 개의 포인터를 사용하여 원래 배열에서 문자열을 반전시키는 방법을 사용할 수 있습니다. 예를 들어, 한 포인터를 시작 지점에 두고, 다른 포인터를 끝 지점에 두어, 두 포인터가 만날 때까지 문자를 교환하는 방식입니다. 이 방법은 공간 복잡도를 O(1)로 줄일 수 있습니다. 또한, System.out.println 문은 디버깅 목적으로 사용하는 것이 좋으며, 실제 솔루션에서는 제거하는 것이 좋습니다. 

```java
class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
```
