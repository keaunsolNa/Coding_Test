# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오전 11:13:38 |
| Language | java |
| Runtime | 2 ms (Beats 0.0%) |
| Memory | 42.7 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(N)** : 문자열 `s` 를 뒤에서부터 한 번씩 순회하면서 각 문자(또는 `#`와 그 앞의 두 숫자)를 처리합니다. `N` 은 입력 문자열의 길이이며, 각 문자에 대해 상수 시간 연산만 수행하므로 전체 시간 복잡도는 선형입니다.

**2. 공간 복잡도**  
- **O(N)** : 결과를 저장하기 위해 `StringBuilder sb` 를 사용합니다. 최악의 경우 입력과 같은 길이의 문자열을 반환하므로 추가적인 힙 메모리는 `O(N)` 입니다. 입력을 직접 변형하지 않으므로 별도의 배열이나 컬렉션을 추가로 할당하지는 않습니다.

**3. 풀이 접근법**  
- 뒤에서부터 탐색하면서 `#` 가 나타나면 앞의 두 숫자를 합쳐 10~26에 해당하는 알파벳을 만든 뒤, `#` 과 두 숫자를 건너뛰고 결과에 추가합니다. `#` 가 없으면 단일 숫자를 1~9에 해당하는 알파벳으로 변환합니다.  
- 이 방식은 “뒤에서부터 읽으며 2자리 혹은 1자리 숫자를 결정한다”는 **그리디** 접근법이며, 문제의 규칙에 딱 맞는 가장 직관적인 방법입니다.

**4. 잘된 점**  
- **단순하고 직관적인 로직** : 뒤에서부터 순회하면서 `#` 여부만 체크하면 되므로 구현이 간결합니다.  
- **불필요한 자료구조 최소화** : `char[] arr` 로 한 번만 변환하고, 결과는 `StringBuilder` 로 바로 구축합니다.  
- **예외 상황을 잘 처리** : `i -= 2` 로 `#` 과 두 숫자를 건너뛰어 인덱스 오류를 방지합니다.

**5. 개선 사항**  
1. **문자 → 정수 변환 오류**  
   ```java
   int temp = Integer.parseInt(arr[i - 1] + "" + arr[i - 2]);
   char c = (char) (temp + '0');
   ```
   여기서 `temp + '0'` 은 숫자를 문자 `'0'`~`'9'` 로 바꾸는 것이 아니라, **알파벳** (`'a'`~`'z'`) 로 변환해야 합니다. 올바른 변환은  
   ```java
   char c = (char) ('a' + temp - 1);
   ```  
   와 같이 `temp` 를 1‑based 알파벳 인덱스로 바꾸는 것이 맞습니다. 현재 구현은 `'1'` → `'1'` 같은 잘못된 결과를 반환합니다.

2. **불필요한 `StringTokenizer` import**  
   사용되지 않는 `import java.util.StringTokenizer;` 는 제거해 주세요.

3. **가독성 향상**  
   - `arr[i] + "0"` 보다는 `arr[i] - '0'` 로 숫자를 바로 얻고, 이후 알파벳 변환을 하는 것이 명확합니다.  
   - `if (arr[i] == '#')` 블록과 `else` 블록에서 중복되는 `sb.append(c);` 를 공통으로 빼는 것도 고려해 볼 수 있습니다.

4. **결과 문자열 뒤집기**  
   현재는 뒤에서부터 `sb.append` 하여 역순 문자열이 만들어집니다. `StringBuilder` 를 사용한 뒤 `sb.reverse().toString()` 으로 한 번에 뒤집는 것이 더 직관적이며, `i--` 로 인덱스를 조정하면서 `sb.append` 하는 대신 `sb.insert(0, c)` 로 앞에 삽입하는 방법도 있습니다. 다만 `insert(0, …)` 는 O(N) 비용이 추가되므로 현재 방식이 더 효율적입니다.

5. **테스트 커버리지**  
   - `"#"` 가 문자열의 첫 번째에 오지 않는다는 전제는 문제에서 보장하지만, 방어적인 코드를 넣어 `i-2 >= 0` 을 확인하면 더 안전합니다.

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

위와 같이 수정하면 **정확성**과 **가독성**이 모두 향상됩니다. 전체적인 알고리즘 자체는 최적이며, 위 개선점만 적용하면 완벽한 풀이가 됩니다.
