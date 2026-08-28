# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오전 11:16:08 |
| Language | java |
| Runtime | 2 ms (Beats 0.0%) |
| Memory | 42.8 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(N)** : 문자열 `s`를 뒤에서부터 한 번씩 순회하면서 각 문자(또는 `#`와 그 앞의 두 숫자)를 처리합니다. `N`은 입력 문자열의 길이이며, 각 문자를 상수 시간에 처리하므로 전체 시간 복잡도는 선형입니다.

**2. 공간 복잡도**  
- **O(N)** : 결과를 저장하기 위해 `StringBuilder sb`를 사용합니다. 최악의 경우 입력과 같은 길이의 문자열을 저장하므로 추가 공간은 입력 크기에 비례합니다. 그 외에 별도의 배열이나 컬렉션을 사용하지 않으므로 보조 공간은 상수 수준입니다.

**3. 풀이 접근법**  
- 뒤에서부터 탐색하면서 `#`가 나타나면 바로 앞의 두 숫자를 합쳐 10~26에 해당하는 알파벳을 만든 뒤, `#`과 두 숫자를 건너뛰고 진행합니다. `#`가 없으면 단일 숫자를 1~9에 해당하는 알파벳으로 변환합니다. 변환된 문자들을 `StringBuilder`에 역순으로 추가한 뒤, 최종적으로 `reverse()` 하여 올바른 순서를 얻는 방식입니다. 이는 “역방향 스캔 + 바로 변환”이라는 전형적인 Greedy 패턴입니다.

**4. 잘된 점**  
- **역방향 스캔**을 이용해 `#`와 두 숫자를 한 번에 처리함으로써 복잡한 인덱스 관리 없이 간결하게 구현했습니다.  
- `StringBuilder`를 사용해 문자열을 효율적으로 누적하고, 마지막에 한 번만 `reverse()` 함으로써 O(N) 시간 안에 올바른 결과를 얻었습니다.  
- `char[] arr = s.toCharArray();` 로 한 번만 문자열을 배열로 변환해 반복문 안에서 `charAt` 호출 비용을 줄인 점도 좋습니다.

**5. 개선 사항**  
1. **문자 변환 로직 오류**  
   - 현재 `int temp = Integer.parseInt(arr[i - 2] + "" + arr[i - 1]) + 1;` 로 10~26을 구하고, `char c = (char) (temp + '0');` 로 문자 코드를 만든다.  
   - `'0'`을 더하면 `'0'~'9'` 범위의 문자 코드가 되므로 `'a'~'z'`가 아니라 숫자 문자('1','2',…)가 출력됩니다. 올바른 변환은 `char c = (char) ('a' + temp - 1);` 이어야 합니다.  
   - 동일하게 `else` 절에서도 `char c = (char) (arr[i] + '0');` 대신 `char c = (char) ('a' + (arr[i] - '0') - 1);` 로 바꿔야 합니다.

2. **불필요한 `System.out.println`**  
   - 디버깅용 출력은 제출 코드에 남겨두면 시간 초과 혹은 출력 오염을 일으킬 수 있습니다. 제거하거나 주석 처리하세요.

3. **`StringTokenizer` import 제거**  
   - 사용되지 않는 `import java.util.StringTokenizer;` 는 불필요하므로 삭제해 코드 가독성을 높이세요.

4. **예외 상황 처리**  
   - 입력이 항상 유효하다고 가정해도, `i-2`가 음수가 되는 경우(예: 문자열이 `"#"`만 있거나 `"#"` 앞에 충분한 숫자가 없을 때) `ArrayIndexOutOfBoundsException`이 발생할 수 있습니다. 문제 제한에 맞지만, 안전하게 `i >= 2` 조건을 명시하면 더 견고합니다.

5. **대안적 구현**  
   - `for`문을 앞에서부터 진행하면서 `i+2 < n && s.charAt(i+2) == '#'` 를 확인하는 방식도 가능하며, 이 경우 `StringBuilder`에 바로 `append`하고 `i += 3` 혹은 `i++` 로 이동하면 `reverse()` 없이도 올바른 순서를 얻을 수 있습니다. 이는 가독성을 약간 높일 수 있습니다.

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
                i -= 2;
            } else {
                int num = arr[i] - '0'; // 1~9
                sb.append((char) ('a' + num - 1));
            }
        }
        return sb.reverse().toString();
    }
}
```

위와 같이 수정하면 시간·공간 복잡도는 그대로 유지하면서 올바른 알파벳 문자열을 반환합니다.
