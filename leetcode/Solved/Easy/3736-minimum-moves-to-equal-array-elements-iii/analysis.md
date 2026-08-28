# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 1:30:59 |
| Language | java |
| Runtime | 2 ms (Beats 0.0%) |
| Memory | 42.6 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/minimum-moves-to-equal-array-elements-iii/submissions/)

## Code Review

**1. 시간 복잡도**  
- `Arrays.stream(nums).boxed().toArray(...)` : O(N)  
- `Arrays.sort(result, Collections.reverseOrder())` : O(N log N) (역순 정렬)  
- `for` 루프 : O(N)  

전체 시간 복잡도는 **O(N log N)** 입니다. 정렬이 가장 큰 비용을 차지합니다.

**2. 공간 복잡도**  
- `Integer[] result` 를 새로 만들면서 `int[]` → `Integer[]` 로 변환하므로 추가로 O(N) 의 힙 메모리가 필요합니다.  
- 정렬 과정에서도 내부적으로 O(N) 의 보조 배열을 사용할 수 있습니다.  

따라서 **O(N)** 의 추가 공간을 사용합니다.

**3. 풀이 접근법**  
- 배열의 최댓값을 기준으로 모든 원소를 최댓값으로 만들기 위해 필요한 차이의 합을 구합니다.  
- `max - nums[i]` 를 모두 더하면 최소 이동 횟수가 됩니다. (문제에서 “한 번에 모든 원소를 1씩 감소시키는 것과 동일”이라는 사실을 이용)

**4. 잘된 점**  
- 로직 자체는 간단하고 올바르게 동작합니다.  
- `max` 를 미리 구하고 차이를 누적하는 방식이 직관적이며 가독성이 좋습니다.  
- `Collections.reverseOrder()` 로 내림차순 정렬을 시도한 점은 `max` 를 쉽게 찾기 위한 의도였으나, 실제로는 최댓값만 필요하므로 과도한 작업이지만 시도 자체는 이해하기 쉽습니다.

**5. 개선 사항**  
1. **불필요한 객체 변환 제거**  
   - `int[]` 를 `Integer[]` 로 박싱하고 다시 정렬할 필요가 없습니다. `int` 배열을 그대로 순회하면서 최댓값을 찾으면 O(N) 시간, O(1) 추가 공간으로 해결할 수 있습니다.  
   ```java
   int max = nums[0];
   for (int v : nums) {
       if (v > max) max = v;
   }
   int ans = 0;
   for (int v : nums) {
       ans += max - v;
   }
   return ans;
   ```
2. **정렬 제거**  
   - 최댓값만 필요하므로 정렬 O(N log N) 을 수행할 필요가 없습니다. 위와 같이 한 번의 선형 스캔으로 `max` 를 찾으면 전체 시간 복잡도를 **O(N)** 로 낮출 수 있습니다.  
3. **코드 간결화**  
   - `Arrays.stream` 을 사용하면 가독성이 떨어지고 박싱 오버헤드가 발생합니다. 전통적인 `for` 루프가 더 효율적이며 LeetCode 같은 환경에서는 권장됩니다.  

**요약**  
현재 구현은 정답을 구하지만, `Integer` 박싱 및 정렬 때문에 불필요한 시간·공간 비용이 발생합니다. 최댓값을 한 번의 선형 스캔으로 찾고 차이를 누적하면 **시간 복잡도 O(N), 공간 복잡도 O(1)** 로 최적화할 수 있습니다. 코드도 간단해져 가독성이 향상됩니다.
