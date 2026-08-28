# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 3:05:01 |
| Language | java |
| Runtime | 1 ms (Beats 0.0%) |
| Memory | 42.3 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/minimum-absolute-difference/submissions/)

## Code Review

**1. 시간 복잡도**  
- `Arrays.sort(arr)` : O(N log N)  
- 첫 번째 for‑loop (인접 차이 계산) : O(N)  
- 두 번째 중첩 for‑loop (모든 쌍 탐색) : O(N²)  

전체 시간 복잡도는 O(N²) 입니다. 정렬 후 최소 차이를 구하는 단계는 효율적이지만, 최소 차이를 찾은 뒤 모든 쌍을 다시 탐색하는 부분이 병목이 됩니다.

**2. 공간 복잡도**  
- 정렬은 입력 배열을 제자리에서 수행하므로 추가적인 배열은 필요 없습니다.  
- 결과 리스트 `ans` 에는 최소 차이를 갖는 쌍만 저장되므로 최악의 경우 O(N) (예: 모든 인접 차이가 동일) 정도의 추가 공간이 필요합니다.  
- 임시 리스트 `temp` 는 각 쌍마다 새로 생성되지만, 동시에 하나만 존재하므로 O(1) 추가 공간으로 볼 수 있습니다.  

전체 공간 복잡도는 O(N) (결과 저장용) 입니다.

**3. 풀이 접근법**  
- 배열을 오름차순 정렬 후 인접 원소 사이의 차이를 검사해 전체 최소 차이 `minDiff` 를 구합니다.  
- 이후 이 최소 차이를 만족하는 모든 원소 쌍을 찾기 위해 이중 루프를 사용하고, 각 쌍을 오름차순 정렬해 결과 리스트에 추가합니다.  

**4. 잘된 점**  
- 정렬 후 인접 차이만 검사해 최소 차이를 구하는 아이디어는 최적이며, `Math.abs` 대신 `arr[j] - arr[i]` 로 차이를 구해도 무방합니다.  
- `Comparator.naturalOrder()` 로 쌍을 정렬해 결과 형식을 맞춘 점이 깔끔합니다.  
- 코드가 직관적이고 변수명(`minDiff`, `ans`)이 의미를 잘 전달합니다.

**5. 개선 사항**  
1. **불필요한 O(N²) 탐색 제거**  
   - 최소 차이는 인접 원소 사이에서만 발생한다는 사실을 이용하면, 두 번째 루프를 `for (int i = 0; i < arr.length - 1; i++) { if (arr[i+1] - arr[i] == minDiff) add pair }` 로 바꿀 수 있습니다. 이렇게 하면 전체 시간 복잡도가 O(N log N) 로 감소합니다.  

2. **쌍의 정렬 제거**  
   - 정렬된 배열이므로 `arr[i] < arr[i+1]` 가 항상 성립합니다. 따라서 `temp.add(arr[i]); temp.add(arr[i+1]);` 만 하면 이미 오름차순이 보장됩니다. `temp.sort(...)` 호출을 없애면 약간의 상수 시간 절감이 가능합니다.  

3. **불필요한 `Math.abs`**  
   - 정렬 후 `arr[i+1] >= arr[i]` 이므로 `Math.abs` 를 사용할 필요가 없습니다. `int diff = arr[i+1] - arr[i];` 로 간단히 계산할 수 있습니다.  

4. **코드 간결화**  
   - `List<Integer> temp = Arrays.asList(arr[i], arr[i+1]);` 로 바로 리스트를 만들고 `ans.add(temp);` 하면 가독성이 높아집니다 (단, `Arrays.asList` 로 만든 리스트는 고정 크기이므로 `add`/`remove`가 필요 없을 때만 사용).  

**수정된 핵심 로직 예시**

```java
Arrays.sort(arr);
int minDiff = Integer.MAX_VALUE;
for (int i = 0; i < arr.length - 1; i++) {
    minDiff = Math.min(minDiff, arr[i + 1] - arr[i]);
}

List<List<Integer>> ans = new ArrayList<>();
for (int i = 0; i < arr.length - 1; i++) {
    if (arr[i + 1] - arr[i] == minDiff) {
        ans.add(Arrays.asList(arr[i], arr[i + 1]));
    }
}
return ans;
```

이렇게 하면 시간 복잡도는 **O(N log N)**, 공간 복잡도는 **O(N)** (결과 저장) 로 최적화됩니다.
