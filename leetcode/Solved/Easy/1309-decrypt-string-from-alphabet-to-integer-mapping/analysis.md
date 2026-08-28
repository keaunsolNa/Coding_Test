# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오전 11:18:00 |
| Language | java |
| Runtime | 1 ms (Beats 0.0%) |
| Memory | 43 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(N)**  
  - 문자열 `s`를 뒤에서부터 한 번씩 순회하면서 `#` 여부에 따라 1~3개의 문자를 처리합니다. `N`은 입력 문자열의 길이이며, 각 문자에 대해 상수 시간 연산만 수행하므로 전체 시간 복잡도는 선형입니다.

**2. 공간 복잡도**  
- **O(N)** (출력 문자열을 저장하는 `StringBuilder` 때문)  
  - 추가적인 보조 배열이나 컬렉션을 사용하지 않고, 결과를 저장하기 위한 `StringBuilder`만 사용합니다. 최악의 경우 결과 문자열 길이가 입력과 비슷하므로 `O(N)`의 공간을 차지합니다.

**3. 풀이 접근법**  
- 뒤에서부터 탐색하면서 `#`이 나타나면 앞의 두 숫자를 합쳐 10~26에 해당하는 알파벳을, `#`이 없으면 단일 숫자를 1~9에 해당하는 알파벳으로 변환합니다.  
- 변환 후 `StringBuilder`에 추가하고, 최종적으로 `reverse()` 하여 올바른 순서를 만든다. 이는 **스택처럼 뒤에서부터 처리**하는 전형적인 문자열 디코딩 패턴입니다.

**4. 잘된 점**  
- **뒤에서부터 한 번에 처리**해 `#`을 만나면 두 글자를 건너뛰는 로직이 깔끔합니다.  
- `StringBuilder`를 사용해 문자열을 효율적으로 누적하고, 마지막에 `reverse()`로 순서를 맞춘 점이 좋습니다.  
- `char[] arr = s.toCharArray();` 로 배열을 미리 만든 뒤 인덱스로 접근해 인덱스 연산을 빠르게 수행합니다.

**5. 개선 사항**  
1. **문자 → 정수 변환 오류**  
   - `int temp = Integer.parseInt(arr[i - 2] + "" + arr[i - 1]);`는 동작하지만 불필요한 문자열 생성이 발생합니다.  
   - `int temp = (arr[i - 2] - '0') * 10 + (arr[i - 1] - '0');` 로 바꾸면 더 빠르고 메모리 절약됩니다.  

2. **알파벳 변환 로직 오류**  
   - 현재 `char c = (char) (temp + 97 + '0');` 와 `char c = (char) (arr[i] + '0');`는 올바른 알파벳을 만들지 못합니다.  
   - 올바른 변환은 `char c = (char) ('a' + temp - 1);` (10~26)와 `char c = (char) ('a' + (arr[i] - '0') - 1);` (1~9)이어야 합니다.  

3. **불필요한 `System.out.println`**  
   - 디버깅용 출력은 제출 코드에 남겨두면 시간 초과 혹은 불필요한 I/O가 발생합니다. 제거해야 합니다.  

4. **`StringTokenizer` import**  
   - 사용되지 않는 `import java.util.StringTokenizer;`는 삭제해 주세요.  

5. **코드 가독성**  
   - 변환 로직을 별도 메서드(`private char toChar(int num)`) 로 추출하면 가독성이 향상됩니다.  

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

위와 같이 수정하면 정확성과 효율성이 모두 개선됩니다.
