# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오전 11:18:34 |
| Language | java |
| Runtime | 2 ms (Beats 0.0%) |
| Memory | 43.1 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(N)** (N = 입력 문자열 `s` 의 길이)  
- 문자열을 뒤에서부터 한 번 순회하면서 각 문자를 처리하므로, 반복 횟수는 `s.length()` 에 비례합니다. `parseInt` 로 두 자리를 정수로 바꾸는 연산도 상수 시간에 수행됩니다.

**2. 공간 복잡도**  
- **O(N)**  
- 결과를 저장하기 위해 `StringBuilder sb` 를 사용하고, 최종 문자열을 반환하기 위해 `sb.reverse()` 로 새로운 문자열을 만든다. 이 두 객체는 최악의 경우 입력 길이와 같은 크기의 문자 배열을 차지합니다. 추가적인 보조 배열(`char[] arr`)도 `O(N)` 입니다.

**3. 풀이 접근법**  
- 뒤에서부터 탐색하면서 `#` 가 나타나면 앞의 두 숫자를 하나의 문자(`10~26`)로 변환하고, `#` 가 없으면 단일 숫자(`1~9`)를 문자로 변환한다.  
- 변환 후 `StringBuilder` 에 추가하고, 마지막에 `reverse()` 로 순서를 복구한다. 이는 “뒤에서부터 읽으며 2자리·1자리 구분”이라는 전형적인 **그리디** 방식입니다.

**4. 잘된 점**  
- **뒤에서부터 처리**하여 `#` 를 만나면 바로 앞의 두 숫자를 읽어올 수 있어 구현이 간단하고 직관적입니다.  
- `StringBuilder` 를 사용해 문자열을 누적하고, 최종에 `reverse()` 로 순서를 맞추는 방법은 효율적이며 `String` 연결에 비해 메모리 재할당을 최소화합니다.  
- `char[] arr = s.toCharArray();` 로 문자 배열을 미리 만든 점은 `charAt` 호출보다 약간 빠를 수 있습니다.

**5. 개선 사항**  
1. **불필요한 `StringTokenizer` import**  
   - 사용되지 않으므로 제거합니다.

2. **`parseInt` 사용 최소화**  
   - `int temp = (arr[i-2]-'0')*10 + (arr[i-1]-'0');` 와 같이 직접 계산하면 객체 생성 없이 정수를 얻을 수 있어 약간의 성능 향상이 있습니다.

3. **문자 변환 로직 오류**  
   - 현재 `else` 블록에서 `char c = (char) (arr[i] + '0');` 로 변환하고 있는데, 이는 `'1' + '0' = '1' + 48` 로 잘못된 문자 코드를 만들게 됩니다. 올바른 변환은 `char c = (char) (arr[i] - '0' + 'a');` (또는 `97 + (arr[i]-'1')`) 이어야 합니다.

4. **불필요한 `System.out.println(temp);`**  
   - 디버깅용 출력은 제출 코드에 남겨두면 시간 초과 혹은 불필요한 I/O 오버헤드를 야기합니다. 제거합니다.

5. **`reverse()` 대신 앞에서부터 결과를 채우기**  
   - `StringBuilder sb = new StringBuilder(N);` 로 미리 용량을 지정하고, `sb.insert(0, c);` 혹은 결과 배열을 미리 할당해 역순으로 채우면 `reverse()` 호출을 없앨 수 있습니다. 하지만 현재 `reverse()` 가 O(N) 이고 전체 복잡도에 큰 영향을 주지는 않으므로 선택 사항입니다.

**수정된 핵심 코드 예시**

```java
class Solution {
    public String freqAlphabets(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder(s.length());

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == '#') {
                int num = (arr[i - 2] - '0') * 10 + (arr[i - 1] - '0');
                sb.append((char) ('a' + num - 1));
                i -= 2;
            } else {
                sb.append((char) ('a' + (arr[i] - '1')));
            }
        }
        return sb.reverse().toString();
    }
}
```

위와 같이 수정하면 가독성, 정확성, 약간의 성능 모두 개선됩니다.
