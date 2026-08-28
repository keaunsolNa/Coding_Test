# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 12:40:01 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.8 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/reformat-phone-number/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(N)** : 입력 문자열 `number`의 길이를 N이라고 할 때, `replaceAll` 로 하이픈·공백을 모두 제거하는 데 O(N) 시간이 소요됩니다. 이후 `while` 루프에서 문자열을 3·2·2 혹은 3·1·1 등으로 잘라가며 `StringBuilder`에 추가하는 작업도 전체 문자 수만큼 한 번씩만 접근하므로 O(N) 입니다.  

**2. 공간 복잡도**  
- **O(N)** : 정제된 전화번호 `pn`과 결과를 담는 `StringBuilder`가 각각 최대 N개의 문자(또는 N‑1개의 하이픈) 를 저장합니다. 추가적인 보조 변수는 상수 개수이므로 전체 공간은 O(N) 입니다.  

**3. 풀이 접근법**  
- 문자열에서 불필요한 문자(`-`, 공백)를 제거한 뒤, 남은 숫자를 앞에서부터 3자리씩 끊어 `-` 로 연결한다.  
- 남은 길이가 4일 때는 `2-2` 형식으로, 3 이하일 때는 그대로 붙이는 규칙을 적용한다.  
- 이는 **그리디(greedy) 방식**으로, 매 단계에서 가능한 가장 큰 블록(3자리)을 선택하고 남은 길이에 따라 예외 처리를 하는 단순한 시뮬레이션 알고리즘입니다.  

**4. 잘된 점**  
- `replaceAll` 로 한 줄에 불필요한 문자들을 깔끔히 제거해 전처리를 명확히 했습니다.  
- `StringBuilder` 를 사용해 문자열을 누적함으로써 `+` 연산에 비해 효율적인 문자열 합성을 구현했습니다.  
- `while (true)` 루프와 조건 분기를 통해 로직을 직관적으로 나눠 가독성이 좋습니다.  

**5. 개선 사항**  
1. **`replaceAll` 두 번 호출 대신 정규식 하나로 처리**  
   ```java
   String pn = number.replaceAll("[ -]", "");
   ```
   이렇게 하면 한 번의 스캔으로 하이픈·공백을 모두 제거할 수 있어 약간의 성능 향상이 있습니다.

2. **`pn.substring(2, 2)` 오류**  
   - 4자리 경우 `pn.substring(2, 2)` 은 빈 문자열을 반환합니다. 의도는 `pn.substring(2, 4)` (또는 `pn.substring(2)`) 이어야 합니다. 현재 코드가 테스트 케이스에 따라 잘못된 결과를 낼 수 있습니다.  

3. **루프 대신 인덱스 기반 반복**  
   - `while` 안에서 `pn`을 매번 `substring` 으로 재생성하면 새로운 문자열 객체가 생성됩니다.  
   - 인덱스 `i` 를 사용해 원본 `pn`을 한 번만 순회하면 메모리 할당을 최소화할 수 있습니다. 예시:
     ```java
     StringBuilder sb = new StringBuilder();
     int i = 0, len = pn.length();
     while (len - i > 4) {
         sb.append(pn, i, i + 3).append('-');
         i += 3;
     }
     int remain = len - i;
     if (remain == 4) {
         sb.append(pn, i, i + 2).append('-').append(pn, i + 2, i + 4);
     } else {
         sb.append(pn, i, len);
     }
     ```
   - 이렇게 하면 `substring` 호출을 없애고, 전체 시간·공간 복잡도는 동일하지만 상수 팩터가 감소합니다.

4. **조건 순서 정리**  
   - 현재 `else if (pn.length() <= 3)` 가 `else if (pn.length() == 4)` 뒤에 위치해 논리적으로는 맞지만, `<= 3` 대신 `else` 로 바꾸면 불필요한 비교를 하나 줄일 수 있습니다.

위와 같이 작은 수정만으로도 코드의 정확성 및 효율성을 더욱 높일 수 있습니다. 전반적으로 문제 요구사항을 정확히 구현했으며, 가독성도 좋은 편입니다.
