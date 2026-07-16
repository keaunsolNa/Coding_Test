# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 16. 오후 1:57:03 |
| Language | java |
| Runtime | 8 ms (Beats 1.2%) |
| Memory | 43.8 MB (Beats 8.9%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/jewels-and-stones/submissions/)

## Code Review

코드 리뷰를 진행하겠습니다.

1. **시간 복잡도**: O(n*m) - 여기서 n은 보석 문자열(jewels)의 길이, m은 돌 문자열(stones)의 길이입니다. 이유는 보석 문자열의 각 문자마다 돌 문자열을 모두 훑어보아야 하기 때문입니다.

2. **공간 복잡도**: O(n) - 보석 문자열을 문자 배열로 변환하기 때문에, 보석 문자열의 길이만큼의 공간이 필요합니다.

3. **풀이 접근법**: 이 코드는 문자열을 훑어보는 방식의 알고리즘을 사용했습니다. 보석 문자열의 각 문자를 돌 문자열에서 찾는 방식으로, 이는 브루트 포스 알고리즘의 일종입니다.

4. **잘된 점**: 코드는 비교적 간결하고, 문제의 요구 사항을 명확하게 이해하여 구현했습니다. 또한, 자바 8의 스트림 API를 사용하여 코드를 더 읽기 쉽게 만들었습니다.

5. **개선 사항**: 현재 코드는 각 보석 문자를 돌 문자열에서 찾을 때마다 전체 돌 문자열을 훑어보아야 하므로, 시간 복잡도가 O(n*m)입니다. 이를 개선하기 위해, 돌 문자열의 각 문자를 HashSet에 저장하고, 보석 문자열의 각 문자가 HashSet에 포함되는지 확인하는 방식으로 시간 복잡도를 O(n+m)으로 개선할 수 있습니다. 이는 HashSet의 조회 시간이 평균 O(1)이기 때문입니다. 예를 들어, 다음과 같이 구현할 수 있습니다:
```java
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            set.add(c);
        }
        int ans = 0;
        for (char c : stones.toCharArray()) {
            if (set.contains(c)) {
                ans++;
            }
        }
        return ans;
    }
}
```
