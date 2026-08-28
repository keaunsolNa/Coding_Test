# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오전 11:15:41 |
| Language | java |
| Runtime | 1 ms (Beats 0.0%) |
| Memory | 42.8 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(N)** : 문자열 `s` 를 뒤에서부터 한 번씩 순회하면서 문자 하나씩 처리합니다. `N` 은 입력 문자열의 길이이며, 각 문자에 대해 상수 시간 연산만 수행하므로 전체 시간 복잡도는 선형입니다.

**2. 공간 복잡도**  
- **O(N)** : 결과를 저장하기 위해 `StringBuilder sb` 를 사용합니다. 최악의 경우 입력과 같은 길이의 문자열을 저장하므로 추가 공간은 `O(N)` 입니다. 입력을 별도로 복사하거나 추가적인 배열을 만들지는 않았습니다.

**3. 풀이 접근법**  
- 뒤에서부터 탐색하면서 `#` 가 나타나면 바로 앞의 두 숫자를 하나의 2자리 수로 해석하고, `#` 가 없으면 1자리 수를 그대로 해석합니다.  
- 해석된 숫자를 문자 `'a'~'z'` 로 변환하기 위해 `temp + '0'` 로 계산한 뒤 `StringBuilder` 에 추가하고, 마지막에 `reverse()` 로 순서를 되돌립니다.  
- 이는 “뒤에서부터 읽으며 2자리·1자리 구분”이라는 전형적인 **그리디** 방식입니다.

**4. 잘된 점**  
- **단순하고 직관적인 로직** : 뒤에서부터 처리함으로써 `#` 로 구분된 2자리 숫자를 쉽게 판단할 수 있습니다.  
- **불필요한 자료구조 최소화** : `char[]` 로 변환 후 바로 인덱스로 접근해 메모리 사용을 최소화했습니다.  
- **가독성** : `if (arr[i] == '#')` 로 분기점을 명확히 하여 흐름을 이해하기 쉽습니다.  

**5. 개선 사항**  
1. **문자 변환 오류**  
   - 현재 `char c = (char) (temp + '0');` 와 `char c = (char) (arr[i] + '0');` 는 숫자를 `'0'` 에 더하는 방식이라 `'a'~'z'` 가 아니라 `'0'~'9'` 범위의 문자로 변환됩니다.  
   - 올바른 변환은 `char c = (char) ('a' + temp - 1);` (예: 1 → 'a', 26 → 'z') 로 바꿔야 합니다.  

2. **불필요한 `StringTokenizer` import**  
   - 사용되지 않는 `import java.util.StringTokenizer;` 는 제거하여 코드 깨끗함을 유지합니다.  

3. **`System.out.println(temp);` 디버그 출력**  
   - 실제 제출 코드에서는 출력문이 불필요하므로 삭제해야 합니다.  

4. **`StringBuilder` 를 역순으로 채우기**  
   - 현재는 뒤에서부터 추가하고 마지막에 `reverse()` 를 호출합니다.  
   - 대신 `sb.insert(0, c);` 로 앞에 바로 삽입하거나, `char[] result = new char[...];` 에 인덱스를 역순으로 채워 `new String(result)` 로 반환하면 `reverse()` 호출을 없앨 수 있어 약간의 성능 향상이 가능합니다.  

5. **예외 상황 처리**  
   - 입력이 항상 유효하다고 가정하지만, `i-2` 가 음수가 되는 경우(예: 문자열이 `"#"` 로 시작) 를 방지하기 위해 경계 검사를 추가하면 더 견고합니다.  

**수정된 핵심 코드 예시**

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

위와 같이 수정하면 논리 오류가 해결되고, 불필요한 코드가 제거되어 가독성과 성능이 모두 향상됩니다.
