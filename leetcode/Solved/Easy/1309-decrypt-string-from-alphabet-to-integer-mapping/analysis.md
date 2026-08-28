# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오전 11:16:39 |
| Language | java |
| Runtime | 2 ms (Beats 0.0%) |
| Memory | 42.8 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(N)** : 문자열 `s` 를 뒤에서부터 한 번씩 순회하면서 문자 하나 혹은 두 개와 `#` 를 처리합니다. `N` 은 입력 문자열의 길이이며, 각 문자를 상수 시간에 처리하므로 전체 시간 복잡도는 선형입니다.

**2. 공간 복잡도**  
- **O(N)** : 결과를 저장하기 위해 `StringBuilder sb` 를 사용합니다. 최악의 경우 입력과 같은 길이의 문자열을 저장하므로 추가 공간은 `O(N)` 입니다. 입력 배열 `arr` 도 `O(N)` 이지만 이는 입력 자체를 복사한 것이므로 보조 공간으로는 `O(N)` 로 볼 수 있습니다.

**3. 풀이 접근법**  
- 뒤에서부터 탐색하면서 `#` 가 나타나면 앞의 두 숫자를 하나의 문자(`10~26`)로 변환하고, `#` 가 없으면 단일 숫자(`1~9`)를 변환합니다.  
- 변환된 문자를 `StringBuilder` 에 역순으로 추가한 뒤, 최종적으로 `reverse()` 하여 올바른 순서를 만든다. 이는 **스택/역순 탐색** 패턴을 이용한 전형적인 풀이입니다.

**4. 잘된 점**  
- 뒤에서부터 탐색함으로써 `#` 로 표시된 2자리 숫자를 쉽게 처리한 점이 깔끔합니다.  
- `StringBuilder` 를 사용해 문자열을 효율적으로 누적하고, 마지막에 한 번만 `reverse()` 하여 O(N) 시간 안에 올바른 결과를 얻었습니다.  
- `char[] arr = s.toCharArray();` 로 배열을 만든 뒤 인덱스로 직접 접근해 불필요한 문자열 연산을 피한 점도 좋습니다.

**5. 개선 사항**  
1. **문자 변환 로직 오류**  
   - 현재 `char c = (char) (temp + 26 + '0');` 와 `char c = (char) (arr[i] + 26 + '0');` 로 변환하고 있는데, 이는 ASCII 코드 `'0'` 에 26을 더해 버려 잘못된 문자(`'{'` 등)를 만든다.  
   - 올바른 변환은 `char c = (char) ('a' + temp - 1);` (또는 `temp - 1 + 'a'`) 와 같이 `'a'` 를 기준으로 해야 합니다.

2. **불필요한 `StringTokenizer` import**  
   - 사용되지 않는 `import java.util.StringTokenizer;` 는 제거하여 코드 가독성을 높입니다.

3. **예외 상황 처리**  
   - `i-2` 가 음수가 되는 경우(예: 입력이 `"#"` 로 시작) `ArrayIndexOutOfBoundsException` 이 발생할 수 있습니다. 문제 조건상 이런 입력은 없지만, 방어적 코딩을 위해 `i >= 2` 를 확인하는 것이 안전합니다.

4. **불필요한 `System.out.println`**  
   - 디버깅용 `println` 은 제출 코드에 남겨두면 시간 초과 혹은 출력 오염을 일으킬 수 있으니 제거합니다.

5. **코드 간결화**  
   - `if (arr[i] == '#') { … } else { … }` 내부에서 중복되는 변환 로직을 메서드(`decode(int num)`) 로 추출하면 가독성이 향상됩니다.

**수정 예시 (핵심 부분만)**  

```java
class Solution {
    public String freqAlphabets(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == '#') {
                int num = (arr[i - 2] - '0') * 10 + (arr[i - 1] - '0');
                sb.append((char) ('a' + num - 1));
                i -= 2;
            } else {
                int num = arr[i] - '0';
                sb.append((char) ('a' + num - 1));
            }
        }
        return sb.reverse().toString();
    }
}
```

위와 같이 수정하면 논리 오류가 사라지고, 가독성과 안정성도 동시에 개선됩니다.
