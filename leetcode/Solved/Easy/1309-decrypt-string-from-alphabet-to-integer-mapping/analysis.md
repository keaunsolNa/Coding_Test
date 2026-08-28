# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오전 11:19:51 |
| Language | java |
| Runtime | 2 ms (Beats 0.0%) |
| Memory | 44.8 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(N)** : 문자열 `s`를 뒤에서부터 한 번씩 순회하면서 `#` 여부만 확인하고, `#`가 있으면 두 글자를 추가로 건너뛰기 때문에 전체 길이 `N`에 비례하는 선형 시간이다.  

**2. 공간 복잡도**  
- **O(N)** : 결과를 저장하기 위해 `StringBuilder sb`를 사용하고, 최종 문자열을 반환하기 위해 `sb.reverse()` 결과를 새 문자열로 만든다. 입력 길이와 같은 크기의 추가 메모리를 사용한다.  

**3. 풀이 접근법**  
- 뒤에서부터 탐색하면서 `#`가 나타나면 앞의 두 숫자를 하나의 2자리 수(`10~26`)로 변환하고, `#`가 없으면 한 자리 수(`1~9`)를 바로 문자로 변환한다.  
- 변환은 `int` → `char` 로 `(temp + 96)`(ASCII `'a'`가 97) 를 이용해 수행한다.  

**4. 잘된 점**  
- **뒤에서부터 탐색**하는 아이디어가 `#`가 붙은 2자리 수와 1자리 수를 구분하기에 가장 직관적이며, 복잡한 인덱스 관리 없이 구현이 간단하다.  
- `StringBuilder`를 사용해 문자열을 효율적으로 누적하고, 마지막에 `reverse()` 로 올바른 순서를 만든 점이 좋다.  
- `Integer.parseInt(arr[i-2] + "" + arr[i-1])` 로 두 문자 배열을 바로 정수로 변환하는 방법이 간결하다.  

**5. 개선 사항**  
1. **불필요한 `System.out.println` 제거**  
   - 디버깅용 출력은 제출 코드에 남겨두면 시간 초과 혹은 불필요한 I/O 비용이 발생한다.  

2. **`char c = (char) (arr[i] + '0');` 오류**  
   - 현재 코드는 `arr[i]`(문자 `'1'~'9'`)에 `'0'`(48)을 더해 잘못된 문자 코드를 만든다.  
   - 올바른 변환은 `int digit = arr[i] - '0'; char c = (char) (digit + 96);` 와 같이 해야 한다.  

3. **`StringTokenizer` import 제거**  
   - 사용되지 않는 import는 코드 가독성을 해치므로 삭제한다.  

4. **`StringBuilder` 초기 용량 지정**  
   - `new StringBuilder(s.length())` 로 미리 용량을 지정하면 내부 배열 재할당을 방지할 수 있다.  

5. **대안적 구현**  
   - 앞에서부터 탐색하면서 `i+2 < n && s.charAt(i+2) == '#'` 인지를 확인하고 2자리 수를 처리하는 방법도 가능하다. 이 경우 `reverse()`가 필요 없으며, 동일한 O(N) 시간·공간 복잡도를 유지한다.  

**수정 예시 (핵심 부분만)**  

```java
class Solution {
    public String freqAlphabets(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder(s.length());

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == '#') {
                int num = (arr[i - 2] - '0') * 10 + (arr[i - 1] - '0');
                sb.append((char) (num + 96));
                i -= 2;
            } else {
                int num = arr[i] - '0';
                sb.append((char) (num + 96));
            }
        }
        return sb.reverse().toString();
    }
}
```

위와 같이 수정하면 논리 오류를 없애고, 불필요한 출력·import를 제거해 깔끔하고 효율적인 코드가 된다.
