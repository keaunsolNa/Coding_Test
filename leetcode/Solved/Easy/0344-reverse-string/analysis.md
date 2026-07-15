# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 15. 오후 12:50:58 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.7 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/reverse-string/submissions/)

## Code Review

리뷰 대상 코드는 문자열을 뒤집는 문제를 해결하기 위한 자바 솔루션입니다. 

1. **시간 복잡도**: 이 코드의 시간 복잡도는 O(n)입니다. 여기서 n은 입력 문자열의 길이입니다. 이유는 문자열의 모든 문자를 한 번씩 뒤에서 앞으로 읽어들이기 때문입니다.

2. **공간 복잡도**: 이 코드의 공간 복잡도는 O(n)입니다. 새로운 문자열을 생성하여 원본 문자열의 모든 문자를 복사하기 때문입니다.

3. **풀이 접근법**: 이 코드는 두 개의 포인터를 사용하지 않고, 단순히 새로운 문자열을 생성하여 뒤에서부터 앞으로 문자를 복사하는 방식으로 문자열을 뒤집습니다. 이는 기본적인 반복문을 사용한 접근법입니다.

4. **잘된 점**: 코드는 간단하고 이해하기 쉽습니다. 변수 이름이 명확하고, 반복문의 사용이 직관적입니다.

5. **개선 사항**: 현재 코드는 새로운 문자열을 생성하여 공간 복잡도를 높입니다. 더 효율적인 방법은 두 개의 포인터를 사용하여 원본 문자열을 직접 뒤집는 것입니다. 예를 들어, 한 포인터를 문자열의 시작 부분에, 다른 포인터를 문자열의 끝 부분에 위치시키고, 두 포인터가 만날 때까지 문자를 교환하는 방식입니다. 이렇게 하면 공간 복잡도를 O(1)으로 줄일 수 있습니다. 

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
