# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 12:40:50 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.6 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/reformat-phone-number/submissions/)

## Code Review

**1. 시간 복잡도**  
- 전체 문자열을 `replaceAll` 로 두 번 수행하고, 이후에 `while` 루프에서 문자열을 3칸씩 잘라가며 `StringBuilder`에 추가합니다.  
- `replaceAll` 은 입력 길이 *n* 에 대해 O(n)이며, 루프에서도 각 문자마다 한 번씩만 처리되므로 전체 시간 복잡도는 **O(n)** 입니다.

**2. 공간 복잡도**  
- `pn` 은 원본 문자열에서 하이픈·공백을 제거한 새로운 문자열이며, 길이는 최대 *n* 입니다.  
- `StringBuilder` 역시 최종 결과 문자열을 저장하므로 최악의 경우 O(n) 의 추가 메모리를 사용합니다.  
- 따라서 **O(n)** 의 추가 공간 복잡도를 가집니다.

**3. 풀이 접근법**  
- 입력 문자열에서 불필요한 문자(`-`, 공백)를 제거한 뒤, 남은 숫자를 3자리씩 끊어가며 결과 문자열을 만든다.  
- 남은 길이가 4인 경우는 `2-2` 형태로, 3 이하이면 그대로 붙이는 규칙을 `while` 루프와 조건문으로 구현했습니다.  
- 기본적인 **그리디** 방식(가능한 한 앞에서부터 3자리씩 사용)과 **문자열 슬라이싱**을 이용한 구현입니다.

**4. 잘된 점**  
- `replaceAll` 로 전처리를 한 번에 처리해 코드가 간결합니다.  
- `StringBuilder` 를 사용해 문자열 연결 비용을 최소화했습니다.  
- 3가지 경우(>4, ==4, ≤3)를 명확히 구분해 로직 흐름이 이해하기 쉽습니다.

**5. 개선 사항**  
1. **`replaceAll` 두 번 호출 대신 한 번에 처리**  
   ```java
   String pn = number.replaceAll("[ -]", "");
   ```  
   정규식 하나로 하이픈과 공백을 동시에 제거하면 불필요한 스캔을 줄일 수 있습니다.

2. **`pn.substring(2, 2)` 오류**  
   - `pn.length() == 4` 인 경우 `pn.substring(2, 2)` 는 빈 문자열을 반환합니다. 의도는 `pn.substring(2, 4)` 로 두 번째 블록을 가져와야 합니다. 현재 코드가 테스트에서는 통과할 수 있지만, 가독성과 정확성을 위해 수정이 필요합니다.

3. **루프 대신 인덱스 기반 반복**  
   - `while (true)` 와 `break` 로 흐름을 제어하기보다, 인덱스를 사용해 한 번에 처리하면 코드가 더 명확해집니다. 예시:
   ```java
   int i = 0;
   while (i + 4 < pn.length()) {
       sb.append(pn, i, i + 3).append('-');
       i += 3;
   }
   int remain = pn.length() - i;
   if (remain == 4) {
       sb.append(pn, i, i + 2).append('-').append(pn, i + 2, i + 4);
   } else {
       sb.append(pn.substring(i));
   }
   ```

4. **불필요한 `else if (pn.length() <= 3)`**  
   - 위 조건이 `if`·`else if` 체인 마지막에 위치한다면 `else` 로 바꾸어도 동일합니다.

5. **메서드 접근 제한자**  
   - LeetCode 환경에서는 `public` 이 필요하지만, 실제 프로젝트에서는 `public` 보다 제한된 접근자를 고려할 수 있습니다.

위와 같이 작은 수정만으로 가독성, 정확성, 그리고 약간의 성능 향상을 기대할 수 있습니다. 전체적인 로직은 문제 요구사항을 잘 만족하고 있어 좋은 풀이입니다.
