# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 5:06:59 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.5 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/number-of-senior-citizens/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(N)** : `details` 배열의 길이를 N이라 할 때, 각 문자열을 한 번씩 순회하면서 `substring`·`parseInt` 를 수행합니다. 문자열 길이는 고정(최소 8자 이상)이라 간주하면 각 원소당 O(1) 연산이므로 전체 복잡도는 선형입니다.

**2. 공간 복잡도**  
- **O(1)** : 추가적인 동적 메모리를 거의 사용하지 않습니다. `cnt`와 `age`라는 몇 개의 정수 변수만 사용하고, `substring`이 반환하는 새로운 문자열은 JVM 내부에서 일시적으로 생성되지만 입력 크기에 비례하지 않으므로 상수 공간으로 간주합니다.

**3. 풀이 접근법**  
- 문자열에서 나이 부분을 직접 추출(`substring`)하고 정수로 변환(`Integer.parseInt`)한 뒤, 60 초과 여부를 판단하는 **그리디/직접 파싱** 방식입니다. 문제에서 제시한 포맷(마지막 4자리 중 앞 두 자리가 나이) 그대로 활용했습니다.

**4. 잘된 점**  
- **간결함**: 불필요한 변수나 복잡한 로직 없이 한 줄로 나이를 추출하고 판단합니다.  
- **가독성**: `for‑each` 문과 의미 있는 변수명(`cnt`, `age`)을 사용해 흐름이 명확합니다.  
- **정확성**: 문자열 인덱스를 정확히 지정해 나이 부분만을 파싱하므로 요구사항을 정확히 만족합니다.

**5. 개선 사항**  
1. **인덱스 경계 안전성**  
   - 현재 구현은 입력 문자열이 최소 8자 이상이라고 가정합니다. LeetCode에서는 보통 보장되지만, 실제 서비스 코드라면 `str.length() >= 4` 등을 체크해 `StringIndexOutOfBoundsException`을 방지하는 방어 코드를 추가하는 것이 좋습니다.  

2. **`substring` 대신 `char` 직접 변환**  
   - `substring`은 새로운 문자열 객체를 생성하므로(작은 오버헤드) `charAt`을 이용해 두 자리 숫자를 직접 계산하면 메모리 할당을 피할 수 있습니다. 예시:  
     ```java
     int age = (str.charAt(str.length() - 4) - '0') * 10
             + (str.charAt(str.length() - 3) - '0');
     ```  
   - 이 방법은 여전히 O(1) 시간·공간이지만 미세하게 더 빠르고 메모리 사용을 최소화합니다.

3. **상수 정의**  
   - `60`과 `2` 같은 매직 넘버를 의미 있는 `static final` 상수(`SENIOR_AGE = 60`, `AGE_START_OFFSET = 4`) 로 바꾸면 유지보수가 쉬워집니다.

4. **스트림 활용 (선택 사항)**  
   - Java 8 이상이라면 스트림을 이용해 한 줄로 구현할 수 있습니다. 가독성은 개인 취향에 따라 다르지만, 예시:  
     ```java
     return (int) Arrays.stream(details)
                        .mapToInt(s -> Integer.parseInt(s.substring(s.length() - 4, s.length() - 2)))
                        .filter(age -> age > SENIOR_AGE)
                        .count();
     ```  
   - 성능 차이는 미미하지만, 함수형 스타일을 선호한다면 고려해볼 수 있습니다.

전반적으로 코드가 매우 깔끔하고 요구사항을 정확히 만족합니다. 위 개선점을 적용하면 안정성과 미세 성능 최적화를 동시에 얻을 수 있습니다.
