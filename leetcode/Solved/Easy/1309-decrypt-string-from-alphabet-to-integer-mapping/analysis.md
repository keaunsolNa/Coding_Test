# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오전 11:12:20 |
| Language | java |
| Runtime | 2 ms (Beats 0.0%) |
| Memory | 42.7 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(N)** : 문자열 `s` 를 뒤에서부터 한 번씩 순회하면서 각 문자(또는 `#`와 두 자리 숫자)를 처리합니다. `N` 은 입력 문자열의 길이이며, 각 문자를 상수 시간에 처리하므로 전체 시간 복잡도는 선형입니다.

**2. 공간 복잡도**  
- **O(N)** : 결과를 저장하기 위해 `StringBuilder sb` 를 사용합니다. 최악의 경우 결과 문자열도 입력과 같은 길이가 되므로 추가적인 힙 메모리는 `O(N)` 입니다. 입력을 별도로 복사하거나 추가적인 배열을 만들지는 않으므로, 보조 공간은 `O(1)` 에 가깝습니다(결과 문자열을 제외하고).

**3. 풀이 접근법**  
- 뒤에서부터 탐색하면서 `#` 가 나타나면 앞의 두 자리 숫자를 하나의 문자(`'j'`~`'z'`) 로 변환하고, `#` 가 없으면 한 자리 숫자를(`'a'`~`'i'`) 바로 변환합니다.  
- 숫자를 문자로 바꾸는 식은 `char c = (char) (value + 26);` 로 구현했으며, 여기서 `value` 는 1~26 범위의 정수입니다.  

**4. 잘된 점**  
- **역방향 탐색**을 사용해 `#` 뒤에 있는 두 자리 숫자를 쉽게 처리한 점이 깔끔합니다.  
- `StringBuilder` 로 결과를 누적해 문자열 연결 비용을 최소화했습니다.  
- `char[] arr = s.toCharArray();` 로 배열에 한 번만 변환해 인덱스 접근을 O(1) 로 유지했습니다.  

**5. 개선 사항**  
1. **문자 변환 로직 가독성**  
   - 현재 `char c = (char) (arr[i] + 26);` 와 같이 문자 코드에 26을 더하는 방식은 직관적이지 않습니다.  
   - `int num = arr[i] - '0';` 로 숫자를 추출하고 `char c = (char) ('a' + num - 1);` 로 변환하면 의미가 명확해집니다.  

2. **`Integer.parseInt` 사용 최소화**  
   - `Integer.parseInt(arr[i - 1] + "" + arr[i - 2])` 는 문자열 생성과 파싱 비용이 발생합니다.  
   - 대신 `int num = (arr[i - 2] - '0') * 10 + (arr[i - 1] - '0');` 로 직접 계산하면 불필요한 객체 생성을 피할 수 있습니다.  

3. **결과 문자열 순서**  
   - 현재 뒤에서부터 `sb.append` 하여 뒤집힌 결과가 나오므로, 마지막에 `sb.reverse()` 를 호출하거나, `StringBuilder` 대신 `char[] result = new char[...];` 에 역순으로 채워 반환하면 `reverse()` 호출을 없앨 수 있습니다.  

4. **불필요한 `import`**  
   - `import java.util.StringTokenizer;` 은 사용되지 않으므로 제거해 주세요.  

5. **예외 상황 처리**  
   - 입력이 항상 유효하다고 가정하지만, `i-2` 가 음수가 되는 경우(예: `"#"`만 있는 경우) `ArrayIndexOutOfBoundsException` 이 발생할 수 있습니다. 문제 조건이 보장한다면 괜찮지만, 방어적 코드를 원한다면 체크를 추가하는 것이 좋습니다.  

**수정 예시 (가독성·성능 개선)**  

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

위와 같이 수정하면 가독성이 높아지고, 불필요한 객체 생성과 `reverse()` 호출을 최소화할 수 있습니다. 전체 알고리즘의 시간·공간 복잡도는 그대로 유지됩니다.
