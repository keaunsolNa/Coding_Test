# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026-05-10 15:13:08 |
| Language | java |
| Runtime | 18 ms (Beats 25.9%) |
| Memory | 44 MB (Beats 41.2%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/isomorphic-strings/submissions/)

## Code Review

LeetCode의 isomorphic-strings 문제에 대한 풀이를 검토해 보겠습니다.

1. **시간 복잡도**: O(n) - 이 풀이는 두 문자열을 한 번씩 스キャ닝하여 매핑関係을 확인하므로, 시간 복잡도는 입력 문자열의 길이(n) 만큼입니다.
2. **공간 복잡도**: O(n) - 두 개의 HashMap을 사용하여 매핑 관계를 저장하므로, 최악의 경우(모든 문자가 유일하다면) 공간 복잡도는 입력 문자열의 길이(n) 만큼입니다.
3. **풀이 접근법**: 이 풀이는 두 문자열之间의 일대일 매핑 관계를 확인하는 데 HashMap을 사용합니다. 두 문자열을 동시에 스キャ닝하여 매핑关系을 확인하고, 매핑 관계가 일대일인지 확인합니다.
4. **잘된 점**: 코드는 이해하기 쉽고, 알고리즘이 명확하게 구현되어 있습니다. 일대일 매핑 관계를 확인하는 로직이 잘 구현되어 있습니다.
5. **개선 사항**: 이 풀이는_ALREADY 최적화된 풀이이므로, 별도의 개선 사항은 없습니다. 다만, 더 간결한 코드를 원한다면, 다음과 같은 코드로 개선할 수 있습니다.
```java
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] sToT = new int[256];
        int[] tToS = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (sToT[sc] != tToS[tc]) return false;
            sToT[sc] = tToS[tc] = i + 1;
        }

        return true;
    }
}
```
이 개선된 코드는 HashMap을 사용하지 않고, 대신 정적 배열을 사용하여 매핑 관계를 저장합니다. 이는 메모리 사용량을 줄이고, 코드를 더 간결하게 만듭니다.
