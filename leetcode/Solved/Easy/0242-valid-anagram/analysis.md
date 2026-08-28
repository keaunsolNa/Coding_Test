# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 4:10:36 |
| Language | java |
| Runtime | 15 ms (Beats 0.0%) |
| Memory | 46.1 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/valid-anagram/submissions/)

## Code Review

**1. 시간 복잡도**  
- 현재 구현은 문자열 `s`와 `t`를 각각 한 번씩 순회하고, 두 개의 `HashMap`에 삽입·조회합니다.  
- `for` 루프 3번(두 번의 카운트, 두 번의 키 비교) 모두 O(n) (n = s.length = t.length)이며, `HashMap` 연산은 평균 O(1)입니다.  
- 따라서 전체 시간 복잡도는 **O(n)** 입니다.

**2. 공간 복잡도**  
- 두 개의 `HashMap`에 각각 문자열에 등장하는 서로 다른 문자 수만큼 엔트리를 저장합니다. 알파벳 소문자만 고려한다면 최악의 경우 26개의 엔트리, 일반적인 유니코드 문자열이라면 O(k) (k = 서로 다른 문자 종류) 입니다.  
- 입력 문자열 길이에 비례하지 않으므로 **O(k)**, 최악의 경우 O(n) (모든 문자가 서로 다를 때) 로 볼 수 있습니다.

**3. 풀이 접근법**  
- **해시 테이블 카운팅** 방식: 각 문자열에 등장하는 문자 빈도를 `HashMap<Character, Integer>` 로 기록하고, 두 맵을 비교해 동일한지 판단합니다.  
- 키와 값을 직접 비교하는 두 번의 반복을 통해 양쪽 모두에 존재하는지 확인합니다.

**4. 잘된 점**  
- `Map.getOrDefault` 를 활용해 카운팅 로직을 간결하게 구현한 점이 좋습니다.  
- `keySet()` 을 이용해 각 맵의 키를 순회하며 비교하는 흐름이 직관적입니다.  
- 디버깅용 `System.out.println` 을 넣어 중간 상태를 확인하려는 시도도 이해됩니다(테스트 단계에서는 유용).

**5. 개선 사항**  
1. **불필요한 두 번째 맵 제거**  
   - 두 문자열의 길이가 다르면 바로 `false` 를 반환하고, 하나의 `int[26]` (영문 소문자) 혹은 하나의 `HashMap`만 사용해 한 번의 순회로 카운트를 감소시키는 방식이 더 효율적입니다.  
   - 예시 (ASCII 기준):
     ```java
     if (s.length() != t.length()) return false;
     int[] cnt = new int[26];
     for (int i = 0; i < s.length(); i++) {
         cnt[s.charAt(i) - 'a']++;
         cnt[t.charAt(i) - 'a']--;
     }
     for (int c : cnt) if (c != 0) return false;
     return true;
     ```
   - 이렇게 하면 **시간 O(n), 공간 O(1)** (고정 배열) 로 최적화됩니다.

2. **키 존재 여부 검사**  
   - 현재 `tMap.get(key)` 가 `null` 일 경우 `null != Integer` 로 `false` 가 되지 않아 `NullPointerException` 이 발생할 수 있습니다. `Map.getOrDefault(key, 0)` 로 안전하게 비교하거나, `containsKey` 로 존재 여부를 먼저 확인하는 것이 좋습니다.

3. **디버깅 출력 제거**  
   - 제출 코드에 `System.out.println` 은 불필요하며, 실행 시간에 영향을 줄 수 있습니다. 디버깅이 끝났다면 제거하세요.

4. **코드 간결화**  
   - 두 번의 `for (Character key : ...)` 루프를 하나로 합칠 수 있습니다. 하나의 맵에만 존재하는 키가 있으면 바로 `false` 로 반환하면 충분합니다.

5. **예외 상황 처리**  
   - `null` 입력에 대한 방어 코드를 추가하면 더욱 견고합니다.
     ```java
     if (s == null || t == null) return false;
     ```

위와 같이 개선하면 가독성·성능 모두 향상됩니다. 현재 코드도 정답을 맞출 수 있지만, 위 제안을 반영하면 **더 최적화된** 풀이가 됩니다.
