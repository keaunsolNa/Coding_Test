# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 4:06:15 |
| Language | java |
| Runtime | 14 ms (Beats 0.0%) |
| Memory | 45.3 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/valid-anagram/submissions/)

## Code Review

**1. 시간 복잡도**  
- 현재 구현은 문자열 `s`와 `t`를 각각 한 번씩 순회하고, 두 개의 `HashMap`에 삽입·조회합니다.  
- 이후 `sMap.keySet()`와 `tMap.keySet()`을 각각 순회하면서 값을 비교합니다.  
- 전체 복잡도는 `O(n + m + k1 + k2)` 로, 여기서 `n = s.length()`, `m = t.length()`, `k1 = sMap.size()`, `k2 = tMap.size()`.  
- 최악의 경우 알파벳이 모두 다르므로 `k1 = n`, `k2 = m` 이 되지만, `n`과 `m`은 동일한 길이(아나그램 검사 전제)이므로 **시간 복잡도는 `O(n)`** 입니다.

**2. 공간 복잡도**  
- 두 개의 `HashMap`에 각각 문자당 카운트를 저장합니다.  
- 최악의 경우 모든 문자가 서로 다르면 `O(n)` 개의 엔트리가 필요합니다.  
- 따라서 **공간 복잡도는 `O(n)`** 입니다.

**3. 풀이 접근법**  
- **해시 테이블(맵) 기반 카운팅** 방식: 문자열을 한 번씩 순회하면서 각 문자 빈도를 기록하고, 두 맵을 비교해 동일한지 판단합니다.  
- 이 방법은 “빈도 수 비교”라는 전형적인 아나그램 검증 패턴에 해당합니다.

**4. 잘된 점**  
- `Map.getOrDefault` 를 활용해 카운팅 로직을 간결하게 구현한 점이 좋습니다.  
- `keySet()` 을 이용해 맵의 모든 키를 순회하며 비교하는 로직이 명확합니다.  
- 디버깅용 `System.out.println` 으로 맵 내용을 출력해 확인할 수 있게 한 점도 개발 단계에서는 유용합니다.

**5. 개선 사항**  
1. **불필요한 두 번째 루프 제거**  
   - `sMap` 과 `tMap` 은 같은 키 집합을 가져야 하므로, `sMap` 을 순회하면서 `tMap` 에서 동일한 카운트를 확인하면 충분합니다. 현재처럼 `tMap` 을 다시 순회하면 중복 검사가 발생합니다.  
   - 예시:  
     ```java
     for (Map.Entry<Character, Integer> e : sMap.entrySet()) {
         if (!e.getValue().equals(tMap.get(e.getKey()))) return false;
     }
     return true;
     ```
2. **길이 사전 검사**  
   - 두 문자열 길이가 다르면 바로 `false` 를 반환하도록 하면 불필요한 해시맵 생성과 순회를 피할 수 있습니다.  
3. **단일 배열 활용 (알파벳 제한 시)**  
   - 문제는 영어 소문자만을 대상으로 하므로 `int[26]` 배열을 사용하면 `O(1)` 추가 공간으로 구현이 가능하고, 코드도 더 간결합니다.  
4. **디버깅 출력 제거**  
   - 최종 제출 코드에서는 `System.out.println` 을 제거해 불필요한 I/O 오버헤드를 없애야 합니다.  
5. **null/예외 처리**  
   - 입력이 `null` 일 경우를 대비한 방어 코드를 추가하면 더욱 견고합니다.

**예시 최적화 코드 (배열 활용)**  
```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) return false;

        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
            cnt[t.charAt(i) - 'a']--;
        }
        for (int c : cnt) if (c != 0) return false;
        return true;
    }
}
```
위와 같이 구현하면 시간·공간 모두 `O(n)` 이면서 상수 공간(`O(1)`)을 사용하게 됩니다.
