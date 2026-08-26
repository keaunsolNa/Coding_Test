# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 26. 오후 4:36:06 |
| Language | java |
| Runtime | 2 ms (Beats 97.0%) |
| Memory | 44.5 MB (Beats 92.2%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/intersection-of-two-arrays/submissions/)

## Code Review

**1. 시간 복잡도**  
- `for (int i : nums1)` : O(n) (n = nums1.length)  
- `for (int i : nums2)` : O(m) (m = nums2.length)  
- `list.contains(i)` 는 `ArrayList` 에서 선형 탐색이므로 최악의 경우 O(k) (k = 현재 리스트 크기) 가 추가된다. 전체 시간 복잡도는 **O(n + m·k)** 로, 최악의 경우 k ≈ min(n, m) 이므로 **O(n·m)** 에 가깝다.  

**2. 공간 복잡도**  
- `boolean[] arr = new boolean[1001]` : 고정 크기 1001 (문제에서 입력값이 0~1000 범위라고 가정) → O(1) (상수 공간)  
- `List<Integer> list` : 교집합에 포함되는 서로 다른 원소 수 만큼 저장 → O(min(n, m))  
전체 공간 복잡도는 **O(min(n, m))** (상수 배열을 제외하고는)  

**3. 풀이 접근법**  
- 입력 배열 중 하나(`nums1`)를 해시 테이블 역할을 하는 `boolean` 배열에 표시하고, 다른 배열(`nums2`)을 순회하면서 존재 여부와 중복 여부를 검사한다.  
- 중복 제거를 위해 `list.contains(i)` 로 이미 추가된 원소인지 확인한다.  

**4. 잘된 점**  
- 값의 범위가 0~1000 으로 제한된 경우 `boolean[]` 를 이용해 O(1) 시간에 존재 여부를 확인하는 아이디어는 매우 효율적이다.  
- `boolean` 배열을 사용해 별도의 `HashSet`을 만들지 않아 메모리 오버헤드가 적다.  
- 최종 결과를 `int[]` 로 변환하는 과정이 깔끔하게 구현되어 있다.  

**5. 개선 사항**  
1. **중복 검사 비용 감소**  
   - `list.contains(i)` 는 선형 탐색이므로 전체 시간 복잡도를 크게 늘린다.  
   - `HashSet<Integer> set = new HashSet<>();` 로 교집합 원소를 저장하면 `O(1)` 평균 시간에 중복 여부를 확인할 수 있다.  
   - 최종 배열 변환 시 `set` 을 순회하면 된다.  

2. **입력 값 범위에 대한 가정 명시**  
   - 현재 구현은 값이 0~1000 사이일 때만 동작한다. LeetCode 문제는 일반적인 정수 범위도 허용하므로, 범위가 보장되지 않을 경우 `HashSet` 기반 구현이 더 안전하다.  

3. **코드 간결화**  
   ```java
   public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> set1 = new HashSet<>();
       for (int num : nums1) set1.add(num);

       Set<Integer> result = new HashSet<>();
       for (int num : nums2) {
           if (set1.contains(num)) result.add(num);
       }

       int[] ans = new int[result.size()];
       int idx = 0;
       for (int v : result) ans[idx++] = v;
       return ans;
   }
   ```
   - `boolean[]` 를 쓰지 않아도 `HashSet` 하나만으로 충분히 O(n+m) 시간과 O(min(n,m)) 공간을 달성한다.  

4. **정렬 기반 대안**  
   - 두 배열을 각각 정렬한 뒤 두 포인터를 이용하면 `O(n log n + m log m)` 시간, `O(1)` 추가 공간(정렬에 사용되는 스택 제외) 으로도 해결 가능하다. 입력이 이미 정렬돼 있거나 메모리 제한이 엄격할 때 고려할 수 있다.  

**요약**  
현재 코드는 값 범위가 제한된 상황에서는 빠르고 메모리 효율적이지만, `list.contains` 로 인한 중복 검사 비용이 전체 시간 복잡도를 크게 악화시킨다. `HashSet` 을 사용해 중복 검사를 O(1) 로 바꾸거나, 정렬·두 포인터 방식을 적용하면 보다 일반적인 상황에서도 안정적인 O(n+m) 시간 복잡도를 얻을 수 있다.
