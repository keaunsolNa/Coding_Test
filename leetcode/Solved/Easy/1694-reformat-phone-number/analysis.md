# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오후 12:41:51 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.5 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/reformat-phone-number/submissions/)

## Code Review

**1. 시간 복잡도**  
- 전체 문자열을 두 번 `replaceAll` 로 정규식 교체하고, 이후에 `while` 루프에서 문자열을 `substring` 으로 잘라가며 처리합니다.  
- `replaceAll` 은 입력 길이 *n* 에 대해 O(n)이며, `substring` 은 Java 7 이후에는 새로운 문자열을 복사하므로 O(k) (k는 잘라낸 길이) 입니다. 루프에서 각 반복마다 3자리 혹은 2자리씩 소비하므로 전체적으로 문자열을 한 번씩만 읽고 복사합니다. 따라서 최악의 경우 **O(n)** 시간 복잡도를 가집니다.

**2. 공간 복잡도**  
- `pn` 과 `StringBuilder sb` 가 각각 입력 길이와 거의 같은 크기의 문자열을 저장합니다. 추가적인 임시 문자열(`temp`)도 최대 3자 정도만 존재합니다.  
- 따라서 사용되는 추가 메모리는 입력 크기에 비례하므로 **O(n)** 공간 복잡도입니다.

**3. 풀이 접근법**  
- 입력 문자열에서 하이픈과 공백을 제거한 뒤, 남은 숫자를 규칙에 맞게 3‑자리, 2‑자리 블록으로 나누어 `-` 로 연결합니다.  
- `while (true)` 루프와 `if‑else` 체인을 이용해 남은 길이에 따라 처리 방식을 달리하는 **그리디** 방식입니다.

**4. 잘된 점**  
- 전처리 단계(`replaceAll`)를 통해 불필요한 문자들을 깔끔히 제거한 점이 좋습니다.  
- `StringBuilder` 를 사용해 문자열을 누적함으로써 `+` 연산에 비해 효율적인 문자열 결합을 구현했습니다.  
- 남은 길이가 4인 경우를 별도로 처리해 “2-2” 규칙을 정확히 적용한 로직이 명확합니다.

**5. 개선 사항**  
1. **정규식 대신 단일 루프**  
   - `replaceAll` 두 번을 호출하면 문자열을 두 번 복사합니다. 한 번의 `for` 루프를 돌면서 숫자만 `StringBuilder` 에 추가하면 전처리를 O(n) 시간·O(n) 공간으로 한 번에 처리할 수 있습니다.  

2. **`substring` 사용 최소화**  
   - 현재 `substring` 으로 남은 문자열을 계속 재할당하고 있는데, 이는 매 반복마다 새로운 문자열을 생성합니다. 인덱스를 관리하면서 `StringBuilder` 에 직접 3자리씩 추가하면 불필요한 복사를 피할 수 있습니다.

3. **4자리 처리 오류**  
   - `pn.substring(2, 2)` 은 항상 빈 문자열을 반환합니다. 의도는 `pn.substring(2, 4)` 로 두 번째 블록을 가져와야 합니다. 현재 코드에서는 결과가 `"-/"` 로 잘못 출력될 위험이 있습니다.  

4. **루프 구조 간소화**  
   - `while (true)` 와 여러 `break` 대신, `for (int i = 0; i < pn.length(); )` 와 같은 인덱스 기반 반복을 사용하면 조건이 명확해지고 가독성이 향상됩니다.  

5. **출력 형식 일관성**  
   - 마지막 블록이 2자리 혹은 3자리일 때는 `-` 를 붙이지 않아야 합니다. 현재 로직은 `sb.append(pn); break;` 로 처리하지만, 앞에서 이미 `-` 를 추가했을 경우 중복될 수 있습니다. 마지막에 `StringBuilder` 의 마지막 문자가 `-` 인지 확인하고 제거하는 후처리를 넣는 것이 안전합니다.

**예시 개선 코드 (핵심 아이디어)**  

```java
class Solution {
    public String reformatNumber(String number) {
        StringBuilder digits = new StringBuilder();
        for (char c : number.toCharArray()) {
            if (c != '-' && c != ' ') digits.append(c);
        }

        StringBuilder ans = new StringBuilder();
        int i = 0, n = digits.length();
        while (n - i > 4) {
            ans.append(digits, i, i + 3).append('-');
            i += 3;
        }
        if (n - i == 4) {
            ans.append(digits, i, i + 2).append('-')
               .append(digits, i + 2, i + 4);
        } else {
            ans.append(digits, i, n);
        }
        return ans.toString();
    }
}
```

위와 같이 수정하면 불필요한 문자열 복사를 없애고, 4자리 처리 버그도 해결되며 전체 로직이 더 간결해집니다.
