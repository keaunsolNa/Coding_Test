# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026-04-20 22:16:11 |
| Language | java |
| Runtime | 2 ms (Beats 13.6%) |
| Memory | 42.6 MB (Beats 29.2%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/mirror-distance-of-an-integer/submissions/)

## Code Review

## LeetCode 풀이 코드 리뷰: `mirror-distance-of-an-integer`

안녕하세요! `mirror-distance-of-an-integer` 문제 풀이에 대한 코드 리뷰입니다.

### 1. 시간 복잡도

*   **O(log N)**
*   **설명:** 이 풀이의 주요 연산은 정수 `n`을 문자열로 변환하고, 뒤집고, 다시 정수로 변환하는 과정입니다. 정수 `n`의 자릿수(길이)는 `log₁₀ N`에 비례합니다. 문자열 변환, 뒤집기, 그리고 다시 정수 변환 모두 문자열의 길이에 선형적으로 비례하는 시간을 소요하므로, 전체 시간 복잡도는 `O(log N)`이 됩니다.

### 2. 공간 복잡도

*   **O(log N)**
*   **설명:** 입력 정수 `n`을 문자열로 저장하기 위해 `StringBuilder` 객체를 생성합니다. 이 문자열의 길이는 `n`의 자릿수에 비례하므로 `log₁₀ N`과 같습니다. 따라서 필요한 공간은 `O(log N)`입니다.

### 3. 풀이 접근법

*   이 풀이는 주어진 정수 `n`을 문자열로 변환한 다음, `StringBuilder`의 `reverse()` 메서드를 사용하여 문자열을 뒤집습니다. 뒤집힌 문자열을 다시 정수로 변환한 후, 원래 정수 `n`과의 절댓값 차이를 계산하여 반환합니다.

### 4. 잘된 점

*   **간결함:** 코드가 매우 간결하고 한 줄로 핵심 로직을 표현하여 가독성이 좋습니다.
*   **Java API 활용:** `StringBuilder`의 `reverse()` 메서드와 `Math.abs()`를 적절히 활용하여 효율적인 문자열 조작 및 수학적 계산을 수행했습니다.

### 5. 개선 사항

*   **음수 처리 (엣지 케이스 고려):** 문제 설명에 `n`이 양의 정수라고 명시되어 있다면 문제가 없지만, 만약 `n`이 음수일 가능성이 있다면 현재 풀이는 예상치 못한 결과를 초래할 수 있습니다. 예를 들어 `n = -123`인 경우, `Integer.toString(-123)`은 `"-123"`이 되고 뒤집으면 ` "321-"`이 됩니다. `Integer.parseInt("321-")`는 `NumberFormatException`을 발생시킵니다. 음수를 처리해야 한다면, 먼저 부호를 따로 저장하고, 절댓값에 대해 뒤집기 연산을 수행한 뒤 다시 부호를 붙이는 방식이 필요합니다.
*   **오버플로우 가능성 (int 타입):** 뒤집힌 숫자가 `Integer.MAX_VALUE`를 초과할 경우 `Integer.parseInt()`에서 `NumberFormatException`이 발생합니다. (예: `n = 2147483647`인 경우 뒤집으면 `7463847412`가 되어 `int` 범위를 넘어섭니다.) 문제의 제약 조건에 따라 `n`의 범위가 충분히 작다면 문제가 없겠지만, 그렇지 않다면 `long` 타입이나 예외 처리를 고려해야 합니다.
*   **수학적 접근 (대안):** 문자열 변환 없이 순수하게 수학적인 방법으로 숫자를 뒤집을 수도 있습니다. 이는 때때로 문자열 변환보다 성능상 이점이 있을 수 있습니다 (특히 매우 긴 숫자이지만 언어의 문자열 처리 오버헤드가 큰 경우).

    ```java
    class Solution {
        public int mirrorDistance(int n) {
            int originalN = n;
            int reversedN = 0;

            // 음수 처리 (옵션)
            if (n < 0) {
                // 부호를 저장하고 양수로 변환하여 뒤집기
                // 이 예시에서는 양수만 처리한다고 가정합니다.
                // return -mirrorDistance(-n); 와 같이 처리할 수도 있습니다.
            }

            while (n > 0) {
                int digit = n % 10;
                // 오버플로우 검사 (선택 사항이지만 안전성 향상)
                if (reversedN > Integer.MAX_VALUE / 10 || 
                    (reversedN == Integer.MAX_VALUE / 10 && digit > 7)) {
                    // 오버플로우 처리 (예: 예외 발생 또는 특정 값 반환)
                    // 여기서는 문제의 조건에 따라 int 범위 내라고 가정합니다.
                }
                reversedN = reversedN * 10 + digit;
                n /= 10;
            }
            return Math.abs(originalN - reversedN);
        }
    }
    ```
    이 수학적 접근 방식은 `StringBuilder` 객체 생성 및 문자열 변환 오버헤드가 없으므로 미세한 성능 향상을 기대할 수 있습니다. 공간 복잡도는 `O(1)`이 됩니다.

전반적으로, 현재 코드는 문제의 제약 조건과 예상되는 입력에 대해 명확하고 효과적인 해결책을 제시합니다. 음수와 오버플로우와 같은 엣지 케이스를 명확히 하고 싶거나, 순수하게 수학적인 접근 방식을 선호한다면 개선 사항을 고려해 볼 수 있습니다.
