# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 28. 오전 10:43:19 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.5 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/defuse-the-bomb/submissions/)

## Code Review

**1. 시간 복잡도**  
- 현재 구현은 두 개의 중첩 루프를 사용합니다. 외부 루프는 `l`(code 길이)번, 내부 루프는 `|k|`번 반복되므로 전체 시간 복잡도는 **O(l·|k|)** 입니다. `k`가 `l`에 비해 큰 경우 최악의 경우 O(l²)까지 증가할 수 있습니다.

**2. 공간 복잡도**  
- 추가로 사용하는 배열은 `result` 하나뿐이며, 입력 배열 `code`를 그대로 사용합니다. 따라서 **O(l)** (출력 배열 크기)이며, 보조적인 변수들은 O(1)입니다.

**3. 풀이 접근법**  
- 슬라이딩 윈도우 개념을 직접 구현하기보다는 각 인덱스마다 `k`만큼 앞(또는 뒤)쪽 원형 인덱스를 순회하면서 합을 구하는 **브루트 포스** 방식입니다. 양수 `k`와 음수 `k`에 대해 각각 별도의 루프를 두어 처리하고 있습니다.

**4. 잘된 점**  
- 원형 인덱스를 계산할 때 `(i + offset) % l` 혹은 `(i + offset + l) % l`을 사용해 배열을 순환하도록 정확히 구현했습니다.  
- `k == 0`인 경우 바로 `result`를 반환해 불필요한 연산을 피한 점이 좋습니다.  
- 코드가 가독성이 높고, 양수·음수 `k`를 명확히 구분해 로직을 이해하기 쉽게 작성했습니다.

**5. 개선 사항**  
1. **시간 최적화**  
   - 슬라이딩 윈도우를 활용하면 전체를 O(l) 시간에 해결할 수 있습니다.  
   - 예를 들어, `k > 0`이면 처음 `k`개의 원소 합을 구한 뒤, 윈도우를 한 칸씩 이동하면서 앞쪽 원소를 빼고 뒤쪽 원소를 더하는 방식으로 `result[i]`를 O(1)에 업데이트할 수 있습니다.  
   - `k < 0`인 경우에도 동일하게 뒤쪽 `|k|`개의 합을 미리 구하고, 윈도우를 역방향으로 이동시키면 됩니다.

2. **불필요한 조건 분기 최소화**  
   - `k`의 부호에 따라 두 개의 별도 루프를 돌리는 대신, `int step = k > 0 ? 1 : -1; int count = Math.abs(k);` 로 하나의 루프로 통합하면 코드가 더 간결해집니다.

3. **변수명 개선**  
   - `l` 보다는 `n` 혹은 `len`이 더 일반적이며, `offset` 대신 `stepIdx` 등 의미를 더 명확히 하는 이름을 쓰면 가독성이 향상됩니다.

4. **예외 상황 처리**  
   - `code`가 `null`이거나 길이가 0인 경우에 대한 방어 코드를 추가하면 더욱 견고합니다.

**예시 최적화 코드 (O(l) 시간)**  

```java
class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];
        if (k == 0) return ans;

        int step = k > 0 ? 1 : -1;
        int cnt = Math.abs(k);
        int sum = 0;

        // 초기 윈도우 합 구하기
        for (int i = 1; i <= cnt; i++) {
            sum += code[(step > 0 ? i : n - i) % n];
        }

        for (int i = 0; i < n; i++) {
            ans[i] = sum;
            // 윈도우 이동: 빼고 더하기
            int outIdx = (i + step + n) % n;
            int inIdx = (i + step * (cnt + 1) + n) % n;
            sum = sum - code[outIdx] + code[inIdx];
        }
        return ans;
    }
}
```

위와 같이 슬라이딩 윈도우를 적용하면 시간 복잡도가 **O(n)** 로 개선됩니다. 기존 구현도 정확하지만, 큰 입력에 대해서는 위와 같은 최적화가 권장됩니다.
