# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 9. 2. 오후 4:35:56 |
| Language | java |
| Runtime | 2122 ms (Beats 10.5%) |
| Memory | 51.5 MB (Beats 56.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/assign-cookies/submissions/)

## Code Review

**1. 시간 복잡도**  
- 정렬: `Arrays.sort(g)`와 `Arrays.sort(s)` 각각 O(n log n)·O(m log m) (n = g.length, m = s.length)  
- 이중 루프: 외부 `for (i)`는 n 번, 내부 `for (j)`는 전체에서 한 번씩만 진행되므로 총 O(n + m)  
- 전체 복잡도: **O(n log n + m log m)** (정렬이 지배)

**2. 공간 복잡도**  
- `Arrays.sort`는 Java 내부에서 퀵소트/티머소트를 사용하므로 추가적인 힙 메모리는 O(1) (인플레이스 정렬)  
- 사용한 변수들(`startIdx`, `ans`, `grid`, `size`)은 O(1)  
- 전체 공간 복잡도: **O(1)** (입력 배열 외에 별도 메모리 사용 없음)

**3. 풀이 접근법**  
- **그리디 + 두 포인터** 전략: 가장 작은 요구량(g)부터 가장 작은 쿠키(s)를 매칭한다.  
- `startIdx`를 이용해 쿠키 배열을 한 번만 순회하도록 하여, 이미 사용한 쿠키는 다시 보지 않는다.  

**4. 잘된 점**  
- 정렬 후 그리디 매칭을 정확히 구현했으며, 불필요한 중복 탐색을 방지하기 위해 `startIdx`를 사용한 점이 좋다.  
- 코드가 직관적이며 변수 이름(`grid`, `size`)이 의미를 잘 전달한다.  
- `break`를 통해 매칭이 성공하면 바로 다음 아이로 넘어가 효율성을 유지한다.  

**5. 개선 사항**  
1. **이중 루프를 단일 루프로 통합**  
   - 현재는 외부 `for`와 내부 `for`가 중첩돼 있지만, 실제로는 두 포인터(`i`, `j`)를 동시에 움직이면 한 번의 루프로 구현 가능하다.  
   ```java
   int i = 0, j = 0, ans = 0;
   while (i < g.length && j < s.length) {
       if (g[i] <= s[j]) { ans++; i++; j++; }
       else { j++; }
   }
   return ans;
   ```
   - 이렇게 하면 코드가 더 간결해지고, 가독성이 향상된다.  

2. **불필요한 변수 제거**  
   - `grid`와 `size`는 바로 `g[i]`, `s[j]`로 대체 가능해 메모리와 선언을 줄일 수 있다.  

3. **입력 검증**  
   - LeetCode에서는 보통 필요 없지만, 실제 서비스 코드라면 `null` 체크와 빈 배열 처리(`if (g == null || s == null) return 0;`)를 추가하는 것이 안전하다.  

4. **정렬 알고리즘 명시**  
   - `Arrays.sort`는 기본적으로 듀얼 피벗 퀵소트를 사용하지만, 최악의 경우 O(n²) 위험이 있다.  
   - 안정적인 O(n log n) 보장을 원한다면 `Arrays.parallelSort`(멀티코어) 혹은 `Collections.sort`(리스트) 등을 고려할 수 있다.  

전반적으로 현재 구현은 올바른 그리디 전략을 사용했으며, 위와 같은 작은 리팩터링을 하면 코드가 더 간결하고 유지보수하기 쉬워집니다.
