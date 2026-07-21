# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 21. 오후 3:32:35 |
| Language | java |
| Runtime | 1 ms (Beats 0.0%) |
| Memory | 42.9 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/shortest-completing-word/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(n*m) - 여기서 n은 단어의 개수, m은 licensePlate의 길이입니다. 이유는 각 단어마다 licensePlate의 문자를 하나씩 확인하기 때문입니다.

2. **공간 복잡도**: O(n*m) - 각 단어와 licensePlate의 문자를 저장하기 위한 공간이 필요합니다.

3. **풀이 접근법**: 해시 맵을 사용하여 각 문자의 빈도수를 저장하고, 각 단어와 비교하여 일치하는지 확인하는 방식입니다. 이는 해시 맵의 평균 시간 복잡도가 O(1)인 것을 이용한 것입니다.

4. **잘된 점**: 코드가 읽기 쉽고, 변수명이 명확하여 이해하기 쉽습니다. 또한, 필요한 부분은 모두 구현되어 있습니다.

5. **개선 사항**: 현재 코드는 모든 단어를 확인하고, 그중에서 가장 짧은 단어를 반환합니다. 하지만, 더 짧은 단어가 나온다면, 더 짧은 단어를 바로 반환할 수 있습니다. 따라서, 코드를 개선하여 더 짧은 단어가 나올 때마다 바로 반환하도록 수정할 수 있습니다. 또한, TreeMap을 사용하여 단어의 길이를 키로 사용하고, 값을 단어로 저장하여 더 효율적으로 코드를 작성할 수 있습니다. 

```java
String shortestWord = null;
int minLength = Integer.MAX_VALUE;

for (String word : words) {
    // ...
    if (check && word.length() < minLength) {
        shortestWord = word;
        minLength = word.length();
    }
}

return shortestWord;
```
