# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오전 11:19:07 |
| Language | java |
| Runtime | 3 ms (Beats 0.0%) |
| Memory | 44.4 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(N)** : 문자열 `s` 를 뒤에서부터 한 번씩만 탐색하므로 입력 길이 `N` 에 대해 선형 시간 복잡도를 가집니다. `Integer.parseInt` 와 같은 연산도 상수 시간에 수행됩니다.

**2. 공간 복잡도**  
- **O(N)** : 결과를 저장하기 위한 `StringBuilder sb` 가 최악의 경우 입력과 같은 길이의 문자열을 저장합니다. 추가적인 보조 배열(`char[] arr`)도 입력 길이와 동일하므로 전체 공간 복잡도는 선형입니다.

**3. 풀이 접근법**  
- 뒤에서부터 탐색하면서 `#` 가 나타나면 앞의 두 자리 숫자를 하나의 문자(`10~26`)로 변환하고, `#` 가 없으면 한 자리 숫자를 바로 문자(`1~9`)로 변환합니다. 변환된 문자를 `StringBuilder`에 차례대로 추가한 뒤, 최종적으로 `reverse()` 하여 올바른 순서를 만든다. 이는 **그리디** 방식이며, 한 번의 패스만으로 문제를 해결합니다.

**4. 잘된 점**  
- **단일 패스** 로 문제를 해결해 시간 효율성을 확보했습니다.  
- `StringBuilder` 를 사용해 문자열 연결 비용을 최소화했습니다.  
- `#` 를 기준으로 2자리 숫자를 정확히 처리하는 로직이 명확합니다.  
- 디버깅용 `System.out.println` 을 넣어 변환 과정을 확인하려는 시도가 좋지만, 실제 제출 코드에서는 제거하는 것이 바람직합니다.

**5. 개선 사항**  
1. **문자 변환 오류**  
   - `else` 블록에서 `char c = (char) (arr[i] + '0');` 로 변환하고 있는데, `arr[i]` 자체가 이미 문자 `'1'~'9'` 이므로 `'0'` 을 더하면 잘못된 ASCII 값이 됩니다.  
   - 올바른 변환은 `char c = (char) (arr[i] - '0' + 'a');` 혹은 `int num = arr[i] - '0'; char c = (char) (num + 'a');` 와 같이 해야 합니다.

2. **불필요한 `StringTokenizer` import**  
   - 사용되지 않는 `import java.util.StringTokenizer;` 는 제거하세요.

3. **`Integer.parseInt` 사용 최소화**  
   - 두 자리 숫자를 직접 계산하면 `parseInt` 호출 오버헤드를 없앨 수 있습니다.  
     ```java
     int temp = (arr[i-2] - '0') * 10 + (arr[i-1] - '0');
     ```
   - 이렇게 하면 문자열 생성 없이 정수 변환이 가능해 약간의 성능 향상이 있습니다.

4. **`reverse()` 호출 최소화**  
   - 현재는 뒤에서부터 결과를 `append` 한 뒤 `reverse()` 를 호출합니다.  
   - 앞에서부터 결과를 바로 `insert(0, c)` 로 넣어도 가능하지만, `insert` 는 O(N) 비용이므로 현재 방식이 더 효율적입니다. 따라서 `reverse()` 를 유지하는 것이 좋습니다.

5. **예외 상황 처리**  
   - 입력이 항상 유효하다고 가정하지만, `i-2` 가 음수가 되는 경우(잘못된 입력) 에 대한 방어 코드를 추가하면 코드가 더 견고해집니다.

**수정된 핵심 코드 예시**

```java
class Solution {
    public String freqAlphabets(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == '#') {
                int num = (arr[i - 2] - '0') * 10 + (arr[i - 1] - '0');
                sb.append((char) (num + 'a' - 1));
                i -= 2;
            } else {
                int num = arr[i] - '0';
                sb.append((char) (num + 'a' - 1));
            }
        }
        return sb.reverse().toString();
    }
}
```

위와 같이 수정하면 논리 오류를 방지하고, 불필요한 객체 생성과 import 를 없앨 수 있어 가독성과 성능이 모두 개선됩니다.
