# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 9. 2. 오후 4:36:17 |
| Language | java |
| Runtime | 30 ms (Beats 98.1%) |
| Memory | 90.7 MB (Beats 28.3%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/maximum-matching-of-players-with-trainers/submissions/)

## Code Review

**코드 리뷰**

| 항목 | 내용 |
|------|------|
| **시간 복잡도** | `O(N log N + M log M + N + M)` → 정렬 단계가 `O(N log N)` (players)와 `O(M log M)` (trainers)이고, 이후 두 포인터를 이용한 탐색이 각각 `players`와 `trainers`를 한 번씩만 순회하므로 `O(N + M)`이다. 전체적으로는 `O(N log N + M log M)`이 지배한다. |
| **공간 복잡도** | `O(1)` (추가적인 배열이나 리스트를 사용하지 않음). `Arrays.sort`는 입력 배열을 제자리 정렬하므로 별도 힙 메모리는 거의 사용되지 않는다. |
| **풀이 접근법** | - **그리디 + 두 포인터**<br>  1. 선수와 트레이너의 능력치를 각각 오름차순 정렬.<br>  2. 가장 약한 선수부터 가능한 가장 작은 트레이너와 매칭한다. <br>  3. 매칭이 성공하면 트레이너 인덱스를 한 칸 이동시켜 이미 사용된 트레이너를 건너뛴다. <br> 이 방식은 “가능한 한 작은 자원을 사용해 현재 요구를 만족시키는” 그리디 전략이며, 정렬 후 두 포인터를 순차적으로 이동시키는 전형적인 패턴이다. |
| **잘된 점** | 1. **정렬 후 그리디** 접근을 정확히 사용해 문제를 최적의 시간에 해결하고 있다.<br>2. `startIdx`(트레이너 포인터)를 유지함으로써 이미 매칭된 트레이너를 다시 검사하지 않아 불필요한 반복을 방지한다.<br>3. 코드가 간결하고 가독성이 좋다 – 변수명(`grid`, `size`)이 의미를 충분히 전달한다. |
| **개선 사항** | 1. **이중 `for`문 대신 두 포인터 사용**<br>   현재 내부 `for`문은 `startIdx`부터 끝까지 탐색하지만, 외부 루프가 진행될 때마다 `j`를 0부터 다시 시작한다 형태가 아니다. 실제로는 `while (i < players.length && j < trainers.length)` 형태로 구현하면 더 직관적이고, `break` 없이도 한 번의 루프만으로 매칭을 처리할 수 있다.<br>   ```java\n   int i = 0, j = 0, ans = 0;\n   while (i < players.length && j < trainers.length) {\n       if (players[i] <= trainers[j]) { ans++; i++; j++; }\n       else { j++; }\n   }\n   ```\n   이렇게 하면 코드 라인이 줄어들고, `break`에 의한 흐름 전환이 사라져 가독성이 향상된다.\n> 2. **변수명 개선**<br>   `grid`와 `size`보다는 `playerSkill` / `trainerSkill` 같은 이름이 더 명확하다.\n> 3. **예외 상황 처리**<br>   입력 배열이 `null`이거나 길이가 0인 경우를 명시적으로 처리하면 함수 사용 시 안전성이 높아진다 (LeetCode에서는 보통 필요 없지만, 실제 서비스 코드에서는 권장).<br>4. **불필요한 `break` 사용 최소화**<br>   현재 `break`는 내부 `for`문을 탈출하기 위해 사용되는데, 위의 두 포인터 방식으로 바꾸면 `break` 자체가 사라진다. |

**요약**  
정렬 후 그리디 매칭을 올바르게 구현했으며, 시간·공간 복잡도 모두 최적 수준이다. 다만 이중 `for`문 대신 전형적인 두 포인터 `while` 루프로 바꾸면 코드가 더 간결하고 직관적이며, 약간의 성능 향상(불필요한 반복 검사 감소)도 기대할 수 있다. 전체적인 설계는 매우 훌륭하다.
