# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 4:07:59 |
| Language | java |
| Runtime | 15 ms (Beats 0.0%) |
| Memory | 46.2 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/valid-anagram/submissions/)

## Code Review

**1. 시간 복잡도**  
- 현재 구현은 문자열 `s`와 `t`를 각각 한 번씩 순회하고, 두 개의 `HashMap`에 삽입·조회합니다.  
- `s.length = n`, `t.length = m`이라 하면 전체 시간 복잡도는 **O(n + m)** 입니다.  
- 마지막 두 번의 `keySet()` 순회도 각각 `O(k₁)`·`O(k₂)` (키 개수)이며, `k₁, k₂ ≤ min(n, m)`이므로 전체 복잡도에 영향을 주지 않습니다.

**2. 공간 복잡도**  
- 두 개의 `HashMap`에 각각 문자별 빈도수를 저장합니다. 최악의 경우 모든 문자가 서로 다르므로 저장되는 키의 개수는 `n + m`개가 됩니다.  
- 따라서 **O(n + m)** 의 추가 공간을 사용합니다. (문자 집합이 제한적이라면 실제 사용량은 더 작을 수 있음)

**3. 풀이 접근법**  
- **해시 테이블(맵) 기반 빈도수 비교** 방식입니다.  
  1) 문자열 `s`와 `t`를 각각 순회하면서 문자 → 등장 횟수를 `HashMap`에 기록.  
  2) 두 맵의 키와 값을 비교해 일치 여부를 판단합니다.  

**4. 잘된 점**  
- `Map.getOrDefault`를 활용해 빈도수를 간결하게 증가시킨 점이 깔끔합니다.  
- `keySet()`을 이용해 직접 비교하는 로직이 직관적이며, 기본적인 아이디어는 정확합니다.  
- 디버깅용 `System.out.println`을 넣어 중간 상태를 확인하려는 시도도 개발 단계에서는 유용합니다.

**5. 개선 사항**  
1. **불필요한 두 번째 맵 제거**  
   - 두 문자열을 동시에 한 번의 `int[26]`(알파벳 소문자만) 혹은 `int[128]`(ASCII) 배열로 처리하면 공간을 **O(1)** 로 줄일 수 있습니다.  
   - 혹은 하나의 `HashMap`만 사용하고, `t`를 순회하면서 `sMap`의 값을 감소시키는 방식으로도 구현 가능해, 두 번의 `keySet()` 순회를 없앨 수 있습니다.

2. **`null` 처리 및 `equals` 사용**  
   - 현재 `tMap.get(key) != sMap.get(key)` 로 비교하면 `null`이 반환될 때 `NullPointerException`이 발생하지는 않지만, `null`과 `Integer` 비교는 의미가 모호합니다.  
   - `Objects.equals(tMap.get(key), sMap.get(key))` 로 교체하면 `null` 안전하게 비교할 수 있습니다.

3. **디버깅 출력 제거**  
   - 실제 제출 코드에서는 `System.out.println`을 제거해야 시간 초과와 불필요한 I/O 비용을 피할 수 있습니다.

4. **길이 사전 검사**  
   - 두 문자열 길이가 다르면 바로 `false`를 반환하도록 하면 불필요한 해시 연산을 피할 수 있습니다.

5. **코드 간결화**  
   ```java
   public boolean isAnagram(String s, String t) {
       if (s.length() != t.length()) return false;
       int[] cnt = new int[26]; // 알파벳 소문자 가정
       for (int i = 0; i < s.length(); i++) {
           cnt[s.charAt(i) - 'a']++;
           cnt[t.charAt(i) - 'a']--;
       }
       for (int c : cnt) if (c != 0) return false;
       return true;
   }
   ```
   - 위와 같이 배열을 쓰면 시간·공간 모두 최적화됩니다.  
   - 알파벳 외 문자 집합을 지원해야 한다면 `HashMap` 하나만 사용해 동일한 로직을 구현할 수 있습니다.

**요약**  
현재 코드는 올바른 로직을 가지고 있지만, 두 개의 `HashMap`과 불필요한 반복·출력으로 인해 공간·시간 효율이 다소 떨어집니다. 길이 사전 검사, 하나의 맵(또는 고정 크기 배열) 사용, `null` 안전 비교 등을 적용하면 더 깔끔하고 최적화된 해결책이 됩니다.
