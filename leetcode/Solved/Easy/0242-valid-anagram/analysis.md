# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 4:06:50 |
| Language | java |
| Runtime | 12 ms (Beats 0.0%) |
| Memory | 45.2 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/valid-anagram/submissions/)

## Code Review

**1. 시간 복잡도**  
- 현재 구현은 문자열 `s`와 `t`를 각각 한 번씩 순회하고, 두 개의 `HashMap`에 삽입·조회·비교를 수행합니다.  
- 각 연산은 평균 O(1)이며, 전체 루프는 `O(n + m)` (여기서 n = s.length, m = t.length) 입니다.  
- 두 번째와 세 번째 `for`문에서 각각 `sMap.keySet()`·`tMap.keySet()`을 다시 순회하므로 최악의 경우 전체 복잡도는 `O(n + m)` 에 그대로 유지됩니다.  

**2. 공간 복잡도**  
- 두 개의 `HashMap`에 각각 문자열에 등장하는 서로 다른 문자 수만큼 엔트리를 저장합니다.  
- 알파벳(또는 유니코드) 종류를 `k`라 하면, 최악의 경우 `O(k)` (보통 영어 소문자는 26) 만큼 추가 공간이 필요합니다.  
- 따라서 전체 공간 복잡도는 `O(k)` 입니다.

**3. 풀이 접근법**  
- **해시 테이블 카운팅**: 각 문자열의 문자 빈도를 `HashMap<Character, Integer>`에 기록하고, 두 맵을 비교하여 동일한지 판단합니다.  
- 이 방법은 “문자 빈도 비교”라는 전형적인 아나그램 판별 패턴에 해당합니다.

**4. 잘된 점**  
- `Map.getOrDefault` 를 활용해 카운팅 로직을 간결하게 구현한 점이 좋습니다.  
- `keySet()` 을 이용해 맵의 모든 키를 순회하며 비교하는 흐름이 직관적입니다.  
- 디버깅용 `System.out.println` 을 넣어 중간 결과를 확인하려는 시도도 이해됩니다 (제출 전에는 제거하면 좋습니다).

**5. 개선 사항**  
1. **불필요한 두 번째 비교 루프 제거**  
   - 첫 번째 루프에서 `tMap`에 없는 키는 `null`이 되므로 `null != sMap.get(key)` 로 바로 `false` 를 반환합니다.  
   - 두 번째 루프는 사실상 중복 검사이며, 첫 번째 루프만으로 충분합니다.  

2. **길이 사전 검사**  
   - 두 문자열 길이가 다르면 바로 `false` 를 반환하면 불필요한 해시맵 생성과 순회를 피할 수 있습니다.  

3. **단일 해시맵 사용**  
   - `s` 에는 +1, `t` 에는 -1 을 누적하는 하나의 `int[26]` 배열(알파벳 소문자만 사용 시) 혹은 `HashMap<Character, Integer>` 로 구현하면 메모리를 절반으로 줄이고, 두 번의 `for`문을 하나로 합칠 수 있습니다.  

4. **배열 기반 구현 (알파벳 제한 시)**  
   ```java
   public boolean isAnagram(String s, String t) {
       if (s.length() != t.length()) return false;
       int[] cnt = new int[26];
       for (int i = 0; i < s.length(); i++) {
           cnt[s.charAt(i) - 'a']++;
           cnt[t.charAt(i) - 'a']--;
       }
       for (int c : cnt) if (c != 0) return false;
       return true;
   }
   ```
   - 시간 복잡도 `O(n)`, 공간 복잡도 `O(1)` (고정 크기 배열) 로 최적화됩니다.  

5. **디버깅 출력 제거**  
   - `System.out.println` 은 제출 코드에 남겨두면 시간 초과 혹은 불필요한 I/O 비용이 발생할 수 있으니 삭제합니다.  

**요약**  
현재 코드는 올바르게 동작하지만, 길이 체크와 불필요한 중복 루프를 없애고, 가능한 경우 단일 배열/맵을 사용하면 시간·공간 모두에서 더 효율적인 구현이 가능합니다.
