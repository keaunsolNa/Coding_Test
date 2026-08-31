# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 31. 오전 10:43:07 |
| Language | java |
| Runtime | 3 ms (Beats 0.0%) |
| Memory | 42.8 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/fruits-into-baskets-ii/submissions/)

## Code Review

**코드 리뷰 (한국어)**  

---

### 1. 시간 복잡도  
- 현재 구현은 두 개의 중첩 `for` 루프를 사용하고 있어 **O(N·M)** (N = `fruits.length`, M = `baskets.length`) 입니다.  
- 문제의 제약이 커질 경우(예: N, M ≤ 10⁵) 이 복잡도는 시간 초과(TLE)를 일으킬 가능성이 높습니다.  

### 2. 공간 복잡도  
- 추가적인 배열이나 컬렉션을 사용하지 않고 입력 배열만을 직접 수정하므로 **O(1)** (상수) 공간을 사용합니다.  

### 3. 풀이 접근법  
- **그리디 + 시뮬레이션** 방식으로, 각 과일을 순서대로 모든 바구니와 비교해 과일이 들어갈 수 있으면 해당 바구니 값을 `0` 으로 만들고 카운트를 감소시키는 식입니다.  
- 바구니를 사용한 뒤 `0` 으로 마킹하는 것이 “한 번 사용된 바구니를 다시 쓰지 않게” 하는 간단한 방법이지만, 효율적인 탐색 구조는 사용하지 않았습니다.  

### 4. 잘된 점  
- 로직이 직관적이라 이해하기 쉽습니다.  
- 별도의 복잡한 자료구조 없이 기본 배열과 반복문만으로 구현했으므로 코드가 짧고 가독성이 좋습니다.  
- `cnt` 변수를 활용해 남은 과일 개수를 바로 반환하는 점은 불필요한 후처리를 없앴습니다.  

### 5. 개선 사항 / 대안적 접근법  
1. **정렬 + 이분 탐색**  
   - `fruits`와 `baskets`를 각각 오름차순 정렬(O(N log N) + O(M log M)) 후, 작은 과일부터 가능한 가장 작은 바구니에 할당하면 전체 탐색을 O(N+M) 로 줄일 수 있습니다.  
   - 구현 예시:  
     ```java
     Arrays.sort(fruits);
     Arrays.sort(baskets);
     int i = 0, j = 0, placed = 0;
     while (i < fruits.length && j < baskets.length) {
         if (fruits[i] <= baskets[j]) {
             placed++;
             i++; j++;
         } else {
             j++; // 현재 바구니가 작으면 더 큰 바구니 찾기
         }
     }
     return fruits.length - placed;
     ```
2. **TreeSet 활용**  
   - `TreeSet<Integer>`에 바구니 용량을 저장하고 `ceiling(fruit)` 로 과일을 담을 수 있는 최소 바구니를 O(log M) 에 찾은 뒤, 해당 값을 `remove` 하면 전체 복잡도는 O((N+M) log M).  
   - 이 방법은 바구니를 재사용하지 않으면서도 정렬 없이 동적 삽입/삭제가 가능합니다.  

3. **불필요한 `System.out.println` 제거**  
   - 디버깅용 출력은 성능에 악영향을 줍니다. 제출 코드에서는 반드시 삭제해야 합니다.  

4. **바구니 사용 표시 방식 개선**  
   - 현재는 바구니 값을 `0` 으로 바꾸지만, 바구니 용량이 `0` 일 수도 있는 경우(문제 정의에 따라) 충돌이 발생할 수 있습니다. 대신 `boolean[] used` 같은 별도 마킹 배열을 쓰거나, 위의 `TreeSet`/정렬 방식으로 바꾸는 것이 안전합니다.  

5. **경계 조건 처리**  
   - `fruits` 혹은 `baskets` 가 빈 배열일 때도 정상 동작하지만, 명시적인 체크(`if (fruits.length == 0) return 0;`) 를 추가하면 가독성이 향상됩니다.  

---

**요약**  
현재 코드는 O(N·M) 시간 복잡도로 비효율적이며, 정렬 + 두 포인터 혹은 `TreeSet` 기반 이분 탐색을 적용하면 O(N log N + M log M) 혹은 O((N+M) log M) 로 크게 개선됩니다. 또한 디버깅 출력은 제거하고, 바구니 사용 표시 방식을 명확히 하면 보다 안전하고 빠른 풀이가 됩니다.
