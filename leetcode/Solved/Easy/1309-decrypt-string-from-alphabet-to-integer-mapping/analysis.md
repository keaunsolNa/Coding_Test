# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오전 11:13:01 |
| Language | java |
| Runtime | 2 ms (Beats 0.0%) |
| Memory | 42.9 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(N)** : 문자열 `s` 를 뒤에서부터 한 번씩만 탐색하므로 입력 길이 `N` 에 대해 선형 시간이다. `Integer.parseInt` 로 두 자리 숫자를 파싱하는 작업도 상수 시간이다.

**2. 공간 복잡도**  
- **O(N)** : 결과를 저장하기 위해 `StringBuilder` 를 사용하고, 최악의 경우 결과 문자열 길이가 입력과 거의 동일하므로 추가적인 선형 공간이 필요하다. 입력을 `char[]` 로 복사하는 `toCharArray()` 도 O(N) 공간을 차지한다.

**3. 풀이 접근법**  
- 뒤에서부터 탐색하면서 `'#'` 가 나타나면 앞의 두 숫자를 하나의 문자로 변환하고, 그렇지 않으면 한 자리 숫자를 바로 문자로 변환한다.  
- 숫자를 문자로 바꾸는 식은 `('a' + value - 1)` 형태이지만, 코드에서는 `temp + 'a'` 로 구현했다(실제로는 `temp` 가 1~26 이어야 함).  

**4. 잘된 점**  
- 뒤에서부터 처리함으로써 `'#'` 뒤에 있는 두 자리 숫자를 쉽게 묶을 수 있어 로직이 간결하다.  
- `StringBuilder` 를 사용해 문자열을 효율적으로 누적한다.  
- `if (arr[i] == '#')` 로 구분하는 구조가 직관적이며, `i -= 2` 로 인덱스를 건너뛰는 부분이 명확하다.  

**5. 개선 사항**  
1. **문자 변환 로직 보완**  
   - 현재 `char c = (char) (temp + 'a');` 는 `temp = 1` 일 때 `'b'` 가 되므로 실제 요구사항(1 → 'a')과 오프셋이 맞지 않는다. `char c = (char) ('a' + temp - 1);` 로 수정해야 한다.  
   - 한 자리 숫자 처리에서도 동일하게 `char c = (char) ('a' + (arr[i] - '0') - 1);` 로 바꾸면 안전하다.

2. **불필요한 `StringTokenizer` import 제거**  
   - 사용되지 않는 import 가 남아 있어 코드 가독성을 떨어뜨린다.

3. **`toCharArray()` 대신 직접 인덱스로 접근**  
   - `char[] arr = s.toCharArray();` 로 복사하는 대신 `s.charAt(i)` 로 바로 접근하면 메모리 사용을 약간 절감할 수 있다. 하지만 가독성 측면에서는 현재 방식도 무방하다.

4. **예외 상황 처리**  
   - 입력이 항상 유효하다고 가정하지만, `i-2` 가 음수가 되는 경우(잘못된 입력) `ArrayIndexOutOfBoundsException` 이 발생한다. 실제 서비스 코드라면 입력 검증을 추가하는 것이 좋다.

5. **코드 스타일**  
   - `arr[i - 1] + "" + arr[i - 2]` 와 같이 문자열 연결보다 `new String(new char[]{arr[i-2], arr[i-1]})` 혹은 `String.valueOf(arr[i-2]) + arr[i-1]` 로 명시하면 의도를 더 명확히 할 수 있다.  
   - `i--` 와 `i -= 2` 를 혼용하기보다 한 스타일로統一하면 가독성이 향상된다.

**요약**  
전체적인 알고리즘은 최적이며 O(N) 시간·공간 복잡도를 갖는다. 다만 문자 변환 시 오프셋 오류가 존재하므로 `-1` 보정을 추가하고, 사용되지 않은 import 제거, 입력 검증 등을 보완하면 더욱 견고하고 깔끔한 코드가 된다.
