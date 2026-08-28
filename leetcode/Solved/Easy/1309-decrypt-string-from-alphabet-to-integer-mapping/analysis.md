# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오전 11:12:44 |
| Language | java |
| Runtime | 2 ms (Beats 0.0%) |
| Memory | 43 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(N)** : 문자열 `s` 를 뒤에서부터 한 번씩만 순회하므로 입력 길이 `N` 에 대해 선형 시간이다. `Integer.parseInt` 와 같은 연산도 상수 시간에 수행된다.

**2. 공간 복잡도**  
- **O(N)** : 결과를 저장하기 위해 `StringBuilder` 를 사용하고, 최악의 경우 결과 문자열 길이가 입력과 동일하므로 추가적인 선형 공간이 필요하다. 입력을 `char[]` 로 복사하는 부분도 O(N) 공간을 차지한다.

**3. 풀이 접근법**  
- 뒤에서부터 탐색하면서 `#` 가 나오면 앞의 두 자리 숫자를 하나의 문자(`10~26`)로 변환하고, `#` 가 없으면 한 자리 숫자를 바로 문자(`1~9`)로 변환한다.  
- 숫자를 문자로 바꾸는 식은 `char c = (char) (value - 'a')` 로 구현했으며, 변환된 문자를 `StringBuilder` 에 뒤쪽부터 추가한다(역순으로 만든 뒤 최종 반환).

**4. 잘된 점**  
- **역방향 탐색**을 이용해 `#` 를 만나면 바로 앞 두 자리만 확인하면 되므로 로직이 간결하고 불필요한 스캔을 피한다.  
- `StringBuilder` 를 사용해 문자열을 효율적으로 누적한다.  
- `char[]` 로 변환해 배열 인덱스를 직접 접근함으로써 인덱스 연산이 빠르고 가독성이 좋다.  

**5. 개선 사항**  
1. **문자 변환 로직 오류**  
   ```java
   char c = (char) (temp - 'a');
   ```
   현재는 `temp - 'a'` 로 계산하고 있어 `'a'`(97) 를 빼는 것이 아니라 `temp - 97` 가 된다.  
   올바른 변환은 `temp + 'a' - 1` 이어야 한다. 예: `temp = 1` → `'a'` (`1 + 96`).  
   동일하게 한 자리 숫자 처리에서도 `arr[i] - 'a'` 가 아니라 `arr[i] - '0' + 'a' - 1` 로 고쳐야 한다.

2. **불필요한 `StringTokenizer` import**  
   사용되지 않는 `import java.util.StringTokenizer;` 는 제거한다.

3. **`StringBuilder` 결과 뒤집기**  
   현재는 역순으로 문자를 `append` 하여 최종 문자열이 뒤집힌 상태가 된다.  
   - `sb.reverse().toString()` 을 반환하거나,  
   - `sb.insert(0, c)` 로 앞에 삽입하는 방법을 사용할 수 있다.  
   현재 코드는 뒤집히지 않은 문자열을 반환하므로 테스트에서 오답이 나온다.

4. **예외 상황 처리**  
   입력이 항상 유효하다고 가정하지만, `i-2` 가 음수가 되는 경우(예: `"#"` 로 시작) `ArrayIndexOutOfBoundsException` 이 발생할 수 있다.  
   간단히 `if (i >= 2 && arr[i] == '#')` 로 guard 를 추가하면 안전하다.

5. **코드 간결화**  
   `Integer.parseInt(arr[i-1] + "" + arr[i-2])` 대신  
   ```java
   int num = (arr[i-2] - '0') * 10 + (arr[i-1] - '0');
   ```  
   로 직접 숫자를 만들면 문자열 생성 비용을 없앨 수 있다.

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

위와 같이 수정하면 논리 오류와 성능상의 작은 비효율을 모두 해결할 수 있다.
