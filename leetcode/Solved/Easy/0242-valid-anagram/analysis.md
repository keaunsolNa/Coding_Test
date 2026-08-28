# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 4:14:14 |
| Language | java |
| Runtime | 17 ms (Beats 0.0%) |
| Memory | 45.4 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/valid-anagram/submissions/)

## Code Review

**코드 리뷰**

---

### 1. 시간 복잡도  
- 현재 구현은 문자열을 각각 한 번씩 순회하면서 `sMap`, `tMap`을 만든다 → **O(n)** (n = s와 t의 길이, 길이가 같다고 가정)  
- 이후 `sMap.keySet()` 과 `tMap.keySet()` 을 각각 순회한다. 키의 개수는 알파벳 종류(최대 26) 혹은 유니코드 문자 수에 비례하지만 최악의 경우에도 전체 문자 수와 동일하므로 추가 **O(k)** (k ≤ n) 이다.  
- 전체 시간 복잡도는 **O(n)** 로 충분히 효율적이다.  

### 2. 공간 복잡도  
- 두 개의 `HashMap<Character,Integer>` 에 각각 문자열에 등장하는 문자와 빈도를 저장한다. 최악의 경우 모든 문자가 서로 다르면 `Map` 의 크기는 n 이 된다.  
- 따라서 **O(n)** 의 추가 공간을 사용한다.  

### 3. 풀이 접근법  
- **해시 테이블(맵) 기반 빈도수 비교** 방식이다.  
  1) 두 문자열의 길이가 다르면 바로 `false`.  
  2) 각각의 문자열을 순회하면서 문자별 등장 횟수를 `Map`에 기록.  
  3) 두 `Map`을 비교하여 모든 키에 대해 빈도가 동일한지 확인한다.  

### 4. 잘된 점  
- 길이 검사를 먼저 수행해 불필요한 연산을 방지한 점이 좋다.  
- `Map.getOrDefault` 를 활용해 코드가 간결하고 가독성이 높다.  
- 디버깅용 `System.out.println` 을 넣어 중간 결과를 확인하려는 시도는 테스트 단계에서 유용하다.  

### 5. 개선 사항  
1. **불필요한 두 번째 Map 제거**  
   - 한 번의 `Map`만 사용하고, `t` 를 순회하면서 해당 문자 빈도를 감소시키는 방식으로 구현하면 공간을 **O(1)** (알파벳 26개 정도) 로 줄일 수 있다.  
   - 예시)  
   ```java
   int[] cnt = new int[26];
   for (char c : s.toCharArray()) cnt[c - 'a']++;
   for (char c : t.toCharArray()) {
       if (--cnt[c - 'a'] < 0) return false;
   }
   return true;
   ```
2. **현재 코드의 비교 로직 오류**  
   - `for (Character key : sMap.keySet())` 루프에서 실제 비교가 주석 처리돼 있다.  
   - `tMap.get(key)` 가 `null` 일 경우 `NullPointerException` 이 발생할 수 있다.  
   - 두 번째 루프만으로도 충분히 검증이 가능하지만, 첫 번째 루프에서도 `null` 체크와 `equals` 비교를 해야 한다.  
3. **디버깅 출력 제거**  
   - 제출 코드에는 `System.out.println` 이 포함되면 시간 초과 혹은 불필요한 I/O 비용이 발생한다. 디버깅이 끝났다면 삭제한다.  
4. **제네릭 타입 명시**  
   - `Map<Character, Integer> sMap = new HashMap<>();` 와 같이 선언은 좋지만, `new HashMap<>()` 로 타입 추론을 활용해 코드가 더 깔끔해진다.  

### 요약  
현재 구현은 시간 복잡도 면에서 충분히 효율적이며, 해시 테이블을 이용한 직관적인 방법이다. 그러나 두 개의 `Map`을 동시에 유지하고 비교 로직이 중복·오류 가능성이 있어, 하나의 배열(또는 하나의 `Map`)만 사용해 빈도를 조정하는 방식으로 개선하면 공간 효율과 코드 간결성을 동시에 얻을 수 있다. 디버깅용 출력은 제거하고, 빈도 비교 로직을 정확히 구현하면 완전한 정답이 된다.
