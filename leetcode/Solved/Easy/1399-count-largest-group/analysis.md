# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 27. 오후 5:22:06 |
| Language | java |
| Runtime | 4 ms (Beats 0.0%) |
| Memory | 42.3 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/count-largest-group/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n log n) - 입력 크기 n에 대해, 각 숫자에 대해 자릿수 합을 계산하는 반복문이 실행되며, 이 반복문은 숫자의 자릿수에 비례합니다. 따라서 시간 복잡도는 O(n log n)입니다.

2. **공간 복잡도**: O(n) - 해시 맵을 사용하여 숫자의 자릿수 합을 저장하며, 최악의 경우 모든 숫자의 자릿수 합이 다르면 해시 맵의 크기는 n이 됩니다. 따라서 공간 복잡도는 O(n)입니다.

3. **풀이 접근법**: 이 문제는 해시 맵을 사용하여 숫자의 자릿수 합을 계산하고, 가장 많이 등장하는 자릿수 합을 찾는 알고리즘을 사용합니다. 이는 해시 맵의 키-값 쌍을 이용하여 효율적으로 데이터를 저장하고 조회하는 해시 테이블 패턴입니다.

4. **잘된 점**: 코드는 해시 맵을 사용하여 숫자의 자릿수 합을 효율적으로 계산하고 저장하며, 가장 많이 등장하는 자릿수 합을 찾는 로직이 명확합니다. 또한, 변수 이름이 의미 있게 사용되어 코드의 가독성이 좋습니다.

5. **개선 사항**: 코드에서 while 반복문을 사용하여 숫자의 자릿수 합을 계산하는 부분이 있습니다. 이 부분을 개선하기 위해, 숫자를 문자열로 변환하여 자릿수 합을 계산할 수 있습니다. 또한, System.out.println 문을 제거하여 코드의 성능을 개선할 수 있습니다. 예를 들어, 다음과 같이 코드를 개선할 수 있습니다.
```java
class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            String str = String.valueOf(i);
            for (char c : str.toCharArray()) {
                sum += c - '0';
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        int ans = 0;
        for (int key : map.keySet()) {
            ans = Math.max(ans, map.get(key));
        }

        return ans;
    }
}
```
