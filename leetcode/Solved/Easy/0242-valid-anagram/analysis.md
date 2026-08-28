# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 4:05:33 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.6 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/valid-anagram/submissions/)

## Code Review

**1. 시간 복잡도**  
- 현재 구현은 두 문자열을 각각 한 번씩 순회하고(`O(n)`), 해시맵의 키 집합을 두 번 순회합니다(`O(k)`), 여기서 `k`는 서로 다른 문자 종류 수이며 `k ≤ n`입니다. 따라서 전체 시간 복잡도는 **O(n)** 입니다.  

**2. 공간 복잡도**  
- 두 개의 `HashMap<Character, Integer>`을 사용해 각각 문자열에 등장하는 문자와 개수를 저장합니다. 최악의 경우 모든 문자가 서로 다르므로 저장되는 원소 수는 `n`개가 됩니다. 따라서 **O(n)** 의 추가 공간이 필요합니다.  

**3. 풀이 접근법**  
- 두 문자열의 문자 빈도를 각각 해시맵에 기록한 뒤, 두 맵을 비교하는 **해시 테이블 기반 빈도 카운팅** 방식입니다. 빈도 비교를 두 번 수행하고 있어 약간 중복된 검증을 하고 있습니다.  

**4. 잘된 점**  
- 문자열을 `toCharArray()` 로 변환해 반복문을 간결하게 작성한 점은 좋습니다.  
- `Map.getOrDefault` 를 활용해 빈도 증가 로직을 한 줄로 구현한 점도 깔끔합니다.  

**5. 개선 사항**  
1. **버그 수정**  
   - `sMap.getOrDefault(s, 0)` 와 `tMap.getOrDefault(s, 0)` 에서 키가 `s`(문자열)로 잘못 사용되었습니다. 올바른 키는 현재 반복 중인 문자 `c`이어야 합니다.  
   ```java
   sMap.put(c, sMap.getOrDefault(c, 0) + 1);
   tMap.put(c, tMap.getOrDefault(c, 0) + 1);
   ```

2. **불필요한 비교 제거**  
   - 두 맵을 각각 순회하면서 같은 조건을 두 번 검사하고 있습니다. `sMap` 에만 존재하는 키를 확인하면 충분합니다.  
   - 혹은 `tMap` 에서 바로 `sMap.getOrDefault(key, 0)` 과 비교하면 한 번의 순회로 검증이 가능합니다.

3. **공간 최적화**  
   - 두 개의 맵을 모두 유지할 필요가 없습니다. `s` 의 빈도를 `sMap` 에 저장한 뒤, `t` 를 순회하면서 해당 키의 값을 감소시키고, 중간에 음수가 되면 바로 `false` 를 반환하면 **O(1)** 의 추가 공간(알파벳이 26개라면 배열 사용) 혹은 **O(k)** (해시맵 하나) 로 줄일 수 있습니다.  

4. **알파벳 제한 활용**  
   - 문제는 영문 소문자만을 대상으로 하므로 `int[26]` 배열을 이용하면 더 빠르고 메모리 효율적인 구현이 가능합니다.  

5. **불필요한 `System.out.println` 제거**  
   - 디버깅용 출력은 제출 코드에 포함하면 안 됩니다.  

**예시 개선 코드 (해시맵 한 개 사용)**  
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

**예시 개선 코드 (배열 사용)**  
```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) cnt[c - 'a']++;
        for (char c : t.toCharArray()) {
            if (--cnt[c - 'a'] < 0) return false;
        }
        return true;
    }
}
```

위와 같이 수정하면 시간·공간 모두 최적화된 **O(n)** 시간, **O(1)** (배열) 혹은 **O(k)** (해시맵) 공간 복잡도를 갖는 깔끔한 풀이가 됩니다.
