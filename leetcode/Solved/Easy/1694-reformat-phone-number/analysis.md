# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 12:40:20 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.8 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/reformat-phone-number/submissions/)

## Code Review

**1. 시간 복잡도**  
- 전체 문자열을 `replaceAll` 로 두 번 수행하고, 이후 `while` 루프에서 문자열을 3칸씩 잘라가며 `StringBuilder`에 추가합니다.  
- `replaceAll` 은 입력 길이 *n* 에 대해 O(n)이며, 루프에서도 각 문자마다 한 번씩만 처리되므로 전체 시간 복잡도는 **O(n)** 입니다.

**2. 공간 복잡도**  
- `pn` 은 원본 문자열에서 하이픈·공백을 제거한 새로운 문자열이며, 길이는 최악의 경우 *n* (입력 길이) 입니다.  
- `StringBuilder` 역시 최종 결과 문자열을 저장하므로 최대 O(n) 크기를 차지합니다.  
- 따라서 **O(n)** 의 추가 공간이 사용됩니다.

**3. 풀이 접근법**  
- 입력 문자열에서 불필요한 문자(`-`, 공백)를 제거한 뒤, 남은 숫자를 3자리씩 끊어가며 포맷팅합니다.  
- 남은 길이가 4인 경우는 `2-2` 로, 3 이하인 경우는 그대로 붙이는 규칙을 `while` 루프와 조건문으로 구현했습니다.  
- 기본적인 **그리디** 방식(가능한 한 많이 3자리 그룹을 만든 뒤 남은 경우를 처리)입니다.

**4. 잘된 점**  
- `replaceAll` 로 전처리를 한 번에 처리해 가독성이 좋습니다.  
- `StringBuilder` 를 사용해 문자열 연결 비용을 최소화했습니다.  
- 조건 분기가 명확해 로직 흐름을 이해하기 쉽습니다.

**5. 개선 사항**  
1. **`replaceAll` 두 번 호출 대신 한 번에 처리**  
   ```java
   String pn = number.replaceAll("[ -]", "");
   ```  
   정규식 하나로 하이픈과 공백을 동시에 제거하면 불필요한 스캔을 줄일 수 있습니다.

2. **루프 내부에서 `substring` 사용 최소화**  
   `substring` 은 새로운 문자열 객체를 생성하므로, 인덱스를 직접 관리하면서 `charAt` 로 `StringBuilder`에 바로 추가하면 메모리 할당을 줄일 수 있습니다. 예시)  
   ```java
   int i = 0;
   while (i + 3 < pn.length()) {
       sb.append(pn, i, i + 3).append('-');
       i += 3;
   }
   // 남은 길이에 따라 처리
   ```

3. **4자리 처리 오류**  
   현재 `else if (pn.length() == 4)` 에서 `sb.append(pn.substring(0, 2)).append("-").append(pn.substring(0, 2));` 로 두 번째 부분을 잘못 사용하고 있습니다. 두 번째 `substring`은 `pn.substring(2, 4)` 이어야 합니다. 즉,  
   ```java
   sb.append(pn, 0, 2).append('-').append(pn, 2, 4);
   ```

4. **무한 루프 방지**  
   현재 `while (true)` 로 무한 루프를 사용하고 있지만, 모든 경우에 `break` 가 보장되지 않으면 무한 루프 위험이 있습니다. `while (i < pn.length())` 와 같이 명시적인 종료 조건을 두는 것이 안전합니다.

5. **코드 간결화**  
   전체 로직을 `StringBuilder`에 직접 append 하는 방식으로 구현하면, `if‑else` 구조를 줄이고 가독성을 높일 수 있습니다. 예시 전체 구현:

   ```java
   class Solution {
       public String reformatNumber(String number) {
           String pn = number.replaceAll("[ -]", "");
           StringBuilder sb = new StringBuilder();
           int i = 0, n = pn.length();

           while (i + 3 < n) {
               sb.append(pn, i, i + 3).append('-');
               i += 3;
           }

           int remain = n - i;
           if (remain == 4) {
               sb.append(pn, i, i + 2).append('-').append(pn, i + 2, i + 4);
           } else {
               sb.append(pn, i, n);
           }

           return sb.toString();
       }
   }
   ```

   이렇게 하면 시간·공간 복잡도는 그대로 O(n) 이면서 코드가 더 명확하고 버그 가능성이 감소합니다.
