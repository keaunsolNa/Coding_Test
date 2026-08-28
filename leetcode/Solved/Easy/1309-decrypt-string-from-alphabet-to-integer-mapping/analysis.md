# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오전 11:14:18 |
| Language | java |
| Runtime | 2 ms (Beats 0.0%) |
| Memory | 42.7 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(N)** : 문자열 `s` 를 뒤에서부터 한 번씩만 탐색하므로 입력 길이 `N` 에 대해 선형 시간이다. `Integer.parseInt` 와 같은 연산도 상수 시간에 수행된다.

**2. 공간 복잡도**  
- **O(N)** : 결과를 저장하기 위해 `StringBuilder sb` 를 사용한다. 최악의 경우 입력과 같은 길이의 문자열을 반환하므로 추가 공간은 `O(N)` 이다. 입력을 별도로 복사하지 않으므로 추가적인 힙 사용은 거의 없다.

**3. 풀이 접근법**  
- 뒤에서부터 탐색하면서 `#` 가 나타나면 바로 앞의 두 숫자를 하나의 2자리 수로 해석하고, `#` 가 없으면 1자리 수를 그대로 해석한다.  
- 이렇게 하면 `10#~26#` 과 `1~9` 를 동시에 처리할 수 있다.  
- 해석된 정수를 문자 `'a'~'z'` 로 변환하기 위해 ASCII 코드 연산을 사용한다.

**4. 잘된 점**  
- **역방향 탐색**을 통해 `#` 를 만나면 바로 앞의 두 자리만 확인하면 되므로 구현이 간결하고 불필요한 문자열 슬라이싱을 피했다.  
- `StringBuilder` 로 결과를 차례대로 붙여서 문자열 연결 비용을 최소화했다.  
- `char[] arr = s.toCharArray();` 로 배열에 한 번만 변환해 반복 접근을 빠르게 했다.

**5. 개선 사항**  
1. **문자 변환 오류**  
   - 현재 `char c = (char) (temp + '0');` 와 `char c = (char) (arr[i] + '0');` 로 변환하고 있다. `'0'` 을 더하면 숫자 1~26 에 대해 `'a'`~`'z'` 가 아니라 `'1'`~`'9'` 등 잘못된 문자 코드가 나온다. 올바른 변환은  
     ```java
     char c = (char) ('a' + temp - 1);
     ```  
     와 같이 `temp` 를 `'a'` 기준으로 오프셋을 적용해야 한다.

2. **불필요한 `StringTokenizer` import**  
   - 사용되지 않는 `import java.util.StringTokenizer;` 는 제거한다.

3. **`Integer.parseInt` 사용 최소화**  
   - 두 자리 숫자를 직접 계산하면 `parseInt` 호출 비용을 없앨 수 있다. 예:  
     ```java
     int temp = (arr[i-2] - '0') * 10 + (arr[i-1] - '0');
     ```

4. **결과 문자열 뒤집기**  
   - 현재 뒤에서부터 `sb.append` 로 추가하면 최종 문자열이 뒤집힌 상태가 된다. `sb.reverse()` 를 호출하거나, 앞에서부터 `sb.insert(0, c)` 로 삽입하면 뒤집는 과정을 없앨 수 있다. `reverse()` 한 번 호출하는 것이 더 효율적이다.

5. **예외 상황 처리**  
   - 입력이 비어 있거나 `#` 가 문자열 앞에 잘못 위치하는 경우 `ArrayIndexOutOfBoundsException` 이 발생할 수 있다. 입력이 문제 조건을 만족한다는 전제는 좋지만, 방어적 코딩을 위해 경계 검사를 추가하면 안전하다.

**수정된 예시 코드**

```java
class Solution {
    public String freqAlphabets(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == '#') {
                int num = (arr[i - 2] - '0') * 10 + (arr[i - 1] - '0');
                sb.append((char) ('a' + num - 1));
                i -= 2;                     // 추가로 건너뛰기
            } else {
                int num = arr[i] - '0';
                sb.append((char) ('a' + num - 1));
            }
        }
        return sb.reverse().toString();   // 뒤집어서 반환
    }
}
```

위와 같이 수정하면 논리 오류가 사라지고, 불필요한 연산과 import 를 제거해 가독성과 성능이 모두 향상됩니다.
