# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 22. 오후 3:37:46 |
| Language | java |
| Runtime | 4 ms (Beats 0.0%) |
| Memory | 43 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/set-mismatch/submissions/)

## Code Review

리뷰 대상 코드는 LeetCode의 set-mismatch 문제를 해결하기 위한 자바 솔루션입니다. 

1. **시간 복잡도**: 이 코드의 시간 복잡도는 O(n log n)입니다. 이는 Arrays.sort() 함수를 사용하여 입력 배열을 정렬하는 데 O(n log n)의 시간이 소요되기 때문입니다. 이후 반복문을 통해 각 요소의 빈도를 계산하고 결과를 찾는 데에는 O(n)의 시간이 추가로 소요됩니다.

2. **공간 복잡도**: 이 코드의 공간 복잡도는 O(n)입니다. 이는 입력 배열의 최대값에 기반하여 추가 배열을 생성하기 때문입니다. 최악의 경우, 입력 배열의 크기와 최대값이 동일할 때 공간 복잡도가 O(n)으로 증가합니다.

3. **풀이 접근법**: 이 코드는 정렬과 빈도 계산을 사용하여 문제를 해결합니다. 먼저 입력 배열을 정렬하고, 이후 각 요소의 빈도를 계산하여 중복된 요소와 누락된 요소를 찾습니다. 이는 간단하고 직관적인 접근법이지만, 정렬에 의한 시간 복잡도 증가를 고려해야 합니다.

4. **잘된 점**: 코드는 문제를 해결하기 위한 논리를 명확하게 구현했습니다. 또한, 중간 결과를 출력하여 디버깅을 용이하게 합니다. 코드의 구조도 비교적 간결하여 이해하기 쉽습니다.

5. **개선 사항**: 코드의 시간 복잡도를 개선하기 위해 정렬 없이 해시 테이블을 사용하여 빈도 계산을 수행할 수 있습니다. 이는 O(n)의 시간 복잡도로 문제를 해결할 수 있습니다. 또한, 불필요한 출력 문을 제거하고, 변수 이름을 더 명확하게 변경하여 코드의 가독성을 높일 수 있습니다. 예를 들어, 해시 테이블을 사용하여 빈도 계산을 수행하는 다음과 같은 방법을 고려할 수 있습니다:
```java
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] count = new int[nums.length + 1];
        int[] ans = new int[2];
        
        for (int num : nums) {
            count[num]++;
        }
        
        for (int i = 1; i <= nums.length; i++) {
            if (count[i] == 0) ans[1] = i;
            if (count[i] == 2) ans[0] = i;
        }
        
        return ans;
    }
}
```
이러한 방법은 시간 복잡도를 개선하고 코드의 가독성을 높일 수 있습니다.
