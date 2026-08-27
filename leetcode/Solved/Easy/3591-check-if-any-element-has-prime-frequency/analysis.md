# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 27. 오후 1:20:36 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.8 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/check-if-any-element-has-prime-frequency/submissions/)

## Code Review

**1. 시간 복잡도**  
- `for (int i : nums)` : 배열 길이 *n*에 대해 O(n)  
- `for (int key : map.keySet())` : 서로 다른 값의 개수를 *k*라 하면 O(k)  
- `isPrime` 내부 루프는 √m (m은 해당 원소의 빈도)까지 검사 → 최악의 경우 빈도가 *n*이므로 O(√n)  
전체 시간 복잡도는 `O(n + k·√n)` ≈ **O(n·√n)** (k ≤ n 이므로). 실제로 빈도가 작을수록 더 빠릅니다.

**2. 공간 복잡도**  
- 원소별 빈도를 저장하기 위한 `HashMap`에 최대 *k*개의 엔트리가 들어감.  
- 추가적인 변수는 상수 개수.  
따라서 **O(k)**, 최악의 경우 **O(n)** 공간을 사용합니다.

**3. 풀이 접근법**  
- **해시 테이블**을 이용해 각 숫자의 등장 횟수를 카운트하고,  
- 각 빈도가 **소수**인지 검사하는 **수학적 검증**을 수행합니다.  
- `isPrime`은 2부터 √n까지 나눗셈을 시도하는 전형적인 소수 판정 알고리즘입니다.

**4. 잘된 점**  
- `Map.getOrDefault`를 활용한 깔끔한 빈도 카운팅.  
- `isPrime`을 별도 메서드로 분리해 가독성을 높임.  
- `keySet()`을 순회하면서 바로 빈도에 대해 소수 여부를 판단해 불필요한 연산을 최소화함.  

**5. 개선 사항**  

| 항목 | 내용 | 이유/대안 |
|------|------|-----------|
| **소수 판정 최적화** | `isPrime`에서 `i <= Math.sqrt(n)` 대신 `i*i <= n` 사용 | `Math.sqrt` 호출 비용을 피하고 정수 연산만으로 충분 |
| | 2와 짝수 처리 분리 | 짝수는 바로 `false` 반환, 루프는 3,5,7… (step 2) 로 진행하면 절반 정도 연산 감소 |
| **빈도 캐시** | 동일한 빈도가 여러 키에 나타날 경우(예: 여러 값이 같은 횟수) `isPrime` 결과를 메모이제이션 | 중복 계산 방지 → 최악 O(k·√n) → O(k + u·√n) (u는 서로 다른 빈도 수) |
| **입력 검증** | `nums`가 null이거나 길이가 0인 경우 빠르게 `true` 반환 | 예외 상황에 대한 방어 코드 추가 |
| **반환 로직** | 현재는 하나라도 소수가 아니면 `false` → 문제 요구가 “any element has prime frequency”인지 “all frequencies are prime”인지 명확히 확인 필요 | 요구에 맞게 로직을 `anyMatch` 혹은 `allMatch` 로 바꿀 수 있음 |
| **자료구조 선택** | `Int2IntOpenHashMap`(fastutil) 등 원시형 전용 해시맵 사용 시 메모리와 속도 개선 가능 | Java 기본 `HashMap<Integer,Integer>`는 박싱 오버헤드가 있음 |

위 개선점을 적용하면 특히 큰 입력(`n`≈10⁵~10⁶)에서 실행 시간이 눈에 띄게 빨라질 수 있습니다. 전체적인 구조는 매우 직관적이며, 작은 규모의 테스트에서는 현재 구현으로도 충분히 통과합니다.
