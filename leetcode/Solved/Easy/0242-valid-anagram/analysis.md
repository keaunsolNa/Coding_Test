# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 4:04:17 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.5 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/valid-anagram/submissions/)

## Code Review

**1. 시간 복잡도**  
- 현재 구현은 두 문자열을 각각 한 번씩 순회하고(`for (char c : s.toCharArray())`, `for (char c : t.toCharArray())`) 해시맵에 삽입·갱신을 수행합니다.  
- 그 후 `tMap.keySet()`을 순회하면서 `sMap`과 값을 비교합니다.  
- 전체 시간 복잡도는 **O(n + m)** (n = s.length, m = t.length)이며, 두 문자열 길이가 동일한 경우 **O(n)** 입니다.  

**2. 공간 복잡도**  
- 각 문자별 등장 횟수를 저장하기 위해 두 개의 `HashMap<Character, Integer>`를 사용합니다. 최악의 경우 모든 문자가 서로 다르면 맵의 크기는 각각 문자열 길이와 같습니다.  
- 따라서 공간 복잡도는 **O(u + v)** (u, v는 각각 문자열에 존재하는 서로 다른 문자 수)이며, 알파벳 소문자만 고려한다면 **O(1)** (고정된 26개의 키) 로 볼 수 있습니다.  

**3. 풀이 접근법**  
- **해시 테이블(맵) 기반 카운팅** 방식: 각 문자열의 문자 빈도를 맵에 저장하고, 두 맵을 비교해 동일한지 판단합니다.  
- 이 방법은 문자열을 정렬하지 않고도 O(n) 시간에 애너그램 여부를 확인할 수 있는 전형적인 패턴입니다.  

**4. 잘된 점**  
- 한 번에 두 번 순회하면서 각각의 빈도를 기록하는 구조는 올바른 접근법이며, `getOrDefault`를 활용한 코드가 간결합니다.  
- `keySet()`을 이용해 비교하는 로직도 직관적입니다.  

**5. 개선 사항**  
1. **버그 수정**  
   - `sMap.getOrDefault(s, 0)`와 `tMap.getOrDefault(s, 0)`에서 키가 `s`가 아니라 현재 문자 `c`이어야 합니다.  
   ```java
   sMap.put(c, sMap.getOrDefault(c, 0) + 1);
   tMap.put(c, tMap.getOrDefault(c, 0) + 1);
   ```
2. **불필요한 두 번째 맵 제거**  
   - 한 번의 맵만 사용해도 충분합니다. `s`의 빈도를 먼저 기록하고, `t`를 순회하면서 해당 문자 카운트를 감소시킵니다. 감소 도중 0 이하가 되면 바로 `false`를 반환하면 더 효율적입니다.  
   - 이렇게 하면 공간 복잡도가 **O(1)** (알파벳 제한) 혹은 **O(u)** 로 감소합니다.  

3. **문자열 길이 사전 검사**  
   - 두 문자열 길이가 다르면 바로 `false`를 반환하면 불필요한 연산을 피할 수 있습니다.  

4. **코드 간결화 (정렬 방식)**  
   - 문자열 길이가 짧고 알파벳 종류가 제한적이라면 `char[]` 로 변환 후 `Arrays.sort` 로 정렬하고 `Arrays.equals` 로 비교하는 방법도 O(n log n) 이지만 구현이 매우 간단합니다.  

**수정된 예시 (맵 하나만 사용)**  
```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray())
            count.put(c, count.getOrDefault(c, 0) + 1);

        for (char c : t.toCharArray()) {
            int cur = count.getOrDefault(c, 0);
            if (cur == 0) return false;
            count.put(c, cur - 1);
        }
        return true;
    }
}
```

위와 같이 수정하면 시간·공간 모두 최적화되고, 현재 코드에 존재하는 논리 오류도 해결됩니다.
