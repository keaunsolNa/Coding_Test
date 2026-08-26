# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 8. 26. 오후 4:35:44 |
| Language | java |
| Runtime | 0 ms (Beats 100.0%) |
| Memory | 42.8 MB (Beats 8.1%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/excel-sheet-column-title/submissions/)

## Code Review

**1. 시간 복잡도**  
- **O(log₍₂₆₎ N)**  
  - `columnNumber` 를 26으로 계속 나누면서 문자 하나씩 만든다. 따라서 반복 횟수는 입력값 N 의 26진법 자리수와 동일하고, 이는 `log₍₂₆₎ N` 에 비례한다.  

**2. 공간 복잡도**  
- **O(log₍₂₆₎ N)** (출력 문자열 길이)  
  - `StringBuilder ans` 에 저장되는 문자 수는 결과 문자열의 길이와 동일하고, 이는 위와 같은 로그 규모이다.  
  - `alp` 배열은 고정 크기 26개의 레퍼런스만 차지하므로 상수 공간이다.  

**3. 풀이 접근법**  
- 1‑based Excel 열 번호를 0‑based 로 변환하기 위해 `columnNumber--` 를 수행한 뒤, 26으로 나눈 나머지를 이용해 알파벳을 선택한다.  
- 선택된 문자를 앞쪽에 삽입(`ans.insert(0, …)`)하여 역순을 바로 맞춘다.  
- 이는 “26진법(하지만 0이 없고 A~Z 로 매핑)” 변환 알고리즘이다.  

**4. 잘된 점**  
- `columnNumber--` 로 1‑based 를 0‑based 로 바꾸는 핵심 아이디어가 정확히 구현돼 있다.  
- `StringBuilder` 를 사용해 문자열을 누적하고, `insert(0, …)` 로 앞에 삽입해 역순을 바로 맞추어 별도 뒤집기 과정을 없앴다.  
- 알파벳 배열을 미리 선언해 가독성을 높였으며, `alp[columnNumber % 26]` 로 인덱스 범위 오류를 방지한다.  

**5. 개선 사항**  
1. **알파벳 배열 생략**  
   - `char` 연산만으로도 충분히 구현 가능하다.  
   ```java
   ans.insert(0, (char)('A' + columnNumber % 26));
   ```  
   - 배열을 만들고 참조하는 비용을 없애고, 코드가 더 간결해진다.  

2. **`insert(0, …)` 대신 `append` 후 뒤집기**  
   - `StringBuilder.insert(0, …)` 는 매 삽입마다 기존 문자열을 이동시키므로 O(k²) (k는 결과 길이) 가 될 가능성이 있다.  
   - 실제 로그 규모이지만, 최악의 경우(예: N = 2³¹‑1) 길이가 7 정도이므로 큰 차이는 없지만, 일반적인 관례는  
   ```java
   while (columnNumber > 0) {
       columnNumber--;
       ans.append((char)('A' + columnNumber % 26));
       columnNumber /= 26;
   }
   return ans.reverse().toString();
   ```  
   - `append` 는 O(1)이며, `reverse()` 가 한 번만 수행돼 전체가 O(k) 로 보장된다.  

3. **입력 검증**  
   - LeetCode에서는 입력이 1 ≤ N ≤ 2³¹‑1 로 보장되지만, 실제 서비스 코드라면 `columnNumber <= 0` 에 대한 방어 코드를 추가하는 것이 좋다.  

4. **불필요한 `String[]` 대신 `char[]`**  
   - 배열을 `String` 대신 `char` 로 선언하면 메모리 사용량이 약간 감소한다.  

**요약**  
현재 구현은 시간·공간 모두 최적 수준에 가깝고, 핵심 로직도 명확하다. 다만 `insert(0, …)` 대신 `append` + `reverse()` 로 바꾸면 조금 더 효율적이며, 알파벳 배열을 `char` 연산으로 대체하면 코드가 더 간결해진다. 이러한 작은 개선을 적용하면 가독성과 성능 면에서 더욱 깔끔한 풀이가 된다.
