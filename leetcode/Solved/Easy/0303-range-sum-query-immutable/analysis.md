# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 26. 오후 4:35:52 |
| Language | java |
| Runtime | 8 ms (Beats 70.6%) |
| Memory | 47.6 MB (Beats 80.8%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/range-sum-query-immutable/submissions/)

## Code Review

**1. 시간 복잡도**  
- 생성자 `NumArray(int[] nums)` : 입력 배열을 한 번 순회하므로 **O(N)** (N = nums.length)  
- `sumRange(int left, int right)` : 사전 계산된 prefix sum 배열에서 두 인덱스만 접근하므로 **O(1)**  

**2. 공간 복잡도**  
- `arr` 배열을 입력 크기보다 1 크게 만든다. 따라서 **O(N)** 추가 메모리를 사용한다. (입력 배열 자체는 그대로 유지)

**3. 풀이 접근법**  
- **Prefix Sum (누적 합)** 을 이용한 전처리 방식. `arr[i]` 에는 `nums[0]` 부터 `nums[i‑1]` 까지의 합이 저장된다. 구간 합은 `arr[right+1] - arr[left]` 로 상수 시간에 계산한다.  

**4. 잘된 점**  
- 전처리와 쿼리 구현이 깔끔하고 직관적이다.  
- `arr` 를 1‑인덱스로 두어 경계 조건을 간단히 처리했다 (`arr[0] = 0`).  
- 불필요한 객체 생성이나 반복문을 최소화해 가독성이 좋다.  

**5. 개선 사항**  
1. **입력 검증**  
   - `nums` 가 `null` 이거나 `left/right` 가 배열 범위를 벗어나는 경우에 대한 방어 코드를 추가하면 더 안전하다.  

2. **불변성 보장**  
   - 현재 `arr` 은 `private` 이지만, 외부에서 `nums` 배열을 그대로 보관하고 있다면 원본 배열이 변할 위험이 있다.  
   - 생성자에서 `nums.clone()` 후 사용하거나, `arr` 만을 저장하고 `nums` 를 버리면 완전 불변성을 보장할 수 있다.  

3. **메모리 최적화 (대안)**  
   - 문제 제약이 매우 작다면 `int` 대신 `long` 을 사용해 오버플로우를 방지할 수 있다.  
   - 혹은 `int[]` 대신 `int[]` 를 그대로 사용하면서 `arr[0]` 에 0을 넣고 `for (int i = 1; i <= len; i++) arr[i] = arr[i‑1] + nums[i‑1];` 로 조금 더 명시적으로 작성해도 된다.  

4. **코드 스타일**  
   - `len` 변수는 한 번만 사용되므로 `int n = nums.length;` 로 선언하고 바로 `arr = new int[n + 1];` 로 연결하면 변수 선언이 줄어든다.  
   - `sumRange` 메서드에 `@Override` 같은 어노테이션은 필요 없지만, Javadoc 주석을 추가하면 사용법이 더 명확해진다.  

전반적으로 알고리즘 선택과 구현이 적절하며, 위의 작은 개선점을 반영하면 더욱 견고하고 유지보수하기 쉬운 코드가 될 것이다.
