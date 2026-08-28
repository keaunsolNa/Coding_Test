# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오전 11:20:00 |
| Language | java |
| Runtime | 3 ms (Beats 19.7%) |
| Memory | 43.2 MB (Beats 20.5%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(N)** : 문자열 `s` 를 뒤에서부터 한 번씩만 탐색하므로 입력 길이 `N` 에 대해 선형 시간이다. `Integer.parseInt` 와 `StringBuilder.append` 도 각각 상수 시간에 수행된다.

**2. 공간 복잡도**  
- **O(N)** : 결과를 저장하기 위해 `StringBuilder sb` 를 사용한다. 최악의 경우 입력과 같은 길이의 문자열을 저장하므로 추가 공간은 `N` 이다. 입력 자체를 복사하지는 않는다.

**3. 풀이 접근법**  
- 뒤에서부터 순회하면서 `#` 가 나타나면 앞의 두 자리 숫자를 하나의 문자(`10~26`) 로 변환하고, `#` 가 없으면 한 자리 숫자를 바로 문자(`1~9`) 로 변환한다. 변환된 문자를 `StringBuilder` 에 차례대로 추가한 뒤, 최종적으로 `reverse()` 하여 올바른 순서를 만든다. 이는 “역방향 스캔 + 즉시 변환” 패턴이다.

**4. 잘된 점**  
- **역방향 스캔**을 이용해 `#` 로 표시된 2자리 숫자를 쉽게 처리한 점이 깔끔하고 효율적이다.  
- `StringBuilder` 를 사용해 문자열을 누적하고 마지막에 한 번만 `reverse()` 함으로써 불필요한 문자열 연결을 피했다.  
- `char` 를 직접 계산(`temp + 96`) 해서 `int` → `char` 변환을 명시적으로 수행한 점이 직관적이다.

**5. 개선 사항**  
1. **`Integer.parseInt` 사용 최소화**  
   - `arr[i-2]` 와 `arr[i-1]` 은 이미 문자 `'0'~'9'` 이므로 `temp = (arr[i-2]-'0')*10 + (arr[i-1]-'0')` 와 같이 직접 계산하면 `parseInt` 호출 비용을 없앨 수 있다.  

2. **한 자리 숫자 변환 오류**  
   - 현재 `char c = (char) (arr[i] + '0');` 로 변환하고 있는데, `arr[i]` 자체가 이미 문자 `'0'~'9'` 이다. `'0'` 을 다시 더하면 잘못된 문자 코드가 된다. 올바른 변환은 `char c = (char) (arr[i] - '0' + 96);` 혹은 `c = (char) (arr[i] - '0' + 'a');` 이어야 한다.  

3. **불필요한 `StringTokenizer` import**  
   - 사용되지 않는 `import java.util.StringTokenizer;` 를 제거한다.  

4. **가독성 향상**  
   - 상수 `96` 대신 `'a' - 1` 혹은 `('a' - 1)` 로 표현하면 의미가 명확해진다.  
   - `i -= 2;` 뒤에 `continue;` 를 넣어 루프 흐름을 명확히 할 수 있다.  

5. **예외 상황 처리**  
   - 입력이 항상 유효하다고 가정하지만, `i-2` 가 음수가 되는 경우(잘못된 입력) 에 대한 방어 코드를 추가하면 더 견고한 구현이 된다.  

**수정 예시 (핵심 부분만)**  

```java
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
```

위와 같이 수정하면 시간·공간 복잡도는 동일하면서도 실행 속도가 약간 개선되고, 코드 가독성 및 정확성이 향상됩니다.
