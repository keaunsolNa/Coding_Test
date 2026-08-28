# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 3:07:33 |
| Language | java |
| Runtime | 16 ms (Beats 0.0%) |
| Memory | 52.4 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/minimum-absolute-difference/submissions/)

## Code Review

**1. 시간 복잡도**  
- 전체 복잡도: **O(N log N)**  
- `Arrays.sort(arr)` 로 배열을 정렬하는 데 O(N log N) 시간이 소요됩니다.  
- 이후 두 번의 `for` 루프는 각각 O(N)이며, 정렬 외의 연산은 선형이므로 전체는 O(N log N) 입니다.

**2. 공간 복잡도**  
- 정렬은 입력 배열을 제자리에서 수행하므로 추가적인 배열 복사는 없습니다.  
- 결과 리스트 `result` 에는 최소 차이를 갖는 쌍만 저장되므로 최악의 경우에도 O(N) (모든 인접 쌍이 최소 차이를 가질 때) 정도의 공간이 필요합니다.  
- 따라서 전체 공간 복잡도는 **O(N)** (출력 공간 포함) 입니다.

**3. 풀이 접근법**  
- **정렬 + 인접 차이 탐색** 패턴을 사용했습니다.  
- 배열을 오름차순 정렬한 뒤, 인접 원소 사이의 차이를 모두 계산해 최소값을 찾고, 다시 한 번 순회하면서 그 최소값과 같은 차이를 갖는 쌍을 결과에 추가합니다.  
- 이 방법은 최소 절대 차이가 반드시 정렬된 배열의 인접 원소 사이에 존재한다는 성질을 이용합니다.

**4. 잘된 점**  
- 정렬 후 인접 차이만 확인하는 아이디어가 정확하고 간결합니다.  
- `Math.min` 과 `List.of` 를 활용해 코드가 읽기 쉽고 가독성이 좋습니다.  
- `minDifference` 를 큰 값(`1 << 30`)으로 초기화해 오버플로우 위험을 회피한 점도 적절합니다.  
- 불필요한 변수 선언을 최소화하고 로직을 두 개의 명확한 단계(최소값 탐색, 결과 수집)로 나눈 구조가 깔끔합니다.

**5. 개선 사항**  
1. **초기값 설정**  
   - `int minDifference = Integer.MAX_VALUE;` 로 초기화하면 의미가 더 명확하고, `1 << 30` 보다 더 안전합니다.  

2. **한 번의 순회로 최소값과 결과 동시에 구하기**  
   - 현재는 두 번 순회하지만, 최소 차이를 찾는 동시에 결과 리스트에 추가/제거하는 방식으로 **한 번의 순회**로 구현할 수 있습니다.  
   - 예시:  
     ```java
     List<List<Integer>> result = new ArrayList<>();
     int minDiff = Integer.MAX_VALUE;
     for (int i = 0; i < arr.length - 1; i++) {
         int diff = arr[i + 1] - arr[i];
         if (diff < minDiff) {
             minDiff = diff;
             result.clear();
             result.add(List.of(arr[i], arr[i + 1]));
         } else if (diff == minDiff) {
             result.add(List.of(arr[i], arr[i + 1]));
         }
     }
     ```  
   - 이렇게 하면 전체 시간은 동일하지만 상수 팩터가 줄어들어 약간 더 효율적입니다.

3. **입력 검증**  
   - 문제 제한에 따라 필요 없을 수 있지만, `arr.length < 2` 인 경우를 방어적으로 처리하면 함수 사용 시 안정성이 높아집니다.

4. **불변 리스트 사용**  
   - `List.of` 로 만든 리스트는 불변이므로, 반환값을 수정하려는 경우 `new ArrayList<>(List.of(...))` 로 복사하는 것이 안전합니다. (LeetCode에서는 보통 수정하지 않으므로 큰 문제는 아닙니다.)

전반적으로 코드가 명확하고 요구사항을 정확히 만족합니다. 위의 작은 개선점을 적용하면 약간의 성능 향상과 가독성 개선을 기대할 수 있습니다.
