# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 6. 17. 오후 9:06:00 |
| Language | java |
| Runtime | 3 ms (Beats 0.0%) |
| Memory | 42.7 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/is-subsequence/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n*m) - 이중 반복문을 사용하여 s 문자열의 각 문자마다 t 문자열을 순회하기 때문에 시간 복잡도가 O(n*m)입니다. 여기서 n은 s 문자열의 길이, m은 t 문자열의 길이입니다.

2. **공간 복잡도**: O(1) - 추가적인 공간을 사용하지 않기 때문에 공간 복잡도는 O(1)입니다. 단, System.out.println을 사용하여 문자열을 출력하는 경우에는 문자열을 저장하기 위한 공간이 필요하지만, 이는 입력 크기에 따라 변하지 않으므로 공간 복잡도에 영향을 미치지 않습니다.

3. **풀이 접근법**: 이중 반복문을 사용하여 s 문자열의 각 문자를 t 문자열에서 찾는 접근법을 사용했습니다. 하지만, 이 접근법은 효율적이지 않습니다. 더 효율적인 접근법은 두 개의 포인터를 사용하여 s와 t 문자열을 순회하는 것입니다.

4. **잘된 점**: 코드는 간단하고 이해하기 쉽습니다. 또한, System.out.println을 사용하여 디버깅을 쉽게 할 수 있습니다.

5. **개선 사항**: 
- 현재 코드는 s 문자열의 각 문자마다 t 문자열을 순회하기 때문에 시간 복잡도가 높습니다. 이를 개선하기 위해 두 개의 포인터를 사용하여 s와 t 문자열을 순회할 수 있습니다.
- cnt 변수의 초기값은 s.length()로 설정되어 있습니다. 하지만, cnt 변수는 s 문자열의 문자가 t 문자열에서 발견되는 횟수를 카운트하는 변수로 사용되고 있습니다. 따라서, cnt 변수의 초기값은 0으로 설정되어야 합니다.
- return 문은 cnt == 0인 경우에 true를 반환합니다. 하지만, s 문자열이 t 문자열의 서브시퀀스인 경우에 true를 반환해야 합니다. 따라서, return 문은 s.length() == cnt인 경우에 true를 반환해야 합니다.
- System.out.println을 사용하여 디버깅을 할 경우, 테스트 케이스에서 오류가 발생할 수 있습니다. 따라서, 디버깅을 완료한 후에는 System.out.println을 제거하는 것이 좋습니다.

다음은 개선된 코드입니다.
```java
class Solution {
    public boolean isSubsequence(String s, String t) {
        int index = 0;
        int cnt = 0;
        for (char c : s.toCharArray()) {
            for (int i = index; i < t.length(); i++) {
                if (t.charAt(i) == c) {
                    cnt++;
                    index = i + 1;
                    break;
                }
            }
        }
        return s.length() == cnt;
    }
}
```
또는, 더 효율적인 코드입니다.
```java
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
```
