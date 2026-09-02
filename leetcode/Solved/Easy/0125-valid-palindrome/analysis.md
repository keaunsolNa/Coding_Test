# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 9. 2. 오후 4:35:43 |
| Language | java |
| Runtime | 16 ms (Beats 12.8%) |
| Memory | 46 MB (Beats 33.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/valid-palindrome/submissions/)

## Code Review

**1. 시간 복잡도**  
- `replaceAll` 과 정규식 필터링은 문자열 전체를 한 번씩 스캔하므로 **O(N)** (N = 입력 문자열 길이)  
- `isPalindrom` 에서 양쪽 포인터를 움직이며 비교하므로 역시 **O(N)**  
- 전체 알고리즘은 두 번의 선형 스캔을 수행하므로 **O(N)**  

**2. 공간 복잡도**  
- `replaceAll` 로 만든 새로운 문자열 `str` 은 원본 문자열에서 알파벳·숫자만 남긴 것이므로 최악의 경우 원본과 같은 길이의 문자열을 추가로 저장한다. 따라서 **O(N)** 의 추가 메모리가 필요하다.  
- 포인터 변수와 몇 개의 정수만 사용하므로 스택 공간은 **O(1)**  

**3. 풀이 접근법**  
- **Two‑Pointer** 기법을 사용해 문자열 양끝에서 동시에 문자를 비교한다.  
- 입력 문자열을 먼저 **전처리**(소문자 변환 + 알파벳·숫자만 남기기)하여 비교 대상만 남긴 뒤, 전처리된 문자열에 대해 팰린드롬 검사를 수행한다.  

**4. 잘된 점**  
- 정규식을 활용해 비알파벳·숫자 문자를 한 줄로 깔끔하게 제거한 점이 가독성을 높인다.  
- `Character.toLowerCase` 를 사용해 대소문자를 무시하도록 구현했으며, `isPalindrom` 메서드가 null 체크를 해 안전성을 고려했다.  
- 포인터 이동 로직이 명확하고, `while (left < right)` 조건이 불필요한 비교를 방지한다.  

**5. 개선 사항**  
1. **불필요한 대소문자 변환 제거**  
   - 전처리 단계에서 이미 `toLowerCase()` 로 전체 문자열을 소문자로 만들었으므로 `isPalindrom` 내부에서 다시 `Character.toLowerCase` 를 호출할 필요가 없다.  
2. **추가 메모리 절감**  
   - 새로운 문자열을 만들지 않고 원본 문자열을 그대로 두 포인터가 이동하면서 알파벳·숫자와 대소문자를 건너뛰는 방식으로 구현하면 **O(1)** 추가 공간으로 해결 가능한다. 예시:  
   ```java
   while (left < right) {
       while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
       while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
       if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
           return false;
       left++; right--;
   }
   return true;
   ```  
   - 이렇게 하면 정규식과 `replaceAll` 로 인한 문자열 복사 비용을 없앨 수 있다.  
3. **메서드 명명**  
   - `isPalindrom` 은 오타가 있다. `isPalindrome` 이 더 명확하고 일관된 이름이다.  
4. **null 입력 처리**  
   - 현재 `isPalindrom` 에서만 null 체크를 하고 있다. `isPalindrome` 에서도 `s == null` 인 경우 바로 `false` 를 반환하도록 하면 API 사용 시 예외 상황을 더 일관되게 처리할 수 있다.  

위 개선점을 적용하면 시간·공간 효율이 동일하거나 더 개선되고, 메모리 사용량을 최소화하면서도 가독성을 유지할 수 있다.
