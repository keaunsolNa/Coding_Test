# Analysis

| Item | Value |
|------|-------|
| Submitted | 2026. 7. 20. 오전 9:47:29 |
| Language | oraclesql |
| Runtime | 344 ms (Beats 0.0%) |
| Memory | 0B (Beats 0.0%) |

## Submission

[View on LeetCode](https://leetcode.com/problems/students-and-examinations/submissions/)

## Code Review

코드 리뷰입니다.

1. **시간 복잡도**: 이 쿼리의 시간 복잡도는 O(n log n)입니다. 이유는 GROUP BY와 ORDER BY 연산이 수행되기 때문입니다. GROUP BY 연산은 데이터를 그룹화하고, ORDER BY 연산은 데이터를 정렬하기 때문에 시간 복잡도가 증가합니다.

2. **공간 복잡도**: 이 쿼리의 공간 복잡도는 O(n)입니다. 이유는 쿼리 결과를 저장하기 위한 임시 테이블이 필요하기 때문입니다. 임시 테이블의 크기는 입력 데이터의 크기에 비례합니다.

3. **풀이 접근법**: 이 쿼리는 기본적인 관계형 데이터베이스 쿼리 접근법을 사용합니다. 즉, JOIN과 GROUP BY를 사용하여 데이터를 결합하고 집계합니다. 또한, COUNT 함수를 사용하여 출석한 시험의 수를 계산합니다.

4. **잘된 점**: 이 쿼리는 필요한 데이터를 모두 포함하고 있습니다. 즉, 학생 ID, 학생 이름, 과목 이름, 출석한 시험의 수를 모두 포함하고 있습니다. 또한, GROUP BY와 ORDER BY를 사용하여 데이터를 정렬하고 집계하여 결과를 쉽게 분석할 수 있습니다.

5. **개선 사항**: 이 쿼리는 Oracle의 오래된 JOIN 문법을 사용하고 있습니다. 최신 문법을 사용하여 JOIN을 수행하는 것이 좋습니다. 또한, 인덱스를 생성하여 쿼리 성능을 개선할 수 있습니다. 예를 들어, 다음과 같이 JOIN을 수행할 수 있습니다.
```oraclesql
SELECT T3.student_id
     , T3.student_name
     , T1.subject_name
     , COUNT(T1.subject_name) AS attended_exams
  FROM Subjects T1
  LEFT JOIN Examinations T2 ON T1.subject_name = T2.subject_name
  LEFT JOIN Students T3 ON T2.student_id = T3.student_id
 GROUP BY T1.subject_name, T3.student_id, T3.student_name       
 ORDER BY T3.student_id, T1.subject_name
```
이러한 변경으로 쿼리 성능을 개선하고 코드를 더 읽기 쉽게 만들 수 있습니다.
