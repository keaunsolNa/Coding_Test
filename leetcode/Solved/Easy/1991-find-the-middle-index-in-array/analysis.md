# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 5:27:21 |
| Language | java |
| Runtime | 1 ms (Beats 0.0%) |
| Memory | 42.6 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-the-middle-index-in-array/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(N)**  
  - `Arrays.stream(nums).sum()` 로 전체 합을 한 번 계산하고, 이후 한 번의 for‑loop 로 배열을 순회합니다. 두 번의 선형 스캔이지만 상수 배수이므로 전체 복잡도는 O(N) 입니다.

**2. 공간 복잡도**  
- **O(1)**  
  - 추가적인 배열이나 컬렉션을 사용하지 않고, `left`, `right`, `i` 등 몇 개의 정수 변수만 사용합니다. 따라서 입력 크기에 비례하는 메모리를 할당하지 않습니다.

**3. 풀이 접근법**  
- **Prefix Sum (누적 합) + Suffix Sum**  
  - 처음에 전체 합(`right`)을 구하고, 순회하면서 현재 인덱스를 기준으로 왼쪽 누적 합(`left`)과 오른쪽 누적 합(`right`)을 업데이트합니다.  
  - `left == right` 가 되면 해당 인덱스가 “중간 인덱스”가 됩니다. 이는 전형적인 “좌우 합이 같은 인덱스 찾기” 문제에 대한 표준 풀이입니다.

**4. 잘된 점**  
- **간결함**: 불필요한 배열 복사나 추가 자료구조 없이 한 번의 루프로 해결했습니다.  
- **가독성**: 변수 이름(`left`, `right`)이 의미를 잘 전달하고, 로직 흐름이 직관적입니다.  
- **예외 처리**: 중간 인덱스를 찾지 못했을 때 `-1`을 반환해 문제 요구사항을 정확히 만족합니다.  

**5. 개선 사항**  
- **`Arrays.stream(nums).sum()` 의 비용**  
  - 현재 전체 합을 구하기 위해 스트림을 사용하고 있는데, 이는 내부적으로 또 하나의 O(N) 루프를 수행합니다.  
  - **대안**: `for` 문 안에서 `right` 를 초기화하면서 동시에 전체 합을 구하면 한 번의 순회만으로도 `right` 와 `left` 를 모두 준비할 수 있습니다.

  ```java
  int left = 0, right = 0;
  for (int num : nums) right += num;   // 한 번에 전체 합 계산
  for (int i = 0; i < nums.length; i++) {
      right -= nums[i];
      if (left == right) return i;
      left += nums[i];
  }
  ```

- **경계 조건 명시**  
  - 배열이 비어 있는 경우(`nums.length == 0`)에 대한 명시적인 처리(예: 바로 `-1` 반환)를 추가하면 코드가 더 견고해집니다.

- **스트림 사용 최소화**  
  - LeetCode 같은 온라인 저지에서는 스트림이 오히려 성능 오버헤드를 유발할 수 있으므로, 순수 `for` 루프를 사용하는 것이 일반적으로 더 빠릅니다.

전반적으로 매우 깔끔하고 효율적인 구현이며, 위의 작은 최적화를 적용하면 약간의 성능 향상과 코드 일관성을 얻을 수 있습니다.
