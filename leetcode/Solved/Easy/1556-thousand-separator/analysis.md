# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 27. 오후 5:05:23 |
| Language | java |
| Runtime | 0 ms (Beats 0.0%) |
| Memory | 42.5 MB (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/thousand-separator/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: O(log n) - DecimalFormat의 format 메서드는 입력 숫자의 자릿수에 비례하는 시간 복잡도를 가지므로, 숫자의 자릿수가 많아질수록 시간 복잡도는 선형적으로 증가합니다. replace 메서드도 문자열의 길이에 비례하는 시간 복잡도를 가지므로, 전체 시간 복잡도는 O(log n)입니다.

2. **공간 복잡도**: O(log n) - DecimalFormat과 문자열의 생성으로 인해 공간 복잡도는 입력 숫자의 자릿수에 비례합니다.

3. **풀이 접근법**: DecimalFormat을 사용하여 숫자에 천 단위 구분자를 추가하고, 이후 replace 메서드를 사용하여 ','를 '.'로 대체하는 알고리즘을 사용했습니다. 이는 간단하고 직관적인 접근법입니다.

4. **잘된 점**: 코드는 간결하고 이해하기 쉽습니다. DecimalFormat을 사용하여 숫자 형식을 쉽게 지정할 수 있으며, replace 메서드를 사용하여 천 단위 구분자를 쉽게 변경할 수 있습니다.

5. **개선 사항**: DecimalFormat을 사용하면 숫자 형식을 지정할 수 있지만, 이 방법은 다소 비효율적일 수 있습니다. 대안적으로, 숫자를 문자열로 변환하고, 뒤에서부터 천 단위 구분자를 추가하는 방식을 사용할 수 있습니다. 예를 들어, 다음과 같은 코드를 사용할 수 있습니다.
```java
public String thousandSeparator(int n) {
    String str = String.valueOf(n);
    StringBuilder sb = new StringBuilder();
    for (int i = str.length() - 1; i >= 0; i--) {
        if ((str.length() - i) % 3 == 0 && i != 0) {
            sb.append('.');
        }
        sb.append(str.charAt(i));
    }
    return sb.reverse().toString();
}
```
이 방법은 더 효율적이고, DecimalFormat을 사용하지 않아도 됩니다.
