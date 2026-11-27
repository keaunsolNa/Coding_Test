# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 11. 27. 오후 5:51:36 |
| Language | java |
| Runtime | 0 ms (Beats 100.0%) |
| Memory | 42.7 MB (Beats 50.6%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/sum-of-all-odd-length-subarrays/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(N)** : `for` 루프가 배열 길이 `length` 만큼 한 번만 순회합니다. 루프 내부 연산은 모두 상수 시간에 수행되므로 전체 시간 복잡도는 선형입니다.

**2. 공간 복잡도**  
- **O(N)** : `odd`와 `even` 두 개의 길이 `N`인 배열을 추가로 사용합니다. 결과값을 저장하기 위한 변수 `totalSum`은 O(1)입니다. 따라서 전체 추가 메모리는 입력 크기에 비례합니다.

**3. 풀이 접근법**  
- **동적 누적(동적 프로그래밍) + 수학적 관찰**  
  - `odd[i]`는 인덱스 `i`를 끝으로 하는 모든 **홀수 길이** 부분 배열의 합을, `even[i]`는 **짝수 길이** 부분 배열의 합을 저장합니다.  
  - 이전 인덱스의 `even`(또는 `odd`) 값에 현재 원소를 적절히 곱한 값을 더해 현재 `odd`/`even` 값을 구합니다.  
  - 이렇게 하면 각 원소가 포함되는 홀수 길이 부분 배열들의 기여도를 O(1)로 누적할 수 있습니다.

**4. 잘된 점**  
- **단일 패스** 로 문제를 해결해 시간 효율이 높습니다.  
- `odd`와 `even`을 구분해 재사용함으로써 중복 계산을 방지했습니다.  
- 코드가 간결하고 변수 이름(`odd`, `even`, `totalSum`)이 의미를 잘 전달합니다.  

**5. 개선 사항**  
1. **공간 최적화**  
   - `odd[i]`와 `even[i]`는 바로 이전 값만 필요하므로 전체 배열을 유지할 필요가 없습니다.  
   - `prevOdd`, `prevEven` 같은 두 개의 변수만 사용하면 **O(1)** 추가 메모리로 구현할 수 있습니다.  

   ```java
   int prevOdd = arr[0];
   int prevEven = 0;
   int total = prevOdd;
   for (int i = 1; i < n; ++i) {
       int curOdd  = prevEven + arr[i] * (i / 2 + 1);
       int curEven = prevOdd  + arr[i] * ((i + 1) / 2);
       total += curOdd;
       prevOdd = curOdd;
       prevEven = curEven;
   }
   ```

2. **가독성**  
   - `i / 2 + 1` 와 `((i + 1) / 2)` 부분을 의미를 명확히 하기 위해 별도 메서드 혹은 주석을 달면 이해가 쉬워집니다.  
   - `length` 대신 관례적인 `n`을 사용하거나, `arr.length`를 직접 활용해 변수 선언을 줄일 수 있습니다.

3. **예외 처리**  
   - 입력 배열이 비어 있는 경우 (`arr.length == 0`)에 대한 방어 코드가 없으므로, `arr[0]` 접근 시 `ArrayIndexOutOfBoundsException`이 발생합니다.  
   - `if (arr == null || arr.length == 0) return 0;` 와 같은 초기 검사를 추가하는 것이 안전합니다.

4. **대안 알고리즘**  
   - 수학적 공식을 이용해 각 원소가 전체 답에 기여하는 횟수를 직접 계산하는 방법도 있습니다.  
     - 원소 `arr[i]`가 포함되는 **홀수 길이** 부분 배열의 개수는 `((i+1)*(n-i)+1)/2` 로 구할 수 있어, 전체 합을 `Σ arr[i] * count(i)` 로 O(N) 시간·O(1) 공간에 해결할 수 있습니다.  
   - 이 접근법은 코드가 더 짧아지고, `odd/even` 배열을 전혀 사용하지 않으므로 메모리 사용량이 최소화됩니다.

---

**요약**  
현재 구현은 O(N) 시간·O(N) 공간으로 올바르게 동작하지만, 이전 값만 보관하면 O(1) 공간으로 최적화할 수 있습니다. 또한 입력 검증과 가독성을 조금 더 보강하면 더욱 견고하고 읽기 쉬운 코드가 됩니다.
