# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 27. 오후 1:22:18 |
| Language | java |
| Runtime | 4 ms (Beats 0.0%) |
| Memory | 42.9 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/check-if-any-element-has-prime-frequency/submissions/)

## Code Review

**1. 시간 복잡도**  
- **전체 복잡도: O(N + M·√K)**  
  - `for (int i : nums)` 에서 배열을 한 번 순회하므로 O(N) (N = nums.length).  
  - 각 서로 다른 원소에 대해 빈도 `freq` 를 소수 판별(`isPrime`)에 넘기는데, 소수 판별은 최악 경우 √freq 만큼 반복하므로 O(√K) (K = 최대 빈도).  
  - 서로 다른 원소의 개수를 M이라 하면 전체 소수 판별 비용은 O(M·√K).  
  - 일반적인 입력에서는 K ≤ N 이므로 최악 시간 복잡도는 O(N + M·√N) ≈ O(N·√N) 정도가 된다.  

**2. 공간 복잡도**  
- **O(M)** : `HashMap<Integer,Integer>` 에서 서로 다른 값의 개수만큼 메모리를 사용한다.  
  - 최악 경우 모든 원소가 서로 다르면 M = N 이므로 O(N) 공간을 차지한다.  

**3. 풀이 접근법**  
- **빈도 카운팅 + 소수 판별** 이라는 전형적인 “해시맵 + 수학” 패턴을 사용했다.  
  1. `HashMap` 으로 각 숫자의 등장 횟수를 셈.  
  2. 빈도가 1인 경우는 무시하고, 그 외에 대해 `isPrime` 로 소수 여부를 검사.  
  3. 하나라도 소수가 아니면 `false` 반환, 모두 소수이면 `true` 반환.  

**4. 잘된 점**  
- `Map.getOrDefault` 를 활용해 카운팅 로직을 간결하게 구현한 점이 좋다.  
- `isPrime` 함수가 독립적으로 구현돼 가독성이 높으며, `Math.sqrt` 를 이용해 불필요한 반복을 줄인 점도 긍정적이다.  
- `continue` 로 빈도 1을 빠르게 건너뛰어 불필요한 소수 검사를 방지한 점도 효율적이다.  

**5. 개선 사항**  
1. **소수 판별 최적화**  
   - 현재 `isPrime` 는 매 호출마다 `Math.sqrt` 를 계산한다. `int limit = (int)Math.sqrt(n); for (int i=2; i<=limit; i++)` 로 한 번만 계산하도록 하면 약간의 성능 향상이 있다.  
   - 짝수인 경우를 미리 걸러내고, 2 이후에는 홀수만 검사하도록 하면 반복 횟수를 절반으로 줄일 수 있다.  

   ```java
   public boolean isPrime(int n) {
       if (n < 2) return false;
       if (n == 2) return true;
       if (n % 2 == 0) return false;
       int limit = (int)Math.sqrt(n);
       for (int i = 3; i <= limit; i += 2) {
           if (n % i == 0) return false;
       }
       return true;
   }
   ```

2. **불필요한 `System.out.println` 제거**  
   - 디버깅용 출력은 제출 코드에 남겨두면 시간 초과 혹은 출력 제한에 걸릴 수 있다.  

3. **빈도 1에 대한 처리 간소화**  
   - 현재 `if (map.get(key) == 1) continue;` 로 건너뛰지만, `isPrime(1)` 이 `false` 이므로 별도 체크 없이 `if (!isPrime(freq)) return false;` 로도 충분하다. 다만 문제 요구사항에 “빈도 1은 무시”라면 현재 로직이 명시적이라 가독성이 좋다.  

4. **전체 로직을 한 번의 순회로 통합 가능**  
   - 빈도 카운팅과 동시에 소수 여부를 판단하려면 두 번의 순회를 하나로 합칠 수 있다. 하지만 가독성과 유지보수성을 위해 현재와 같이 두 단계로 나누는 것이 더 명확하다.  

5. **제네릭 타입 명시**  
   - `Map<Integer, Integer> map = new HashMap<>();` 와 같이 선언은 좋지만, `import java.util.*;` 가 없으면 컴파일 오류가 발생한다. 파일 상단에 필요한 import 문을 명시해 두는 것이 좋다.  

**요약**  
전체적으로 알고리즘은 올바르고 구현도 깔끔합니다. 소수 판별 부분을 약간 최적화하고 디버깅 출력을 제거한다면 더욱 효율적인 코드가 됩니다. 현재 코드도 문제의 제약 조건(배열 길이 ≤ 10⁵ 정도)에서는 충분히 통과할 수준입니다.
