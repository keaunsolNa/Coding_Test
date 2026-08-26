# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 26. 오후 4:36:34 |
| Language | java |
| Runtime | 3 ms (Beats 23.2%) |
| Memory | 42.3 MB (Beats 92.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/day-of-the-week/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(1)**  
  `LocalDate.of`와 `getDayOfWeek`는 내부적으로 연산을 상수 시간에 수행합니다. 입력 크기에 따라 반복이나 재귀가 없으므로 전체 실행 시간은 입력값과 무관하게 일정합니다.

**2. 공간 복잡도**  
- **O(1)**  
  사용되는 객체는 `LocalDate`와 `DayOfWeek` 하나씩이며, 이들은 모두 고정된 크기의 메모리를 차지합니다. 추가적인 동적 메모리 할당이나 컬렉션이 없으므로 공간 사용량도 상수입니다.

**3. 풀이 접근법**  
- Java 8 이상의 `java.time` API를 활용해 날짜를 직접 생성하고, `DayOfWeek` 열거형에서 요일 값을 얻은 뒤 `switch` 표현식으로 문자열을 매핑합니다.  
- 핵심 아이디어는 **표준 라이브러리 활용**이며, 별도의 캘린더 계산 로직을 구현하지 않아도 되는 *라이브러리 의존* 패턴입니다.

**4. 잘된 점**  
- **가독성**: `LocalDate`와 `DayOfWeek`를 사용해 문제를 직관적으로 해결했으며, `switch` 표현식(화살표 형태)으로 요일 문자열 매핑을 간결하게 구현했습니다.  
- **정확성**: 표준 라이브러리를 이용하므로 윤년, 월말 등 복잡한 케이스를 직접 처리할 필요가 없어 오류 가능성이 거의 없습니다.  
- **코드 양**이 매우 짧고 명확합니다.

**5. 개선 사항**  
1. **불필요한 변수 제거**  
   - `dayOfWeekNumber`와 `ans` 변수를 중간에 만들기보다 바로 `switch` 결과를 반환하도록 하면 코드가 더 간결해집니다.  

   ```java
   return switch (date.getDayOfWeek().getValue()) {
       case 1 -> "Monday";
       case 2 -> "Tuesday";
       case 3 -> "Wednesday";
       case 4 -> "Thursday";
       case 5 -> "Friday";
       case 6 -> "Saturday";
       case 7 -> "Sunday";
       default -> throw new IllegalStateException();
   };
   ```

2. **예외 처리**  
   - `default` 케이스가 `null`을 반환하도록 하면 `null`이 반환될 가능성이 남습니다. `LocalDate`와 `DayOfWeek`는 정상적인 입력에 대해 절대 `null`을 반환하지 않으므로, `default`는 `throw` 구문으로 바꾸어 논리적 오류를 조기에 발견하도록 하는 것이 좋습니다.

3. **입력 검증** (선택 사항)  
   - LeetCode에서는 입력이 항상 유효하지만, 실제 서비스 코드라면 `try-catch`로 `DateTimeException`을 잡아 잘못된 날짜 입력에 대한 방어 코드를 추가할 수 있습니다.

4. **불필요한 import**  
   - 현재 코드에서는 `java.time.DayOfWeek`만 사용하고 `java.time.LocalDate`는 필요하지만, `DayOfWeek`를 직접 사용하지 않고 `date.getDayOfWeek()`만으로도 충분합니다. 불필요한 import는 없지만, 코드가 더 간단해질 여지는 있습니다.

전반적으로 표준 API를 적절히 활용한 깔끔한 구현이며, 위와 같은 사소한 리팩터링만 하면 더욱 간결하고 안전한 코드가 됩니다.
