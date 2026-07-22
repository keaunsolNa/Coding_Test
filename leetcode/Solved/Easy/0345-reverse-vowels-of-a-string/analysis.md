# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 22. 오후 2:56:06 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.6 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/reverse-vowels-of-a-string/submissions/)

## Code Review

리뷰 대상 코드는 문자열의 모음만을 뒤집는 문제를 해결하는 자바 코드입니다. 

1. **시간 복잡도**: O(n) - 문자열을 두 번 순회합니다. 첫 번째 순회에서는 모음의 인덱스를 찾고, 두 번째 순회에서는 모음을 뒤집습니다. 여기서 n은 문자열의 길이입니다.

2. **공간 복잡도**: O(n) - 문자열을 문자 배열로 변환하고, 모음의 인덱스를 저장하는 리스트를 사용합니다. 최악의 경우, 모든 문자가 모음일 수 있으므로 리스트의 크기는 n이 될 수 있습니다.

3. **풀이 접근법**: 두 개의 포인터(두 개의 인덱스)를 사용하여 문자열의 시작과 끝에서부터 모음을 찾고, 이를 뒤집는 방식입니다. 하지만 코드에서는 리스트를 사용하여 모음의 인덱스를 저장하고, 이를 뒤집는 방식으로 구현되어 있습니다.

4. **잘된 점**: 코드는 문제를 명확하게 이해하고, 모음의 인덱스를 찾는 로직과 이를 뒤집는 로직을 분리하여 구현했습니다. 또한, StringBuilder를 사용하여 문자열을 효율적으로 생성했습니다.

5. **개선 사항**: 현재 코드는 리스트를 사용하여 모음의 인덱스를 저장하고, 이를 뒤집는 방식으로 구현되어 있습니다. 하지만, 두 개의 포인터를 사용하여 문자열의 시작과 끝에서부터 모음을 찾고, 이를 바로 뒤집는 방식으로 구현할 수 있습니다. 이는 리스트를 사용하지 않아 공간 복잡도를 O(1)로 줄일 수 있습니다. 또한, 코드의 가독성을 높이고, 더 효율적인 알고리즘을 사용할 수 있습니다. 

예를 들어, 다음과 같이 구현할 수 있습니다.

```java
class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            if (!isVowel(arr[left])) {
                left++;
            } else if (!isVowel(arr[right])) {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        
        return new String(arr);
    }
    
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
```
