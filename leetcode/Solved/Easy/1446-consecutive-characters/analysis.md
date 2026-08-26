# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 26. 오후 4:31:12 |
| Language | java |
| Runtime | 1 ms (Beats 100.0%) |
| Memory | 43.4 MB (Beats 44.9%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/consecutive-characters/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(N)** : 문자열을 한 번만 순회하면서 연속된 문자의 길이를 계산합니다. 여기서 N은 입력 문자열 `s`의 길이입니다. 반복문 내부 연산은 모두 O(1)이며, 추가적인 반복이 없으므로 선형 시간 복잡도를 가집니다.

**2. 공간 복잡도**  
- **O(N)** 로 보일 수 있지만 실제로는 **O(1)** 입니다.  
  - `char[] arr = s.toCharArray();` 로 문자열을 배열로 복사하지만, 자바에서는 `toCharArray()`가 새로운 배열을 만들기 때문에 입력 길이 N 만큼의 추가 메모리를 사용합니다. 그러나 이 문제에서는 입력 문자열 자체를 복사하지 않고 `charAt`만 사용해도 충분하므로, 복사를 없애면 **O(1)** 로 최적화할 수 있습니다.

**3. 풀이 접근법**  
- **단일 스캔 + 카운터** 패턴을 사용했습니다.  
  - 현재 문자와 이전 문자를 비교해 동일하면 현재 연속 길이(`size`)를 증가시키고, 다르면 현재까지의 연속 길이를 `ans`와 비교해 최대값을 갱신합니다.  
  - 마지막에 남은 연속 구간을 한 번 더 비교해 최종 답을 반환합니다.

**4. 잘된 점**  
- 로직이 직관적이고 가독성이 좋습니다.  
- `Math.max`를 이용해 최대값을 갱신하는 부분이 명확합니다.  
- 초기값을 `ans = 1`, `size = 1` 로 설정해 빈 문자열이 아닌 경우에 대한 처리를 깔끔히 했습니다. (문제에서 빈 문자열이 입력되지 않음을 가정)

**5. 개선 사항**  
1. **불필요한 배열 생성 제거**  
   ```java
   // 기존
   char[] arr = s.toCharArray();
   for (int i = 1; i < arr.length; i++) { ... }
   ```
   대신 `s.charAt(i)` 를 직접 사용하면 추가 메모리를 절약할 수 있습니다.
   ```java
   for (int i = 1; i < s.length(); i++) {
       char cur = s.charAt(i);
       ...
   }
   ```

2. **빈 문자열 방어 코드**  
   현재 구현은 `s.charAt(0)` 에서 `StringIndexOutOfBoundsException`이 발생할 수 있습니다.  
   ```java
   if (s == null || s.isEmpty()) return 0;
   ```

3. **변수명 개선**  
   - `size` → `currLen` (현재 연속 길이)  
   - `ans` → `maxLen` (최대 연속 길이)  
   이렇게 하면 코드 의미가 더욱 명확해집니다.

4. **한 번의 `Math.max` 호출로 정리**  
   루프 내부와 루프 종료 후 각각 `Math.max`를 호출하는 대신, 루프 마지막에 한 번만 호출하도록 할 수 있습니다.
   ```java
   maxLen = Math.max(maxLen, currLen);
   ```

**수정된 예시 코드**  
```java
class Solution {
    public int maxPower(String s) {
        if (s == null || s.isEmpty()) return 0;

        int maxLen = 1;
        int currLen = 1;
        char prev = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == prev) {
                currLen++;
            } else {
                maxLen = Math.max(maxLen, currLen);
                currLen = 1;
            }
            prev = cur;
        }
        return Math.max(maxLen, currLen);
    }
}
```

위와 같이 수정하면 **시간 O(N), 공간 O(1)** 로 최적화된 구현이 됩니다.
