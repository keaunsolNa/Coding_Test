# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오전 11:15:12 |
| Language | java |
| Runtime | 2 ms (Beats 0.0%) |
| Memory | 42.7 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(N)** : 문자열 `s` 를 뒤에서부터 한 번씩 순회하면서 각 문자(또는 `#`와 그 앞의 두 자리 숫자)를 처리합니다. `N` 은 입력 문자열의 길이이며, 각 문자를 상수 시간에 처리하므로 전체 시간 복잡도는 선형입니다.

**2. 공간 복잡도**  
- **O(N)** : 결과를 저장하기 위해 `StringBuilder sb` 를 사용합니다. 최악의 경우 입력과 같은 길이의 문자열을 저장하므로 추가 공간은 `O(N)` 입니다. (입력 자체를 제외한 보조 공간은 `O(1)` 에 가깝습니다.)

**3. 풀이 접근법**  
- 뒤에서부터 탐색하면서 `#` 가 나타나면 바로 앞의 두 숫자를 하나의 2자리 수로 해석하고, `#` 가 없으면 1자리 수를 그대로 해석합니다.  
- 숫자를 문자로 변환할 때는 `temp + '0'` 혹은 `arr[i] + '0'` 로 ASCII 값을 조정하는 방식을 사용했습니다.  
- 마지막에 `StringBuilder` 를 `reverse()` 하여 올바른 순서의 문자열을 반환합니다.  

**4. 잘된 점**  
- **역방향 탐색**을 이용해 `#` 뒤에 오는 2자리 숫자를 바로 처리함으로써 복잡한 인덱스 관리 없이 간결하게 구현했습니다.  
- `StringBuilder` 를 사용해 문자열을 효율적으로 누적하고, 최종 `reverse()` 로 순서를 맞춘 점이 메모리와 시간 면에서 적절합니다.  
- `char[] arr = s.toCharArray();` 로 배열을 만든 뒤 인덱스로 접근해 `String.charAt` 보다 약간 더 빠른 접근을 시도한 점도 긍정적입니다.  

**5. 개선 사항**  

| 문제점 | 개선 방법 |
|--------|----------|
| **문자 → 정수 변환 로직 오류**<br>`(char) (temp + '0')` 와 `(char) (arr[i] + '0')` 은 실제 알파벳 `'a'~'z'` 를 만들지 못합니다. `'a'`는 97이고, `temp` 은 1~26이므로 `'a'` 를 기준으로 `temp + 'a' - 1` 로 변환해야 합니다. | ```java<br>char c = (char) ('a' + temp - 1);<br>```<br>그리고 1자리 경우에도 `char c = (char) ('a' + (arr[i] - '0') - 1);` 로 수정합니다. |
| **불필요한 `StringTokenizer` import** | 사용되지 않는 import 문은 제거합니다. |
| **디버그용 `System.out.println(temp);`** | 제출 코드에서는 제거하거나 로그 레벨을 조절합니다. |
| **인덱스 경계 검사 부재** | 입력이 항상 유효하다고 가정하지만, 안전하게 `i-2 >= 0` 을 확인하면 더 견고합니다. |
| **`char` 연산에 `'0'` 사용** | 현재 방식은 숫자를 문자 `'0'~'9'` 로 변환하려는 의도와 혼동될 수 있습니다. 알파벳 매핑이라는 목적에 맞게 명확히 주석을 달거나 변수명을 바꾸는 것이 좋습니다. |
| **코드 가독성** | `if (arr[i] == '#')` 블록과 `else` 블록에서 중복되는 변환 로직을 메서드(`decode(int num)`) 로 추출하면 가독성이 향상됩니다. |

**수정된 핵심 코드 예시**

```java
class Solution {
    public String freqAlphabets(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == '#') {
                int num = (arr[i - 2] - '0') * 10 + (arr[i - 1] - '0'); // 10~26
                sb.append((char) ('a' + num - 1));
                i -= 2; // # 과 두 숫자를 모두 건너뛰기
            } else {
                int num = arr[i] - '0'; // 1~9
                sb.append((char) ('a' + num - 1));
            }
        }
        return sb.reverse().toString();
    }
}
```

위와 같이 수정하면 **정확한 알파벳 매핑**과 **불필요한 연산 제거**가 이루어져 가독성·성능 모두 개선됩니다.
