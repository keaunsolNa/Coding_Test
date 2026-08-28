# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 12:38:33 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.6 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/reformat-phone-number/submissions/)

## Code Review

**1. 시간 복잡도**  
- 전체 문자열을 두 번 `replaceAll` 로 정제하고, 이후에 `while` 루프에서 문자열을 4글자씩 잘라서 `StringBuilder`에 붙입니다.  
- `replaceAll` 은 입력 길이 *n* 에 대해 O(n)이며, 루프에서도 각 문자마다 한 번씩만 처리되므로 전체 시간 복잡도는 **O(n)** 입니다.

**2. 공간 복잡도**  
- `pn` 은 원본 문자열에서 하이픈·공백을 제거한 새 문자열이며, 길이는 최악의 경우 *n* (원본 길이) 입니다.  
- `StringBuilder` 역시 최종 결과 문자열을 저장하므로 O(n) 공간이 필요합니다.  
- 따라서 **O(n)** 의 추가 공간을 사용합니다.

**3. 풀이 접근법**  
- 입력 문자열에서 불필요한 문자(`-`, 공백)를 제거한 뒤, 남은 숫자를 4자리씩 끊어가며 하이픈을 삽입하는 **그리디** 방식입니다.  
- 4자리 이하가 남으면 그대로 붙이고 루프를 종료합니다.

**4. 잘된 점**  
- `replaceAll` 로 전처리를 깔끔하게 수행해 코드가 직관적입니다.  
- `StringBuilder` 를 사용해 문자열 연결 비용을 최소화한 점이 좋습니다.  
- 로직이 간단해 가독성이 높습니다.

**5. 개선 사항**  
1. **조건 로직 오류**  
   - 현재 `if (pn.length() >= 4)` 로 4글자씩 잘라서 붙이고, `else if (pn.length() <= 3)` 로 남은 전체를 붙이고 있습니다.  
   - 문제 요구사항은 남은 길이가 **2** 혹은 **3**일 때는 각각 `XX` 혹은 `XXX` 로, **4**일 때는 `XX-XX` 로 포맷해야 합니다. 현재 구현은 `4` 글자일 때도 `XXXX-` 형태로 남겨 두어 마지막에 불필요한 하이픈이 남을 수 있습니다.

2. **루프 구조 간소화**  
   - `while (true)` 대신 `while (pn.length() > 0)` 로 명시적으로 종료 조건을 표현하면 가독성이 향상됩니다.  
   - 4글자 이하가 남았을 때는 길이에 따라 `2-2`, `3`, `2` 로 나누는 로직을 추가해야 합니다.

3. **`replaceAll` 대신 `replace` 사용**  
   - 정규식이 필요 없는 단순 문자 교체이므로 `number.replace("-", "").replace(" ", "")` 로 바꾸면 약간의 성능 향상이 있습니다.

4. **불필요한 문자열 복사 최소화**  
   - 현재 `pn = pn.substring(4, pn.length());` 로 매 반복마다 새로운 문자열을 만들고 있습니다.  
   - 인덱스를 직접 관리하거나 `char[]` 로 한 번에 변환한 뒤 인덱스로 접근하면 복사를 줄일 수 있습니다. (하지만 O(n) 한계는 변하지 않음)

5. **예외 상황 처리**  
   - 입력이 비어 있거나 숫자만 포함하지 않을 경우를 대비한 검증 로직을 추가하면 더욱 견고합니다.

**수정 예시 (핵심 로직만)**  

```java
class Solution {
    public String reformatNumber(String number) {
        String digits = number.replace("-", "").replace(" ", "");
        StringBuilder sb = new StringBuilder();
        int i = 0, n = digits.length();

        while (n - i > 4) {
            sb.append(digits, i, i + 3).append('-');
            i += 3;
        }

        int remain = n - i;
        if (remain == 4) {
            sb.append(digits, i, i + 2).append('-')
              .append(digits, i + 2, i + 4);
        } else {
            sb.append(digits, i, n);
        }

        return sb.toString();
    }
}
```

- 위 코드는 3-3-…-2-2 혹은 3-3-…-3 형태를 정확히 구현하면서 불필요한 문자열 복사를 최소화합니다.
