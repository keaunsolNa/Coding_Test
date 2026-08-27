# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 27. 오후 1:37:50 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.6 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/maximum-number-of-words-you-can-type/submissions/)

## Code Review

**1. 시간 복잡도**  
- 전체 문자열 `text` 를 한 번씩 토큰화하고 각 토큰의 문자들을 검사합니다.  
- `text` 의 길이를 *n*, `brokenLetters` 의 길이를 *b* 라고 하면  
  - 토큰화 + 문자 탐색: **O(n)**  
  - `brokenList.contains(c)` 가 `ArrayList` 에서 선형 탐색이므로 최악의 경우 **O(b)** 가 추가됩니다.  
- 따라서 전체 시간 복잡도는 **O(n·b)** 가 됩니다. `b` 가 최대 26(알파벳 소문자) 이므로 실질적으로는 O(n) 수준이지만, 자료구조를 바꾸면 더 명확히 O(n) 로 만들 수 있습니다.

**2. 공간 복잡도**  
- `brokenList` 에 `brokenLetters` 의 문자들을 저장하므로 **O(b)** (최대 26)  
- `StringTokenizer` 가 내부 버퍼를 사용하고, 현재 토큰을 `char[]` 로 변환하지만 이는 한 번에 하나씩만 존재합니다.  
- 전체 추가 공간은 **O(b)** 로 매우 작습니다.

**3. 풀이 접근법**  
- `brokenLetters` 를 리스트에 저장하고, `text` 를 공백 기준으로 토큰화한 뒤 각 단어에 깨진 문자(broken letter)가 포함되는지 검사합니다.  
- 포함되지 않으면 카운트를 증가시키는 **그리디** 방식이며, 별도의 자료구조나 DP 없이 바로 답을 구합니다.

**4. 잘된 점**  
- 문제를 정확히 이해하고, `StringTokenizer` 로 단어를 쉽게 분리한 점이 깔끔합니다.  
- `check` 플래그를 사용해 단어 전체를 한 번만 순회하고, 깨진 문자를 만나면 즉시 탈출(`break`)하는 로직이 효율적입니다.  
- 코드 가독성이 좋고, 변수명(`brokenList`, `ans`, `check`)이 의미를 잘 전달합니다.

**5. 개선 사항**  
1. **자료구조 교체**  
   - `ArrayList<Character>` 대신 `boolean[26]` 혹은 `HashSet<Character>` 를 사용하면 `contains` 연산이 O(1) 로 바뀝니다.  
   - 예시:  
     ```java
     boolean[] broken = new boolean[26];
     for (char c : brokenLetters.toCharArray()) broken[c - 'a'] = true;
     ...
     if (broken[c - 'a']) { check = false; break; }
     ```
2. **불필요한 객체 제거**  
   - `List<Character>` 를 만들고 `toCharArray()` 로 토큰을 변환하는 과정이 약간 과잉입니다. `String.split(" ")` 로 문자열 배열을 바로 얻거나, `StringTokenizer` 로 바로 `charAt` 로 접근해도 됩니다.  
3. **메서드 시그니처와 클래스 선언**  
   - LeetCode에서는 `public int canBeTypedWords(String text, String brokenLetters)` 만 있으면 충분하므로 `import java.util.*;` 로 간단히 정리할 수 있습니다.  
4. **예외 상황 처리**  
   - `text` 가 빈 문자열이거나 `brokenLetters` 가 빈 문자열일 때도 정상 동작하지만, 명시적으로 `if (text.isEmpty()) return 0;` 등을 추가하면 가독성이 향상됩니다.  

위와 같이 `brokenLetters` 를 O(1) 조회 가능한 구조로 바꾸면 최악의 경우에도 **O(n)** 시간 복잡도를 보장할 수 있어, 더욱 최적화된 풀이가 됩니다.
