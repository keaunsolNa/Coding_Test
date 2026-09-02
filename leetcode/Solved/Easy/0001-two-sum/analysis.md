# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 9. 2. 오후 11:19:39 |
| Language | java |
| Runtime | 12 ms (Beats 45.9%) |
| Memory | 48.7 MB (Beats 11.3%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/two-sum/submissions/)

## Code Review

**1. 시간 복잡도**  
- 현재 구현은 `HashMap`에 모든 원소를 저장하고(`O(n)`), 그 뒤에 `Arrays.sort(nums)` 로 정렬(`O(n log n)`)을 수행합니다.  
- 정렬 후 이중 루프를 사용해 두 포인터를 탐색하는데, 최악의 경우 `O(n²)`(i와 j가 각각 전체 배열을 탐색) 시간이 소요됩니다.  
- 따라서 전체 시간 복잡도는 **O(n² + n log n) ≈ O(n²)** 입니다.

**2. 공간 복잡도**  
- `HashMap<Integer, List<Integer>>`에 각 숫자와 해당 인덱스 리스트를 저장합니다. 최악의 경우 모든 원소가 서로 다른 값이므로 리스트 하나당 인덱스 하나씩 저장하게 되어 **O(n)** 공간을 사용합니다.  
- 정렬을 위해 `Arrays.sort`는 원본 배열을 직접 정렬하므로 추가적인 배열 복사는 없습니다.  
- 전체 공간 복잡도: **O(n)**.

**3. 풀이 접근법**  
- **해시맵 + 정렬 + 이중 루프** 방식을 사용했습니다.  
  1) 입력 배열을 해시맵에 “값 → 인덱스 리스트” 형태로 저장.  
  2) 배열을 정렬하고, 앞에서부터(`i`)와 뒤에서부터(`j`) 값을 더해 목표값과 비교.  
  3) 목표값을 찾으면 해시맵에서 원래 인덱스를 꺼내 반환합니다.  

**4. 잘된 점**  
- 같은 값이 여러 번 등장할 때를 대비해 `List<Integer>` 로 인덱스를 저장한 점은 견고합니다.  
- `one == two` 인 경우(같은 숫자를 두 번 사용해야 할 때) 인덱스를 두 개 꺼내는 로직을 별도로 처리한 점이 정확합니다.  
- `hab < target` 일 때 조기에 `break` 하여 불필요한 반복을 줄이려는 시도가 보입니다.

**5. 개선 사항**  
1. **시간 복잡도 최적화**  
   - Two‑Sum 문제는 해시맵을 한 번만 순회하면서 `target - nums[i]` 가 이미 등장했는지 확인하면 **O(n)** 시간에 해결할 수 있습니다.  
   - 예시 구현:  
     ```java
     Map<Integer, Integer> map = new HashMap<>();
     for (int i = 0; i < nums.length; i++) {
         int complement = target - nums[i];
         if (map.containsKey(complement)) {
             return new int[]{map.get(complement), i};
         }
         map.put(nums[i], i);
     }
     throw new IllegalArgumentException("No solution");
     ```
   - 이렇게 하면 정렬·이중 루프가 사라져 `O(n log n)` 혹은 `O(n²)` 를 피할 수 있습니다.

2. **불필요한 정렬 제거**  
   - 현재 정렬 후에 원래 인덱스를 찾기 위해 해시맵을 다시 조회하는데, 정렬 자체가 원본 인덱스 순서를 깨뜨리므로 해시맵을 사용해도 의미가 없습니다. 정렬을 없애고 바로 해시맵만 사용하면 코드가 간결해집니다.

3. **예외 처리**  
   - 현재 `return null;` 로 끝나는데, LeetCode에서는 항상 답이 존재한다는 전제가 있습니다. 그래도 명시적인 `throw new IllegalArgumentException` 이 더 안전합니다.

4. **코드 가독성**  
   - 변수명 `one`, `two`, `hab` 보다는 `leftVal`, `rightVal`, `sum` 등 의미가 명확한 이름을 쓰면 이해하기 쉽습니다.  
   - `if (map.get(nums[i]) == null)` 대신 `map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);` 와 같이 한 줄로 표현할 수 있습니다.

5. **중복 인덱스 처리 간소화**  
   - 같은 값이 두 번 필요할 경우(`one == two`) 현재 로직은 리스트의 첫 두 인덱스를 반환합니다. 하지만 위의 O(n) 한 번 순회 방식에서는 `complement == nums[i]` 인 경우 `map`에 이미 현재 인덱스가 저장되지 않았으므로 자동으로 다른 인덱스를 반환해 중복 처리 문제가 사라집니다.

**요약**  
현재 코드는 올바른 결과를 낼 수 있지만, 정렬·이중 루프 때문에 시간 복잡도가 `O(n²)` 로 비효율적입니다. 해시맵을 한 번만 순회하는 `O(n)` 알고리즘으로 교체하면 코드가 짧아지고 성능이 크게 개선됩니다. 또한 변수명·예외 처리·가독성을 다듬으면 더욱 품질 높은 구현이 됩니다.
