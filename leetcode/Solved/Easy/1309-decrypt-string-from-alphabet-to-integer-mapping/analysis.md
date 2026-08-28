# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오전 11:17:51 |
| Language | java |
| Runtime | 2 ms (Beats 0.0%) |
| Memory | 43.1 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(N)** : 문자열 `s` 를 뒤에서부터 한 번씩 순회하면서 문자 하나 혹은 두 개와 `#` 를 처리합니다. `N` 은 입력 문자열 길이이며, 각 문자에 대해 상수 시간 연산만 수행하므로 선형 시간 복잡도입니다.

**2. 공간 복잡도**  
- **O(N)** : 결과를 저장하기 위해 `StringBuilder sb` 를 사용합니다. 최악의 경우 입력과 같은 길이의 문자열을 저장하므로 추가적인 선형 공간이 필요합니다. 입력 배열 `arr` 도 `O(N)` 공간을 차지합니다.

**3. 풀이 접근법**  
- 뒤에서부터 탐색하면서 `#` 가 나타나면 앞의 두 숫자를 하나의 2자리 수로 해석하고, 그렇지 않으면 1자리 수를 바로 문자로 변환합니다.  
- 숫자를 문자로 바꾸는 과정에서 `temp + 97 + '0'` 와 같이 ASCII 값을 직접 계산하는 방식을 사용했습니다. 마지막에 `sb.reverse()` 로 뒤에서 만든 문자열을 올바른 순서로 되돌립니다.

**4. 잘된 점**  
- 뒤에서부터 탐색함으로써 `#` 가 있는 2자리 숫자와 1자리 숫자를 구분하는 로직을 간결하게 구현했습니다.  
- `StringBuilder` 를 사용해 문자열을 효율적으로 누적하고, 최종에 한 번만 `reverse()` 하여 O(N) 시간 안에 올바른 결과를 얻었습니다.  
- `int temp = Integer.parseInt(arr[i - 2] + "" + arr[i - 1]);` 로 2자리 숫자를 손쉽게 파싱한 점도 가독성이 좋습니다.

**5. 개선 사항**  
1. **문자 변환 로직 오류**  
   - 현재 `char c = (char) (temp + 97 + '0');` 와 `char c = (char) (arr[i] + 97 + '0');` 는 올바른 알파벳을 만들지 못합니다.  
   - 올바른 변환은 `char c = (char) ('a' + temp - 1);` (2자리 경우)와 `char c = (char) ('a' + (arr[i] - '0') - 1);` (1자리 경우) 입니다. `'0'` 을 더하는 방식은 숫자를 문자 코드로 바꾸는 것이 아니라, 실제 알파벳 인덱스를 구해야 합니다.

2. **불필요한 `StringTokenizer` import**  
   - 코드 상단에 `import java.util.StringTokenizer;` 가 있지만 사용되지 않으므로 제거해도 됩니다.

3. **예외 상황 처리**  
   - 입력이 항상 유효하다고 가정하지만, `i-2` 가 음수가 되는 경우(예: 문자열이 `#` 로 시작) 를 방지하기 위해 범위 검사를 추가하면 더 안전합니다.

4. **불필요한 `System.out.println`**  
   - 디버깅용 `System.out.println(temp);` 은 최종 제출 코드에선 제거해야 합니다. 출력이 많아지면 성능에 영향을 줄 수 있습니다.

5. **코드 간결화**  
   - `char[] arr = s.toCharArray();` 대신 `charAt` 을 직접 사용해도 되며, `StringBuilder` 를 미리 충분한 용량(`new StringBuilder(s.length())`) 으로 생성하면 약간의 메모리 재할당을 방지할 수 있습니다.

**수정된 핵심 부분 예시**

```java
class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder(s.length());

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                int num = (s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0');
                sb.append((char) ('a' + num - 1));
                i -= 2;
            } else {
                int num = s.charAt(i) - '0';
                sb.append((char) ('a' + num - 1));
            }
        }
        return sb.reverse().toString();
    }
}
```

위와 같이 수정하면 논리 오류가 사라지고, 가독성과 효율성 모두 향상됩니다.
