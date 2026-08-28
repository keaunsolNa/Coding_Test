# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 2:54:58 |
| Language | java |
| Runtime | 1 ms (Beats 0.0%) |
| Memory | 43 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/minimum-absolute-difference/submissions/)

## Code Review

**1. 시간 복잡도**  
- `Arrays.sort(arr)` : O(N log N)  
- 첫 번째 `for` 루프 (인접 차이 계산) : O(N)  
- 두 번째 중첩 `for` 루프 (모든 쌍 탐색) : O(N²)  

전체 시간 복잡도는 O(N²) 입니다. 정렬 이후 최소 차이를 구하는 단계는 O(N)으로 충분하지만, 최소 차이를 만족하는 모든 쌍을 찾는 부분을 전체 탐색으로 구현해 비효율적입니다.

---

**2. 공간 복잡도**  
- 정렬을 위한 추가 공간 : `Arrays.sort`는 원본 배열을 제자리 정렬하므로 O(1) (또는 Java 내부에서 퀵소트/티머소트가 사용하는 O(log N) 스택)  
- 결과 리스트 `ans` : 최소 차이를 갖는 쌍의 개수만큼 저장 → 최악의 경우 O(N) (예: 모든 인접 차이가 동일)  

따라서 전체 공간 복잡도는 O(N) 입니다.

---

**3. 풀이 접근법**  
- 배열을 오름차순 정렬 후 인접 원소 사이의 차이를 조사해 전체 최소 차이 `minDiff` 를 찾는다.  
- 그 후 두 중첩 루프를 사용해 모든 (i, j) 쌍을 검사하고, 차이가 `minDiff` 와 일치하면 결과에 추가한다.  

이 접근법은 “정렬 후 인접 차이만 고려하면 최소 차이를 찾을 수 있다”는 핵심 아이디어는 잘 활용했지만, 두 번째 단계에서 불필요하게 전체 조합을 탐색하고 있습니다.

---

**4. 잘된 점**  
- 정렬 후 인접 차이만으로 최소 차이를 정확히 구하는 로직이 올바르게 구현되었습니다.  
- `Math.abs` 대신 정렬된 배열이므로 `arr[i+1] - arr[i]` 로도 충분함을 인식하고, `Math.min` 으로 최소값을 갱신하는 부분이 깔끔합니다.  
- 결과를 `List<List<Integer>>` 형태로 반환하는 요구사항을 정확히 만족시켰습니다.

---

**5. 개선 사항**  
1. **불필요한 O(N²) 탐색 제거**  
   - 최소 차이는 인접 원소 사이에서만 발생하므로, 두 번째 중첩 루프 대신 첫 번째 루프를 다시 활용하면 된다.  
   - 예시:  
   ```java
   List<List<Integer>> ans = new ArrayList<>();
   for (int i = 0; i < arr.length - 1; i++) {
       if (arr[i + 1] - arr[i] == minDiff) {
           ans.add(Arrays.asList(arr[i], arr[i + 1]));
       }
   }
   ```
   - 이렇게 하면 전체 시간 복잡도가 O(N log N) (정렬) + O(N) 로 감소합니다.

2. **결과 순서 보장**  
   - 현재 `temp.add(arr[j]); temp.add(arr[i]);` 로 추가하고 있어 쌍이 내림차순(큰 값 먼저)으로 저장됩니다.  
   - 문제에서는 `[a, b]` (a < b) 형태를 요구하므로 `arr[i]` 를 먼저 넣는 것이 바람직합니다.

3. **불필요한 `Math.abs` 제거**  
   - 배열이 정렬돼 있으므로 `arr[i+1] - arr[i]` 은 항상 양수이며, `Math.abs` 호출 비용을 없앨 수 있습니다.

4. **코드 간결화**  
   - `temp` 리스트를 만들 때 `Arrays.asList` 를 활용하면 한 줄로 표현 가능하고 가독성이 향상됩니다.

5. **예외 처리**  
   - 입력 배열 길이가 2 미만인 경우(문제에서는 보장되지 않음)에도 안전하게 동작하도록 초기 검사를 추가할 수 있습니다.

**수정된 전체 코드 예시**

```java
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;

        // 최소 차이 찾기
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff < minDiff) minDiff = diff;
        }

        // 최소 차이를 갖는 인접 쌍 수집
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == minDiff) {
                ans.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return ans;
    }
}
```

이렇게 개선하면 시간 복잡도는 **O(N log N)**, 공간 복잡도는 **O(N)** (결과 리스트) 로 최적화됩니다.
