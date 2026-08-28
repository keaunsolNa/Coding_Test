# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 4:04:59 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.5 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/valid-anagram/submissions/)

## Code Review

**1. 시간 복잡도**  
- 현재 구현은 두 문자열을 각각 한 번씩 순회하고(`s.toCharArray()`, `t.toCharArray()`), 이후에 두 `Map`의 키 집합을 각각 순회합니다.  
- 최악의 경우 각 문자열 길이를 *n*이라 하면 전체 연산은 `O(n) + O(n) + O(k) + O(k)` (k는 서로 다른 문자 종류, 알파벳이면 최대 26) 이므로 **시간 복잡도는 O(n)** 입니다.

**2. 공간 복잡도**  
- 두 개의 `HashMap<Character, Integer>`을 사용해 각 문자별 빈도를 저장합니다.  
- 서로 다른 문자 종류가 *k*개라면 각 맵은 O(k) 공간을 차지합니다. 알파벳만 고려한다면 **O(1)** (k ≤ 26) 이지만 일반적인 유니코드 문자열이라면 **O(k)** 로 표현합니다.

**3. 풀이 접근법**  
- **해시 테이블(맵) 기반 빈도 카운팅** 방식으로, 두 문자열의 문자 빈도를 각각 기록한 뒤, 두 맵을 비교해 동일한지 판단합니다.  
- 이 패턴은 “문자열 애너그램 여부 확인”에 가장 직관적인 방법 중 하나입니다.

**4. 잘된 점**  
- `Map.getOrDefault` 를 활용해 빈도 증가 로직을 간결하게 작성한 점이 좋습니다.  
- 두 문자열을 각각 독립적인 맵에 저장하고, 키 집합을 순회하면서 비교하는 구조가 논리적으로 명확합니다.  
- 코드가 전체적으로 짧고 가독성이 좋습니다.

**5. 개선 사항**  
1. **오타 및 버그**  
   - `sMap.getOrDefault(s, 0)` → `sMap.getOrDefault(c, 0)` 로 바꿔야 합니다. 현재는 `s`(문자열 전체) 를 키로 사용하고 있어 `ClassCastException` 이 발생합니다.  
   - `tMap.getOrDefault(s, 0)` 역시 `tMap.getOrDefault(c, 0)` 로 수정해야 합니다.  

2. **불필요한 두 번째 루프 제거**  
   - 현재는 `sMap` 과 `tMap` 을 각각 순회하면서 같은 비교를 두 번 수행합니다.  
   - 한 번의 순회(`for (Character key : sMap.keySet())`)만으로 충분합니다. `tMap` 에 없는 키가 있으면 `null` 이 반환되므로 `tMap.getOrDefault(key, 0)` 로 비교하면 됩니다.  

3. **단일 맵 사용으로 메모리 절감**  
   - 한 번의 `int[26]` 배열(알파벳만 고려) 혹은 하나의 `HashMap`을 사용해 `s` 에서는 `+1`, `t` 에서는 `-1` 을 누적하고, 최종에 모든 값이 0 인지 확인하면 **O(1)** 추가 공간으로 구현할 수 있습니다.  

4. **입력 길이 차이 조기 반환**  
   - `if (s.length() != t.length()) return false;` 를 가장 앞에 두면 불필요한 연산을 피할 수 있습니다.  

5. **코드 스타일**  
   - `for (char c : s.toCharArray()) { ... }` 와 같이 중괄호를 사용해 블록을 명시하면 가독성이 향상됩니다.  
   - `Map<Character, Integer>` 대신 `int[] cnt = new int[26];` (알파벳 전용) 혹은 `int[] cnt = new int[128];` (ASCII) 로 바꾸면 성능이 약간 개선됩니다.  

**수정된 예시 (단일 배열 사용)**  

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] cnt = new int[26];               // 알파벳 소문자만 가정
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
            cnt[t.charAt(i) - 'a']--;
        }

        for (int c : cnt) {
            if (c != 0) return false;
        }
        return true;
    }
}
```

위와 같이 수정하면 시간·공간 모두 최적화된 **O(n)** / **O(1)** 구현이 됩니다. 기존 코드도 버그만 고치면 정상 동작하지만, 위와 같은 간소화가 더 효율적입니다.
