# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 9. 14. 오후 5:14:00 |
| Language | java |
| Runtime | 2 ms (Beats 88.2%) |
| Memory | 44.8 MB (Beats 75.5%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/find-maximum-number-of-string-pairs/submissions/)

## Code Review

**코드 리뷰**

| 항목 | 내용 |
|------|------|
| **시간 복잡도** | `O(n² * m)` <br>외부 루프가 `n`(words.length) 번, 내부 루프가 평균적으로 `n/2` 번 수행됩니다. 각 비교에서 문자열을 뒤집는 `reverse`는 `O(m)`(단어 길이)이고, `equals`도 최악의 경우 `O(m)`이므로 전체는 `O(n²·m)` 입니다. |
| **공간 복잡도** | `O(m)` <br>각 반복마다 `new StringBuilder(...).reverse().toString()` 로 역문자열을 만들기 때문에 최대 단어 길이 `m` 만큼의 임시 문자열이 필요합니다. 그 외 추가적인 자료구조는 사용하지 않으므로 선형이 아닌 상수 공간입니다. |
| **풀이 접근법** | 두 중첩 루프를 이용해 모든 쌍을 검사하고, 현재 단어의 역순이 뒤에 있는 단어와 일치하면 카운트합니다. 문자열 역순을 매번 새로 생성하고, 일치하면 바로 `break` 로 다음 i 로 넘어갑니다. |
| **잘된 점** | - 구현이 직관적이고 이해하기 쉽습니다.<br>- 이미 찾은 쌍을 중복 카운트하지 않기 위해 `break` 로 루프를 종료한 점이 좋습니다.<br>- 길이가 다른 경우를 먼저 검사해 불필요한 `equals` 호출을 방지합니다. |
| **개선 사항** | 1. **시간 최적화**: 현재는 O(n²) 탐색이므로 `n`이 커지면 비효율적입니다. <br>   - 모든 문자열을 해시맵에 저장하고, 각 문자열의 역순이 맵에 존재하는지 O(1) 로 확인하면 전체를 `O(n·m)` 로 줄일 수 있습니다. <br>   - 이미 매칭된 문자열은 제거하거나 방문 표시를 해 중복 매칭을 방지합니다. <br>2. **불필요한 문자열 생성 최소화**: 역문자열을 매번 새로 만들기보다, 한 번 만든 뒤 재사용하거나, `char[]` 로 직접 비교하는 방법을 고려할 수 있습니다. <br>3. **코드 가독성**: 변수명을 `reverseWord` 등으로 명확히 하고, `if (reverse.length() == words[j].length() && reverse.equals(words[j]))` 대신 `reverse.equals(words[j])` 만으로 충분합니다(길이 차이는 `equals` 내부에서 이미 체크됨). <br>4. **예외 처리**: 입력이 `null` 이거나 빈 배열일 경우를 명시적으로 처리하면 더 견고합니다. |

**예시 개선 코드 (HashMap 사용)**

```java
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        if (words == null || words.length == 0) return 0;

        Map<String, Integer> cnt = new HashMap<>();
        for (String w : words) cnt.put(w, cnt.getOrDefault(w, 0) + 1);

        int ans = 0;
        for (String w : words) {
            String rev = new StringBuilder(w).reverse().toString();
            if (cnt.containsKey(rev)) {
                ans++;
                // 현재 단어와 역단어를 각각 하나씩 감소
                cnt.put(w, cnt.get(w) - 1);
                cnt.put(rev, cnt.get(rev) - 1);
                // 0 이하가 되면 맵에서 제거 (선택 사항)
                if (cnt.get(w) == 0) cnt.remove(w);
                if (cnt.getOrDefault(rev, 0) == 0) cnt.remove(rev);
            }
        }
        return ans;
    }
}
```

이렇게 하면 시간 복잡도가 `O(n·m)`, 공간 복잡도가 `O(n·m)`(해시맵에 저장되는 문자열) 로 개선됩니다.
