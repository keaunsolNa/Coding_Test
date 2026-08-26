# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 26. 오후 4:37:09 |
| Language | java |
| Runtime | 2 ms (Beats 96.0%) |
| Memory | 46.9 MB (Beats 71.5%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/lucky-numbers-in-a-matrix/submissions/)

## Code Review

**1. 시간 복잡도**  
- 현재 구현은 행마다 최소값을 찾고(`O(n)`), 그 최소값이 해당 열의 최댓값인지 확인하기 위해 전체 행을 다시 탐색합니다(`O(m)`).  
- 전체 행(`m`)과 열(`n`)에 대해 이 과정을 반복하므로 전체 시간 복잡도는 **O(m · n)** 입니다.  
- 행·열 크기가 동일한 정사각 행렬이라면 **O(N²)** 로 표현할 수 있습니다.

**2. 공간 복잡도**  
- 추가로 사용하는 메모리는 결과를 저장하는 `List<Integer>` 뿐이며, 입력 행렬 외에 별도의 배열이나 매트릭스를 만들지 않습니다.  
- 따라서 **O(k)** (k는 행운의 수 개수, 최악의 경우 O(min(m,n))) 이며, 입력 크기에 비례하지 않는 **O(1)** 에 가깝습니다.

**3. 풀이 접근법**  
- 각 행의 최소값을 찾고, 그 최소값이 속한 열에서 최대값인지 검사하는 **“행 최소 & 열 최대”** 조건을 직접 구현했습니다.  
- 두 번의 중첩 반복문을 이용해 **브루트 포스** 방식으로 조건을 검증합니다.

**4. 잘된 점**  
- 로직이 직관적이고 구현이 간결합니다.  
- `min` 과 `idx` 를 동시에 갱신해 최소값과 열 인덱스를 한 번에 찾는 점이 효율적입니다.  
- 불필요한 객체 생성 없이 기본 자료형만 사용해 메모리 오버헤드를 최소화했습니다.

**5. 개선 사항**  
1. **열 최대값 사전 계산**  
   - 현재는 각 행마다 열 전체를 다시 탐색하므로 중복 연산이 발생합니다.  
   - 첫 번째 패스에서 각 열의 최댓값을 `int[] colMax = new int[n];` 에 미리 저장하면, 두 번째 패스에서는 `O(1)` 로 확인이 가능합니다.  
   - 이렇게 하면 전체 시간 복잡도는 여전히 O(m·n) 이지만, 실제 상수 계수가 감소합니다.

   ```java
   int rows = matrix.length, cols = matrix[0].length;
   int[] colMax = new int[cols];
   Arrays.fill(colMax, Integer.MIN_VALUE);
   for (int i = 0; i < rows; i++) {
       for (int j = 0; j < cols; j++) {
           colMax[j] = Math.max(colMax[j], matrix[i][j]);
       }
   }
   ```

2. **제네릭 타입 명시**  
   - `new ArrayList();` 대신 `new ArrayList<Integer>();` 로 선언해 타입 안전성을 확보합니다.

3. **변수명 개선**  
   - `idx` 보다는 `colIdx` 와 같이 의미를 명확히 하면 가독성이 향상됩니다.

4. **불필요한 `check` 변수 제거**  
   - 조건을 바로 `if (min == colMax[colIdx])` 로 판단하면 코드가 더 간결해집니다.

**예시 개선 코드**

```java
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[] colMax = new int[n];
        Arrays.fill(colMax, Integer.MIN_VALUE);

        // 열 최대값 사전 계산
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                colMax[j] = Math.max(colMax[j], matrix[i][j]);
            }
        }

        List<Integer> res = new ArrayList<>();
        // 각 행의 최소값이 해당 열의 최대값인지 확인
        for (int i = 0; i < m; i++) {
            int rowMin = Integer.MAX_VALUE, colIdx = -1;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < rowMin) {
                    rowMin = matrix[i][j];
                    colIdx = j;
                }
            }
            if (rowMin == colMax[colIdx]) {
                res.add(rowMin);
            }
        }
        return res;
    }
}
```

위와 같이 사전 계산을 도입하면 코드 가독성과 실행 효율이 모두 개선됩니다.
