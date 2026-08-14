# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 14. 오전 10:44:25 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.6 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/pascals-triangle/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: 이 코드의 시간 복잡도는 O(n^2)입니다. 파스칼의 삼각형을 생성하기 위해 2중 반복문을 사용하기 때문입니다. outer loop는 2부터 numRows까지 반복되고, inner loop는 이전 행의 원소 개수만큼 반복됩니다.

2. **공간 복잡도**: 이 코드의 공간 복잡도는 O(n^2)입니다. 파스칼의 삼각형을 저장하기 위해 2차원 리스트를 사용하기 때문입니다. 각 행의 원소 개수는 1부터 numRows까지 증가합니다.

3. **풀이 접근법**: 이 코드는 동적 프로그래밍(Dynamic Programming) 알고리즘을 사용하여 파스칼의 삼각형을 생성합니다. 이전 행의 원소를 사용하여 다음 행의 원소를 계산하는 방식입니다. 하지만, 이 코드는 이전 행의 원소를 사용하여 다음 행의 원소를 계산할 때, 중간에 잘못된 계산을 수행하고 있습니다. 예를 들어, j가 0이 아니고, j가 이전 행의 마지막 인덱스가 아니면, target에 이전 행의 j-1번째와 j번째 원소를 모두 추가합니다. 하지만, 파스칼의 삼각형에서 각 원소는 이전 행의 두 원소를 더한 값이어야 합니다.

4. **잘된 점**: 이 코드는 파스칼의 삼각형을 생성하는 기본적인 아이디어를 가지고 있습니다. 또한, 이전 행의 원소를 사용하여 다음 행의 원소를 계산하는 방식은 동적 프로그래밍의 핵심 아이디어입니다.

5. **개선 사항**: 이 코드의 계산 로직을 수정하여, 각 원소가 이전 행의 두 원소를 더한 값이 되도록 해야 합니다. 또한, 코드의 가독성을 높이기 위해 변수 이름을 더 명확하게 변경할 수 있습니다. 예를 들어, `first`와 `second`를 `firstRow`와 `secondRow`로 변경할 수 있습니다. 또한, `target`을 `currentRow`로 변경할 수 있습니다. 최종적으로, 이 코드는 다음과 같이 개선될 수 있습니다.
```java
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
}
```
