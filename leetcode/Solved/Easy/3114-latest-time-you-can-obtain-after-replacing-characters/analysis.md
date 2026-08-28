# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 4:26:42 |
| Language | java |
| Runtime | 2 ms (Beats 0.0%) |
| Memory | 43 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/latest-time-you-can-obtain-after-replacing-characters/submissions/)

## Code Review

**1. 시간 복잡도**  
- `split(":")` 와 `charAt`, `substring` 연산은 모두 문자열 길이에 비례하는 O(1) (고정 길이 5) 연산입니다.  
- 전체 로직은 입력 문자열을 몇 번 읽고 몇 번 조합하는 정도이므로 **O(1)** 시간 복잡도를 가집니다.

**2. 공간 복잡도**  
- `hour`, `min` 두 개의 새로운 문자열을 만들고, 최종 결과 문자열을 하나 더 생성합니다. 모두 길이가 고정(2~2, 최종 5)인 작은 문자열이므로 **O(1)** 추가 공간을 사용합니다. (입력 문자열 자체는 재사용)

**3. 풀이 접근법**  
- 문자열을 `:` 로 분리한 뒤, 각 자리(`?`)를 가능한 가장 큰 값으로 교체해 “가장 늦은 시간”을 만든다.  
- 조건에 따라 첫 번째 자리와 두 번째 자리의 가능한 범위를 직접 판단하고 문자열을 재구성하는 **그리디(탐욕) 방식**을 사용했습니다.

**4. 잘된 점**  
- 문제의 핵심인 “가능한 가장 큰 시간”을 직접 판단해 교체하는 로직을 간단히 구현했습니다.  
- `charAt`과 `substring`을 이용해 필요한 자리만 교체하는 방식이 직관적이며, 불필요한 반복문을 사용하지 않아 가독성이 좋습니다.  
- `split(":")` 로 시와 분을 명확히 분리한 점이 코드 흐름을 이해하기 쉽게 합니다.

**5. 개선 사항**  

| 문제점 | 개선 방안 |
|--------|-----------|
| **`split(":")` 호출이 두 번** | `String[] parts = s.split(":");` 로 한 번만 호출하고 `hour = parts[0]; min = parts[1];` 로 사용하면 불필요한 문자열 배열 생성을 줄일 수 있습니다. |
| **`substring` 사용 오류** | `hour.substring(1, 1)` 은 빈 문자열을 반환합니다. 두 번째 자리 교체 시 `hour = "1" + hour.charAt(1);` 와 같이 직접 문자 하나를 붙이는 것이 안전합니다. 동일하게 `min.substring(1, 1)` 도 잘못된 사용입니다. |
| **분(min) 두 번째 자리 처리 누락** | 현재 주석 처리된 `min.charAt(1)` 교체 로직이 빠져 있습니다. `if (min.charAt(1) == '?') min = min.substring(0, 1) + "9";` 로 완성해야 합니다. |
| **조건 로직 가독성** | 각 자리마다 가능한 최대값을 구하는 함수를 별도로 만들면 코드가 더 명확해집니다. 예: `char maxHourFirst(char c) { return (c == '?' ? '2' : c); }` 등. |
| **예외 상황 처리** | 입력이 항상 `"??:??"` 형식이라고 가정하지만, 실제 인터페이스에서는 길이 검증이나 `null` 체크를 추가하는 것이 안전합니다. |
| **`System.out.println` 디버그 코드** | 제출 코드에 포함될 필요가 없으니 제거해야 합니다. |

**예시 개선 코드 (간결 버전)**  

```java
class Solution {
    public String findLatestTime(String s) {
        String[] p = s.split(":");
        char h0 = p[0].charAt(0), h1 = p[0].charAt(1);
        char m0 = p[1].charAt(0), m1 = p[1].charAt(1);

        // hour
        if (h0 == '?') h0 = '2';
        if (h1 == '?') {
            h1 = (h0 == '2') ? '3' : '9';
        }

        // minute
        if (m0 == '?') m0 = '5';
        if (m1 == '?') m1 = '9';

        return "" + h0 + h1 + ':' + m0 + m1;
    }
}
```

위와 같이 수정하면 **시간·공간 복잡도는 그대로 O(1)** 이면서 코드 가독성과 안정성이 크게 향상됩니다.
