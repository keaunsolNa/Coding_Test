# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 4:04:38 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.4 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/valid-anagram/submissions/)

## Code Review

**코드 리뷰**

---

### 1. 시간 복잡도  
- **전체 복잡도: O(n + m)**  
  - `s`와 `t` 각각을 한 번씩 순회하면서 해시맵에 삽입/갱신 → 각각 O(n), O(m) (n = s.length, m = t.length)  
  - 마지막에 `sMap.keySet()`을 순회하면서 `tMap`에서 값을 조회 → 최악의 경우 O(Alphabet) 정도이지만 실제로는 O(k) (k는 서로 다른 문자 수)이며, k ≤ min(n, m) 이다.  
  - 따라서 전체는 선형 시간 복잡도이다.  

---

### 2. 공간 복잡도  
- **O(k₁ + k₂)** (k₁, k₂는 각각 `s`와 `t`에 등장하는 서로 다른 문자 수)  
  - 두 개의 `HashMap<Character, Integer>`을 사용하므로 입력 문자열에 포함된 고유 문자 수만큼 메모리를 차지한다.  
  - 알파벳이 제한된 경우(예: 소문자 a‑z) 최악의 경우 O(1) 공간이 된다.  

---

### 3. 풀이 접근법  
- **해시 테이블(맵) 기반 카운팅**  
  - 각 문자열에 대해 문자 빈도를 `Map<Character, Integer>`에 저장하고, 두 맵을 비교하여 같은 빈도를 갖는지 확인한다.  
  - 이는 “문자 빈도 비교”라는 전형적인 애너그램 판별 방법이다.  

---

### 4. 잘된 점  
1. **선형 시간**으로 문제를 해결하려는 시도가 좋다.  
2. `Map.getOrDefault`를 활용해 빈도 증가 로직을 간결하게 작성한 점이 인상적이다.  
3. 코드 구조가 명확하고, 로직 흐름(맵 생성 → 비교 → 반환)이 읽기 쉽다.  

---

### 5. 개선 사항  
1. **키 조회 오류**  
   ```java
   sMap.put(c, sMap.getOrDefault(s, 0) + 1);
   tMap.put(c, tMap.getOrDefault(s, 0) + 1);
   ```  
   - `getOrDefault`의 첫 번째 인자는 현재 문자 `c`이어야 한다. 현재는 문자열 `s`를 넘겨 `null`이 반환되어 `NullPointerException`이 발생한다.  
   - 수정: `sMap.getOrDefault(c, 0)` / `tMap.getOrDefault(c, 0)`  

2. **불필요한 두 번째 맵**  
   - 두 문자열의 길이가 다르면 바로 `false`를 반환하고, 길이가 같다면 하나의 맵만 사용해도 된다.  
   - `t`를 순회하면서 `sMap`의 값을 감소시키고, 중간에 음수가 되면 `false` 반환 → 최종적으로 모든 값이 0인지 확인하면 된다.  
   - 이렇게 하면 **공간을 O(k)** 로 절감할 수 있다.  

3. **키 존재 여부 검사**  
   - 현재 `tMap.get(key) != sMap.get(key)` 로 비교하지만, `tMap`에 키가 없을 경우 `null`이 반환되어 `NullPointerException`이 발생한다.  
   - `Integer` 객체 비교 대신 `intValue` 혹은 `Objects.equals` 사용이 안전하다.  

4. **알파벳 제한 활용**  
   - 문제에서 입력이 영문 소문자만이라면 `int[26]` 배열을 이용해 빈도를 저장하면 **시간·공간 모두 O(n)** 이면서 상수 메모리 사용이 가능하다.  

5. **코드 간결화 예시** (한 개의 배열 사용)

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

   - 이 구현은 가독성도 좋고, 불필요한 객체 생성이 없어 성능면에서 최적이다.  

---

**요약**  
현재 코드는 아이디어는 올바르지만 `getOrDefault` 인자 오류와 두 개의 맵 사용으로 인한 불필요한 메모리 사용이 있다. 하나의 맵(또는 배열)만으로 구현하면 더 안전하고 효율적인 풀이가 된다. 위의 수정 사항을 반영하면 코드 품질이 크게 향상될 것이다.
