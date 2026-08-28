# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 12:38:49 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.9 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/reformat-phone-number/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(N)**  
  `replaceAll` 로 하이픈과 공백을 제거하는 과정과 `while` 루프에서 문자열을 3글자씩 잘라가며 `StringBuilder`에 추가하는 과정 모두 입력 문자열 길이 N에 비례합니다. 각 단계에서 문자열을 복사하는 연산이 상수 횟수만큼 일어나므로 전체 시간 복잡도는 선형입니다.

**2. 공간 복잡도**  
- **O(N)**  
  `pn` 에는 원본 문자열에서 하이픈·공백을 제거한 새로운 문자열이 저장되고, `StringBuilder sb` 에는 최종 결과 문자열이 누적됩니다. 두 문자열 모두 최악의 경우 입력 길이와 동일한 크기를 차지하므로 추가적인 보조 공간은 O(N) 입니다.

**3. 풀이 접근법**  
- 문자열 전처리 후, 남은 숫자를 3자리씩 끊어 `-` 로 연결하는 **그리디** 방식.  
- 남은 길이가 4 이하가 되면 바로 붙이고 루프를 종료하는 단순 반복 구조.

**4. 잘된 점**  
- `replaceAll` 로 불필요한 문자들을 한 줄에 깔끔히 제거한 점이 가독성을 높입니다.  
- `StringBuilder` 를 사용해 문자열을 누적함으로써 `+` 연산에 비해 효율적인 문자열 결합을 구현했습니다.  
- 로직이 직관적이라 코드 흐름을 이해하기 쉽습니다.

**5. 개선 사항**  
1. **조건 분기 간소화**  
   현재 `if (pn.length() >= 4) … else if (pn.length() <= 3)` 로 두 번 검사하고 있는데, `else` 로 충분합니다. 또한 4인 경우는 `3-1` 형태가 아니라 `2-2` 로 처리해야 하는데, 현재 구현은 4자리 남았을 때도 `3-` 로 잘라 버려 요구사항을 만족하지 못합니다.  
2. **4자리 처리 로직 추가**  
   요구사항에 따르면 남은 숫자가 4자리이면 `xx-xx` 로 출력해야 합니다. 따라서 `pn.length() == 4` 인 경우를 별도로 처리하거나, 루프 종료 전 `sb.append(pn.substring(0,2)).append("-").append(pn.substring(2))` 와 같이 처리해야 합니다.  
3. **`replaceAll` 대신 `replace` 사용**  
   정규식이 필요 없는 단순 문자 교체이므로 `number.replace("-", "").replace(" ", "")` 로 바꾸면 약간의 성능 향상이 있습니다.  
4. **불필요한 `while (true)` 대신 `for` 혹은 `while (pn.length() > 0)`**  
   명시적인 종료 조건을 넣어 가독성을 높이고, 무한 루프 구조를 피할 수 있습니다.  

**예시 개선 코드 (핵심 부분만)**  

```java
public String reformatNumber(String number) {
    String pn = number.replace("-", "").replace(" ", "");
    StringBuilder sb = new StringBuilder();

    int i = 0;
    while (pn.length() - i > 4) {
        sb.append(pn, i, i + 3).append("-");
        i += 3;
    }

    int remain = pn.length() - i;
    if (remain == 4) {
        sb.append(pn, i, i + 2).append("-").append(pn, i + 2, i + 4);
    } else {
        sb.append(pn.substring(i));
    }
    return sb.toString();
}
```

위와 같이 4자리 경우를 정확히 처리하고, 불필요한 무한 루프와 정규식 사용을 제거하면 코드가 더 견고하고 효율적입니다.
