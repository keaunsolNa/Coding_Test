# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 12:42:10 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.7 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/reformat-phone-number/submissions/)

## Code Review

**1. 시간 복잡도**  
- 전체 문자열을 `replaceAll` 로 두 번 수행하고, 이후에 `while` 루프에서 문자열을 3자리씩 잘라가며 `StringBuilder`에 추가합니다.  
- `replaceAll` 은 입력 길이 *n* 에 대해 O(n) 시간, 루프에서도 각 반복마다 `substring` 과 `append` 가 O(1) (substring 은 내부적으로 `offset`과 `count`만 복사) 혹은 O(k) (Java 7+에서는 실제 복사) 이지만 전체적으로 문자열을 한 번씩만 읽으므로 전체 시간 복잡도는 **O(n)** 입니다.

**2. 공간 복잡도**  
- `pn` 은 원본 문자열에서 하이픈·공백을 제거한 새로운 문자열이며, 길이는 최악의 경우 *n* (공백·하이픈이 없을 때).  
- `StringBuilder` 역시 최종 결과 문자열을 저장하므로 최대 *n* 길이.  
- 따라서 추가적인 보조 공간은 입력 크기에 비례하므로 **O(n)** 공간을 사용합니다.

**3. 풀이 접근법**  
- 입력 문자열에서 불필요한 문자(`-`, 공백)를 제거한 뒤, 남은 숫자를 왼쪽부터 3자리씩 끊어가며 포맷팅합니다.  
- 남은 길이가 4인 경우는 `2-2` 로, 3 이하인 경우는 그대로 붙이는 규칙을 `while` 루프와 조건문으로 구현했습니다.  
- 전형적인 **그리디** 방식(가능한 한 앞에서부터 3자리씩 처리)이며, 문자열 슬라이스와 `StringBuilder` 를 이용한 **스트링 빌딩** 패턴을 사용했습니다.

**4. 잘된 점**  
- 입력 전처리를 `replaceAll` 로 간결하게 처리해 가독성이 좋습니다.  
- `StringBuilder` 를 사용해 문자열 연결 비용을 최소화했습니다.  
- 조건 분기가 명확해 `pn.length()` 가 4, ≤3, >4 인 경우를 각각 따로 처리해 로직이 이해하기 쉽습니다.  
- `break` 로 루프를 종료해 불필요한 반복을 방지했습니다.

**5. 개선 사항**  
1. **`replaceAll` 두 번 호출 대신 한 번에 처리**  
   ```java
   String pn = number.replaceAll("[ -]", "");
   ```  
   정규식 하나로 하이픈과 공백을 동시에 제거하면 약간의 성능 향상이 있습니다.

2. **`substring` 의 비용**  
   Java 7 이후 `substring` 은 새로운 문자열을 복사하므로 매 반복마다 O(k) 비용이 발생합니다.  
   전체 길이를 한 번 순회하면서 인덱스를 직접 관리하면 더 효율적입니다. 예시:

   ```java
   StringBuilder sb = new StringBuilder();
   int i = 0, len = pn.length();
   while (len - i > 4) {
       sb.append(pn, i, i + 3).append('-');
       i += 3;
   }
   if (len - i == 4) {
       sb.append(pn, i, i + 2).append('-')
         .append(pn, i + 2, i + 4);
   } else {
       sb.append(pn, i, len);
   }
   ```

   `StringBuilder.append(CharSequence, start, end)` 를 이용하면 복사 없이 바로 추가할 수 있어 메모리 사용량과 실행 시간이 감소합니다.

3. **루프 조건 단순화**  
   현재 `while (true)` 와 여러 `break` 로 흐름을 제어하고 있는데, `while (pn.length() > 4)` 로 루프를 제한하고, 루프 종료 후 남은 부분을 한 번에 처리하면 코드가 더 깔끔해집니다.

4. **불필요한 `else if (pn.length() <= 3)`**  
   위 조건을 `else` 로 바꾸어도 동일합니다. 가독성을 위해 불필요한 비교를 제거할 수 있습니다.

위와 같은 작은 최적화를 적용하면 **시간·공간 복잡도는 그대로 O(n)** 이면서 실제 실행 속도와 메모리 사용량을 조금 더 개선할 수 있습니다. 전체적인 로직은 매우 직관적이며, 문제 요구사항을 정확히 만족하고 있습니다.
